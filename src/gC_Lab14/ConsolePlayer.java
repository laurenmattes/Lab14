package gC_Lab14;

import java.util.Scanner;

public class ConsolePlayer extends Player {
// this player will take input from the console to play roshambo against 
// rock player or random player 

	private Scanner scnr;

// whenever you make a console player you have to give it a name and a scanner
	public ConsolePlayer(Scanner scnr, String name) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		String input = Validator.getString(scnr, "Please choose Rock, Paper, or Scissors: ");

// if this says NULL the console player will always throw NULL
		if (input.toLowerCase().startsWith("r")) {
			return Roshambo.ROCK;
		} else if (input.toLowerCase().startsWith("p")) {
			return Roshambo.PAPER;

		} else if (input.toLowerCase().startsWith("s")) {
			return Roshambo.SCISSORS;

		} else {
			System.out.println("\n");
			System.err.println("That's not a valid entry. Please try again. ");
			// using recursion to ask again if user doesnt enter R P or T
			return generateRoshambo();
		}
	}

}