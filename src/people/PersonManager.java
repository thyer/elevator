package people;

import java.text.DecimalFormat;

import assessment.ElevatorManagerProxy;

public class PersonManager implements IPersonManager{
	
	private final static int TIME_INTERVAL = 1; // every one second
	private final static int BEGIN = 0; // 12:00AM
	private final static int CLOSE = 86399; // 11:59PM
	
	private int currentTime;
	private ElevatorManagerProxy elevatorManager;
	private IPerson[] people;
	private ISchedule schedule;
	
	public PersonManager(ElevatorManagerProxy em, IPerson[] p) throws Exception{
		currentTime = BEGIN;
		elevatorManager = em;
		people = p;
		
		schedule = new Schedule(people);
	}

	private void turnTheCrank(){
		currentTime += TIME_INTERVAL;
		issueRequests();
	}
	
	private void issueRequests(){
		IElevatorTrip[] trips = schedule.getRequestsAtTime(currentTime);
		if(trips.length == 0){
			return;
		}
		String time = new DecimalFormat("#.##").format(currentTime);
		System.out.println("At time " + time + " there were " + trips.length + " trips");
		for(IElevatorTrip r : trips){
			elevatorManager.cycle(r);
		}
	}
	
	public void beginSimulation(){
		while(currentTime < CLOSE){
			this.turnTheCrank();
		}
	}

}
