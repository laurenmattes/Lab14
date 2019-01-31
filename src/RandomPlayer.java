import java.util.Random;

public class RandomPlayer extends Player {

	Random rand = new Random();
	int pickedNumber = rand.nextInt(3) + 1;

	public RandomPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RandomPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub

		if (pickedNumber == (1)) {
			return Roshambo.ROCK;

		} else if (pickedNumber == (2)) {
			return Roshambo.PAPER;
		} else if (pickedNumber == (3)) {
			return Roshambo.SCISSORS;
		} else {
			return generateRoshambo();
		}

	}
}
