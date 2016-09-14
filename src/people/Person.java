package people;

import java.util.ArrayList;
import java.util.List;

public class Person implements IPerson{
	private int floor;
	private int kgWeight;
	private List<ElevatorTrip> elevatorTrips;
	
	public Person(int floor){
		this.floor = floor;
		elevatorTrips = new ArrayList<ElevatorTrip>();
	}

	@Override
	public int getFloor() {
		return floor;
	}

	@Override
	public ElevatorTrip[] getTrips() {
		return elevatorTrips.toArray(new ElevatorTrip[elevatorTrips.size()]);
	}
	
	@Override
	public void addTrip(ElevatorTrip elevatorTripNew){
		elevatorTrips.add(elevatorTripNew);
	}

	@Override
	public int getKgWeight() {
		return kgWeight;
	}
	
	public void setKgWeight(int kgWeight){
		this.kgWeight = kgWeight;
	}
	
	

}
