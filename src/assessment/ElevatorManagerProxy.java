package assessment;

import elevator.Elevator;
import elevator.IElevator;
import elevator.IElevatorManager;
import people.IElevatorTrip;

public class ElevatorManagerProxy {
	private IElevator[] elevators;
	private IElevatorManager elevatorManager;
	ElevatorManagerProxy(IElevatorManager em, Difficulty d){
		elevatorManager = em;
		elevators = new Elevator[d.getElevatorCount()];
		elevatorManager.setElevators(elevators);
	}

	public void takeRequest(IElevatorTrip et){
		//record the trip
		System.out.println("Still need to record the trip, dummy");
		handleRequest(et);
	}
	public void handleRequest(IElevatorTrip r){
		elevatorManager.handleRequest(r);
	}

}
