
public abstract class Player {

	private String name;// fields (aka instance variable)

	// concrete subclasses must implement this method
	public abstract Roshambo generateRoshambo();

	public Player() {// no args

	}

	public Player(String name) {// overloaded constructor
		this.name = name;
	}

	public String getName() {// getter
		return name;
	}

	public void setName(String name) {// setter
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
