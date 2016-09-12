package people;

import assessment.ElevatorManagerProxy;

public class PersonManager implements IPersonManager{
	
	private final static double TIME_INTERVAL = 0.05; // every three seconds
	private final static double BEGIN = 0.00; // 12:00AM
	private final static double CLOSE = 1439.99; // 11:59PM
	
	private double currentTime;
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
		for(IElevatorTrip r : schedule.getRequestsAtTime(currentTime)){
			elevatorManager.handleRequest(r);
		}
	}
	
	public void beginSimulation(){
		while(currentTime < CLOSE){
			this.turnTheCrank();
		}
	}

}
