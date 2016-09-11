package people;

public class Schedule implements ISchedule{

	IPerson[] people;
	public Schedule(IPerson[] p) throws Exception {
		initSchedule(p);
	}
	
	@Override
	public void initSchedule(IPerson[] p) throws Exception {
		people = p;
		throw new Exception ("Method not yet implemented");
		
	}
	@Override
	public IRequest[] getRequestsAtTime(double currentTime) {
		return null;
	}

}
