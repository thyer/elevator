package people;

import assessment.Difficulty;

public class PersonFactory {
	Class<? extends IPerson> personClass;

	public PersonFactory(Difficulty difficulty){
		if (DifficultyPerson.class.isAssignableFrom(difficulty.getPersonClass())){
			personClass = difficulty.getPersonClass();
		}
	}

	public IPerson getRandomPerson() {
		try {
			return personClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
		return null;
	}

}
