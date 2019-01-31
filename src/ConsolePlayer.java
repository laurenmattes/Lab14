import java.util.Scanner;

public class ConsolePlayer extends Player {

	private Scanner scnr;

	public ConsolePlayer(Scanner scnr, String name) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {

		String input = Validator.getString(scnr, "Pick Rock, Paper, or Scissors: ");

		input = input.toLowerCase();
		if (input.startsWith("r")) {
			return Roshambo.ROCK;
		} else if (input.startsWith("p")) {
			return Roshambo.PAPER;
		} else if (input.startsWith("s")) {
			return Roshambo.SCISSORS;
		} else {
			System.out.println("That was an invalid input.  Try again.");
			return generateRoshambo();
		}
	}

}
