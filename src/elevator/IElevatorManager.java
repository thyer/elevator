package elevator;

import people.IElevatorTrip;

public interface IElevatorManager{
	public abstract void handleRequest(IElevatorTrip r);

	public abstract void setElevators(IElevator[] elevators);

}
