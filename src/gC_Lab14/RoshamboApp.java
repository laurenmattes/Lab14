package gC_Lab14;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		String playerName;
		String oppName;
		String anotherTime = "yes";
		int laurenWin = 0;
		int laurenLoss = 0;
		int mikeWin = 0;
		int mikeLoss = 0;
		int humanWin = 0;
		int humanLoss = 0;

		Scanner scnr = new Scanner(System.in);

		System.out.println("What is your name? ");
		playerName = scnr.nextLine();

		while (anotherTime.equalsIgnoreCase("yes")) {

			System.out.println("Who do you wanna play with? (Lauren or Mike)");
			oppName = scnr.nextLine();

// passing scanner over when making a new console player so now it has access to scanner

			Player human = new ConsolePlayer(scnr, playerName);
			Roshambo humanChoice = human.generateRoshambo();
			System.out.println(human.getName() + " : " + humanChoice);

// if player faces LOCO LUCY this path of CRAZY conditional statements is followed 

			if (oppName.equalsIgnoreCase("Lauren")) {
// create the RANDOM player
				Player opponentRandom = new RandomPlayer("Lauren");
// get the RANDOM player's choice 
				Roshambo randomChoice = opponentRandom.generateRoshambo();
// TEST output RANDOM choice 
				System.out.println(opponentRandom.getName() + " : " + randomChoice);

				if (humanChoice == Roshambo.PAPER && randomChoice == Roshambo.SCISSORS) {
					System.out.println("Lauren is the winner!");
					laurenWin++;
					humanLoss++;
				} else if (humanChoice == Roshambo.PAPER && randomChoice == Roshambo.ROCK) {
					System.out.println(playerName + " is the winner!");
					humanWin++;
					laurenLoss++;
				} else if (humanChoice == Roshambo.PAPER && randomChoice == Roshambo.PAPER) {
					System.out.println("Draw!");

				} else if (humanChoice == Roshambo.ROCK && randomChoice == Roshambo.SCISSORS) {
					System.out.println(playerName + " is the winner!");
					humanWin++;
					laurenLoss++;
				} else if (humanChoice == Roshambo.ROCK && randomChoice == Roshambo.PAPER) {
					System.out.println("Lauren is the winner!");
					laurenWin++;
					humanLoss++;
				} else if (humanChoice == Roshambo.ROCK && randomChoice == Roshambo.ROCK) {
					System.out.println("Draw!");
				} else if (humanChoice == Roshambo.SCISSORS && randomChoice == Roshambo.ROCK) {
					System.out.println("Lauren is the winner!");
					laurenWin++;
					humanLoss++;
				} else if (humanChoice == Roshambo.SCISSORS && randomChoice == Roshambo.PAPER) {
					System.out.println(playerName + " is the winner!");
					humanWin++;
					laurenLoss++;
				} else if (humanChoice == Roshambo.SCISSORS && randomChoice == Roshambo.SCISSORS) {
					System.out.println("Draw!");
				}

			}

// if player faces CHUPCACABRA this path of (less) crazy conditional statements is followed 
			if (oppName.equalsIgnoreCase("Mike"))

			{

// create the ROCK player's choice
				Player opponentRock = new RockPlayer("Mike");

// get the ROCK player's choice
				Roshambo rockChoice = opponentRock.generateRoshambo();

// Output the ROCK choice
				System.out.println(opponentRock.getName() + " : " + rockChoice);

				if (humanChoice == Roshambo.PAPER) {
					System.out.println(playerName + " is the winner!");
					humanWin++;
					mikeLoss++;
				} else if (humanChoice == Roshambo.SCISSORS) {
					System.out.println("Mike is the winner!");
					mikeWin++;
					humanLoss++;
				} else if (humanChoice == Roshambo.ROCK) {
					System.out.println("Draw!");
				}

			}

			System.out.println("Do you want to play again??(yes/no)");
			anotherTime = scnr.nextLine();

			if (anotherTime.startsWith("n")) {
				System.out.println("Player Stats: ");
				System.out.println(playerName + ": Wins: " + humanWin + " Losses: " + humanLoss);
				System.out.println("Lauren" + ": Wins: " + laurenWin + " Losses: " + laurenLoss);
				System.out.println("Mike" + ": Wins: " + mikeWin + " Losses: " + mikeLoss);
			}
		}
	}

}