import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println();

		System.out.println("Enter your name:");
		String choice = scnr.nextLine();

		System.out.println("Who do you want to play? (Josh/Lauren)");
		String name = scnr.nextLine();

		Player human = new ConsolePlayer(scnr, name);
		Roshambo humanChoice = human.generateRoshambo();
		System.out.println(human.getName() + " : " + humanChoice);

		Player random = new RandomPlayer("Josh");
		Roshambo randomChoice = random.generateRoshambo();
		System.out.println(random.getName() + " : " + randomChoice);

		// create the player
		Player opponent = new RockPlayer("Lauren");

		// Get the player's choice
		Roshambo opponentChoice = opponent.generateRoshambo();

		//
		System.out.println(opponent.getName() + " : " + opponentChoice);

	}
}
