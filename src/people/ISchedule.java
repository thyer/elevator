package people;

public interface ISchedule {
	public abstract void initSchedule(IPerson[] p) throws Exception;
	public abstract IRequest[] getRequestsAtTime(double currentTime);
}
