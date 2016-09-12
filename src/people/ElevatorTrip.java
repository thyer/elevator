package people;

public class ElevatorTrip {
	private double time;
	private int departureFloor;
	private int arrivalFloor;

	public ElevatorTrip(double time, int departureFloor, int arrivalFloor) {
		this.time = time;
		this.departureFloor = departureFloor;
		this.arrivalFloor = arrivalFloor;
	}

	public double getTime() {
		return time;
	}

	public int getDepartureFloor() {
		return departureFloor;
	}

	public int getArrivalFloor() {
		return arrivalFloor;
	}

}
