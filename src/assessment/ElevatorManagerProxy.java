package assessment;

import java.util.ArrayList;
import java.util.List;

import elevator.Elevator;
import elevator.IElevator;
import elevator.IElevatorManager;
import elevator.Request;
import people.IElevatorTrip;

public class ElevatorManagerProxy {
	private List<IElevator> elevators;
	private IElevatorManager elevatorManager;
	private List<Request> requests;
	ElevatorManagerProxy(IElevatorManager em, Difficulty d){
		elevatorManager = em;
		elevators = elevatorManager.getElevators(d);
		requests = new ArrayList<Request>();
	}

	public void takeRequest(IElevatorTrip et){
		//record the trip
		System.out.println("Still need to record the trip, dummy");
		cycle();
	}
	public void cycle(){
		elevatorManager.receiveRequests(requests);
		elevatorManager.cycle();
		for(IElevator elevator : elevators){
			System.out.println("Elevator Num: \t" + elevator.getNumber());
			System.out.println("\tFloor " + elevator.getFloor());
			System.out.println("\t" + elevator.getNumPassengers() + " passengers");
		}
		
	}

}
