package elevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import assessment.Difficulty;

/**
 * User interacts with this class via a proxy. 
 * ElevatorManager is the class that actually is allowed to instruct the elevators concerning what to do. 
 * @author Trent
 *
 */
public class ElevatorManager implements IElevatorManager{
	
	private List<IElevator> elevators = null;
	private List<Request> requests = null;
	
	@Override
	public List<IElevator> getElevators(Difficulty d) {
		if(elevators == null){
			elevators = new ArrayList<IElevator>();
			for(int i = 0; i < d.getElevatorCount(); ++i){
				elevators.add(new Elevator());
			}
			assert(elevators != null && elevators.size() == d.getElevatorCount());
		}
		return elevators;
	}

	@Override
	public void receiveRequests(List<Request> requests) {
		this.requests = requests;
	}

	@Override
	public void cycle() {
		// TODO Auto-generated method stub
		
	}

}
