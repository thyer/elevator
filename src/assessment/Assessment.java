package assessment;

import elevator.ElevatorManagerFactory;
import elevator.IElevatorManager;

public class Assessment {
	
	public void main(String[] args){
		Difficulty[] rgd = Difficulty.values();
		AssessmentFactory af;
		IElevatorManager em = ElevatorManagerFactory.getElevatorManager();
		if(args.length != 2 || rgd.length < 1){
			System.out.println("Usage: include difficulty setting 1-5");
		}
		else if(em == null){
			System.out.println("Ensure ElevatorManagerFactory returns a valid implementation of IElevatorManager");
		}
		else{
			try{
				int i = Integer.parseInt(args[1]);
				af = new AssessmentFactory(rgd[i + 1], em);
			}
			catch(NumberFormatException e){
				System.out.println("Please input a valid difficulty setting 1-" + d.length);
			}
		}
	}

}
