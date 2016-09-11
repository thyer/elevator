package assessment;

import java.util.ArrayList;
import java.util.List;

import elevator.AbstractElevatorManager;
import people.IPerson;
import people.IPersonManager;
import people.PersonFactory;
import people.PersonManager;

public class AssessmentFactory {
	private Difficulty difficulty;
	private IPersonManager personManager = null;
	
	AssessmentFactory(Difficulty d, AbstractElevatorManager em) throws Exception{
		difficulty = d;
		loadPersonManager(em);
	}
	
	public IPersonManager getPersonManager(){
		return personManager;
	}
	
	private void loadPersonManager(AbstractElevatorManager em) throws Exception{
		IPerson[] people = loadPeople();
		personManager = new PersonManager(em, people);
	}
	
	private IPerson[] loadPeople(){
		List<IPerson> people = new ArrayList<IPerson>();
		PersonFactory pf = new PersonFactory(difficulty);
		for(int i = 0; i < difficulty.getCount(); ++i){
			people.add(pf.getRandomPerson());
		}
		return (IPerson[]) people.toArray();
	}

}
