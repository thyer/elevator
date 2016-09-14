package people;

public abstract class DifficultyPerson implements IPerson{
	protected IPerson person;
	
	public DifficultyPerson(){
		generateRandomPerson();
	}
	
	public IPerson getPerson(){
		return person;
	}
	
	// should set the person field to a random person of the chosen type
	protected abstract void generateRandomPerson();
	protected abstract void planArrival();
	protected abstract void planDeparture();

}
