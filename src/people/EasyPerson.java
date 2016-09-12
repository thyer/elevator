package people;

import java.util.Random;

public class EasyPerson extends DifficultyPerson{
	private final static int MAX_FLOOR = 5;

	@Override
	protected IPerson generateRandomPerson() {
		Random rand = new Random();
		Person retPerson = new Person(rand.nextInt(MAX_FLOOR) + 1);
		planArrival();
		planDeparture();
		return retPerson;
		
	}

	@Override
	public int getFloor() {
		return person.getFloor();
	}

	@Override
	public ElevatorTrip[] getTrips() {
		return person.getTrips();
	}

	@Override
	protected void planArrival() {
		double arrivalTime = 420; // earliest entrance at 7AM
		arrivalTime += new Random().nextInt(1200) / 10; // latest entrance at 9AM
		ElevatorTrip et = new ElevatorTrip(arrivalTime, 0, getFloor());
		addTrip(et);
		
	}

	@Override
	protected void planDeparture() {
		double departureTime = 960; // earliest departure at 4PM
		departureTime += new Random().nextInt(1200) / 10; //latest departure at 6PM
		ElevatorTrip et = new ElevatorTrip(departureTime, getFloor(), 0);
		addTrip(et);
		
	}

	@Override
	public void addTrip(ElevatorTrip elevatorTripNew) {
		person.addTrip(elevatorTripNew);
		
	}

	@Override
	public int getKgWeight() {
		return person.getKgWeight();
	}
}
