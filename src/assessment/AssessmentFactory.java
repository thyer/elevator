package assessment;

import java.util.ArrayList;
import java.util.List;

import elevator.IElevatorManager;
import people.IPerson;
import people.IPersonManager;
import people.PersonFactory;
import people.PersonManager;

public class AssessmentFactory {
	private Difficulty difficulty;
	private IPersonManager personManager = null;
	
	AssessmentFactory(Difficulty d, IElevatorManager em) throws Exception{
		difficulty = d;
		loadPersonManager(em);
	}
	
	public IPersonManager getPersonManager(){
		return personManager;
	}
	
	private void loadPersonManager(IElevatorManager em) throws Exception{
		IPerson[] people = loadPeople();
		ElevatorManagerProxy emp = new ElevatorManagerProxy(em);
		personManager = new PersonManager(emp, people);
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
