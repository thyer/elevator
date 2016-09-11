package people;

import elevator.AbstractElevatorManager;

public class PersonManager implements IPersonManager{
	
	private final static double TIME_INTERVAL = 0.05; // every three seconds
	private final static double BEGIN = 0.00; // 12:00AM
	private final static double CLOSE = 1439.99; // 11:59PM
	
	private double currentTime;
	private AbstractElevatorManager elevatorManager;
	private IPerson[] people;
	private ISchedule schedule;
	
	public PersonManager(AbstractElevatorManager em, IPerson[] p) throws Exception{
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
		for(IRequest r : schedule.getRequestsAtTime(currentTime)){
			elevatorManager.handleRequest(r);
		}
	}
	
	public void beginSimulation(){
		while(currentTime < CLOSE){
			this.turnTheCrank();
		}
	}

}
