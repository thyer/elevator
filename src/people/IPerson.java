package people;

public interface IPerson {
	public int getFloor();
	public int getKgWeight();
	public ElevatorTrip[] getTrips();
	void addTrip(ElevatorTrip elevatorTripNew);
}
