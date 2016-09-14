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
	private final Class<? extends IPerson> personClass;
	Difficulty(int count, Class<? extends IPerson> personClass){
		this.count = count;
		this.personClass = personClass;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public Class<? extends IPerson> getPersonClass(){
		return this.personClass;
	}

	public int getElevatorCount() {
		int ret = 1;
		ret += this.count >= 100 ? 1 : 0;
		ret += this.count >= 500 ? 1 : 0;
		return ret;
	}
}
