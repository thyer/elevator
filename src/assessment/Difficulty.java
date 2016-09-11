package assessment;

public enum Difficulty {
	StupidEasy (20),
	Easy (100),
	Moderate (200),
	Hard (500),
	Legendary (1000);
	
	private final int count;
	Difficulty(int count){
		this.count = count;
	}
	
	public int getCount(){
		return this.count;
	}
}
