package elevator;

public interface IElevator {
	public enum ElevatorState{
		DoorsOpen,
		GoingUp,
		GoingDown
	}

	public abstract int getNumber();
	public abstract int getFloor();
	public abstract int getNumPassengers();
	public abstract ElevatorState getState();
}
