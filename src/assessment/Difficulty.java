package assessment;

import people.EasyPerson;
import people.HardPerson;
import people.IPerson;
import people.ModeratePerson;

public enum Difficulty {
	StupidEasy (20, EasyPerson.class),
	Easy (100, EasyPerson.class),
	Moderate (200, ModeratePerson.class),
	Hard (500, HardPerson.class),
	Legendary (1000, HardPerson.class);
	
	private final int count;
	private final Class<?> personClass;
	Difficulty(int count, Class<?> personClass){
		this.count = count;
		this.personClass = personClass;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public Class<?> getPersonClass(){
		return this.personClass;
	}
}
