package tickTackToePackage;

public class Player {
	private String myName;
	private int ID;

	public Player(String name, int ID) {
		myName = name;
		this.ID = ID;
	}
	
	public String getName() {
		return myName;
	}
	
	public int getID() {
		return ID;
	}
}
