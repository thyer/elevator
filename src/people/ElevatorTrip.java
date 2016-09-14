package people;

public class ElevatorTrip implements IElevatorTrip{
	private int time;
	private int departureFloor;
	private int arrivalFloor;

	public ElevatorTrip(int time, int departureFloor, int arrivalFloor) {
		this.time = time;
		this.departureFloor = departureFloor;
		this.arrivalFloor = arrivalFloor;
	}

	@Override
	public int getTime() {
		return time;
	}

	@Override
	public int getDepartureFloor() {
		return departureFloor;
	}

	@Override
	public int getArrivalFloor() {
		return arrivalFloor;
	}

}
