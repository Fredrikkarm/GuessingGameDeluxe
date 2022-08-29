import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		int nr1 = rand.nextInt(10);
		int nr2 = rand.nextInt(10);
		int nr3 = rand.nextInt(10);

		boolean gameRunning = true;
		int gameOverChecker = 1;
		do {

			String randomNumber = String.valueOf(nr1) + String.valueOf(nr2) + String.valueOf(nr3);
			Scanner sc = new Scanner(System.in);
			
			if (gameOverChecker <= 1)
				System.out.println("Guess a three digit number: ");

			if (gameOverChecker > 1)
				System.out.println("\nGuess a three digit number: ");
			String myGuess = sc.nextLine();


			// Checking value 1
			if (myGuess.charAt(0) == randomNumber.charAt(0))
				System.out.print('O');
			else if (myGuess.charAt(0) == randomNumber.charAt(1) || myGuess.charAt(0) == randomNumber.charAt(2))
				System.out.print('?');
			else
				System.out.print('X');

			// Checking value 2
			if (myGuess.charAt(1) == randomNumber.charAt(1))
				System.out.print('O');
			else if (myGuess.charAt(1) == randomNumber.charAt(0) || myGuess.charAt(1) == randomNumber.charAt(2))
				System.out.print('?');
			else
				System.out.print('X');

			// Checking value 3
			if (myGuess.charAt(2) == randomNumber.charAt(2))
				System.out.println('O');
			else if (myGuess.charAt(2) == randomNumber.charAt(0) || myGuess.charAt(2) == randomNumber.charAt(1))
				System.out.print('?');
			else
				System.out.print("X");

			// if Won
			if (myGuess.charAt(0) == randomNumber.charAt(0) && myGuess.charAt(1) == randomNumber.charAt(1)
					&& myGuess.charAt(2) == randomNumber.charAt(2)) {
				System.out.println("POGCHAMP YOU WON");
				gameRunning = false;
				sc.close();
			}
			// if Lost
			if (gameOverChecker == 5) {
				System.out.println("\nThe man has been Hung... GAME OVER");
				gameRunning = false;
				sc.close();
			}

			gameOverChecker++;
		} while (gameRunning);
	}

}
