package elevator;

public class Elevator implements IElevator{
	
	private static int nextNumber = 0;
	private int number;
	private int floor;
	private int numPassengers;
	private ElevatorState state;
	
	public Elevator (){
		setNumber(nextNumber++);
		setFloor(0);
		setNumPassengers(0);
		setState(ElevatorState.DoorsOpen);
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public int getFloor() {
		return floor;
	}

	@Override
	public int getNumPassengers() {
		return numPassengers;
	}

	@Override
	public ElevatorState getState() {
		return state;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public void setState(ElevatorState state) {
		this.state = state;
	}

}
