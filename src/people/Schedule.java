package people;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule implements ISchedule{

	IPerson[] people;
	Map<Integer, List<IElevatorTrip>> schedule;
	public Schedule(IPerson[] p) throws Exception {
		schedule = new HashMap<Integer, List<IElevatorTrip>>();
		initSchedule(p);
	}
	
	@Override
	public void initSchedule(IPerson[] p) throws Exception {
		people = p;
		for(IPerson ip : people){
			IElevatorTrip[] trips = ip.getTrips();
			for(IElevatorTrip trip : trips){
				if(!schedule.containsKey(trip.getTime())){
					schedule.put(trip.getTime(), new ArrayList<IElevatorTrip>());
				}
				System.out.println("schedule size: " + schedule.keySet().size());
				List<IElevatorTrip> currentList = schedule.get(trip.getTime());
				currentList.add(trip);
				schedule.put(trip.getTime(), currentList);
			}
		}
		
	}
	@Override
	public IElevatorTrip[] getRequestsAtTime(int currentTime) {
		List<IElevatorTrip> trips = schedule.get(currentTime);
		return trips == null ? new IElevatorTrip[0] : trips.toArray(new IElevatorTrip[trips.size()]);
	}

}
