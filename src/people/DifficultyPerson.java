package people;

public abstract class DifficultyPerson implements IPerson{
	protected IPerson person;
	
	public DifficultyPerson(){
		person = generateRandomPerson();
	}
	
	public IPerson getPerson(){
		return person;
	}
	
	protected abstract IPerson generateRandomPerson();
	protected abstract void planArrival();
	protected abstract void planDeparture();

}
