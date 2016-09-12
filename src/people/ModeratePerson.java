package people;

public class ModeratePerson extends DifficultyPerson{

	@Override
	protected IPerson generateRandomPerson() {
		return null;
		
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
	public void addTrip(ElevatorTrip elevatorTripNew) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void planArrival() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void planDeparture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getKgWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
