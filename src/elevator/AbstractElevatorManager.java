package elevator;

import people.IRequest;

public abstract class AbstractElevatorManager {
	AbstractElevatorManager(){
		
	}

	public abstract void handleRequest(IRequest r);

}
