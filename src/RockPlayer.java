
public class RockPlayer extends Player {

	public RockPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RockPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
