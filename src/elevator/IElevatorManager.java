package elevator;

import java.util.List;

public interface IElevatorManager{
	
	/**
	 * Called before every cycle. Only gives you the new requests. 
	 * Don't ever lose one of these - you won't get another reminder.
	 * @param requests The list of new active requests
	 */
	public abstract void receiveRequests(List<Request> requests);

	/**
	 * Only called at the beginning of the assessment. Don't mess with this
	 * @param elevators Your elevators
	 */
	public abstract void setElevators(IElevator[] elevators);

	/**
	 * Recommended steps:
	 * 1. Check where each elevator is, what the active requests are
	 * 2. For each elevator, either move up a floor, move down a floor, or open doors
	 * 3. If your doors are open at the end of the cycle, all passengers who need to get
	 * 	off will leave and all requests from that floor will get on. 
	 * */
	public abstract void cycle();

}
