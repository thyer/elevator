package assessment;

import elevator.ElevatorManagerFactory;
import elevator.IElevatorManager;

public class Assessment {
	
	public static void main(String[] args){
		Difficulty[] rgd = Difficulty.values();
		PersonManagerFactory pmf = null;
		IElevatorManager em = ElevatorManagerFactory.getElevatorManager();
		if(args.length != 1 || rgd.length < 1){
			System.out.println("Usage: include difficulty setting 1-5");
		}
		else if(em == null){
			System.out.println("Ensure ElevatorManagerFactory returns a valid implementation of IElevatorManager");
		}
		else{
			try{
				int i = Integer.parseInt(args[0]);
				pmf = new PersonManagerFactory(rgd[i - 1], em);
			}
			catch(Exception e){
				System.out.println("Please input a valid difficulty setting 1-" + rgd.length);
				e.printStackTrace();
			}
		}
		pmf.getPersonManager().beginSimulation();
		System.out.println("End of program");
	}

}
