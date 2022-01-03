
/** This program is a 2-player game of Tic Tac Toe.
 *@author Abigail Clarke
 *@version 1.0
 *I copied this code from the Project 3 Handout as instructed.
 */

import java.util.Scanner;

public class Project_3 {

	public static void main(String[] args) {
		String one = "E";
		String two = "E";
		String three = "E";
		String four = "E";
		String five = "E";
		String six = "E";
		String seven = "E";
		String eight = "E";
		String nine = "E";

		final int MAX_TURNS = 9;

		int numTurns = 0;
		int input;
		boolean player1 = true;

		boolean isDraw = true;

		Scanner keyboard = new Scanner(System.in);

		// Intro to the game
		System.out.println("Welcome to 2 Player Tic Tac Toe.");
		System.out.println("--------------------------------");
		System.out.println("/---|---|---\\");
		System.out.println("| " + one + " | " + two + " | " + three + " |");
		System.out.println("|-----------|");
		System.out.println("| " + four + " | " + five + " | " + six + " |");
		System.out.println("|-----------|");
		System.out.println("| " + seven + " | " + eight + " | " + nine + " |");
		System.out.println("/---|---|---\\");
		System.out.println("X's will play first. Enter a slot number to place X in:");

		// Supposed to loop for nine turns or until a player wins
		while (numTurns < MAX_TURNS) {

			// Identifies the player
			if (player1 == true) {
				System.out.println("Player1's turn");
			} else {
				System.out.println("Player2's turn");
			}

			// Asks for position
			input = keyboard.nextInt();

			// Invalid input
			while (input < 1 || input > 9) {
				System.out.println("Please enter the slot number between 1 and 9");
				input = keyboard.nextInt();
			}

			// Valid input
			if (input >= 1 && input <= 9) {

				if (input == 1) {
					if (one == "X" || one == "O") {

						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						one = "X";
					} else {
						one = "O";
					}
				} else if (input == 2) {
					if (two == "X" || two == "O") {
						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						two = "X";
					} else {
						two = "O";
					}
				} else if (input == 3) {
					if (three == "X" || three == "O") {
						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						three = "X";
					} else {
						three = "O";
					}
				} else if (input == 4) {
					if (four == "X" || four == "O") {
						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						four = "X";
					} else {
						four = "O";
					}
				} else if (input == 5) {
					if (five == "X" || five == "O") {
						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						five = "X";
					} else {
						five = "O";
					}
				} else if (input == 6) {
					if (six == "X" || six == "O") {
						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						six = "X";
					} else {
						six = "O";
					}
				} else if (input == 7) {
					if (seven == "X" || seven == "O") {
						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						seven = "X";
					} else {
						seven = "O";
					}
				} else if (input == 8) {
					if (eight == "X" || eight == "O") {
						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						eight = "X";
					} else {
						eight = "O";
					}
				} else if (input == 9) {
					if (nine == "X" || nine == "O") {
						System.out.println("The slot is already taken: re-enter slot number:");
						continue;
					}
					if (player1) {
						nine = "X";
					} else {
						nine = "O";
					}
				}
			}

// Check for a winner
			if ((one == "X" && two == "X" && three == "X") || (four == "X" && five == "X" && six == "X")
					|| (seven == "X" && eight == "X" && nine == "X") || (one == "X" && four == "X" && seven == "X")
					|| (two == "X" && five == "X" && eight == "X") || (three == "X" && six == "X" && nine == "X")
					|| (one == "X" && five == "X" && nine == "X") || (three == "X" && five == "X" && seven == "X")) {
				System.out.println("Congratulations X's have won! Thanks for playing.");
				System.out.println("The final result of Tic Tac Toe game is");
				System.out.println("--------------------------------");
				System.out.println("/---|---|---\\");
				System.out.println("| " + one + " | " + two + " | " + three + " |");
				System.out.println("|-----------|");
				System.out.println("| " + four + " | " + five + " | " + six + " |");
				System.out.println("|-----------|");
				System.out.println("| " + seven + " | " + eight + " | " + nine + " |");
				System.out.println("/---|---|---\\");
				isDraw = false;
				break;

			} else if ((one == "O" && two == "O" && three == "O") || (four == "O" && five == "O" && six == "O")
					|| (seven == "O" && eight == "O" && nine == "O") || (one == "O" && four == "O" && seven == "O")
					|| (two == "O" && five == "O" && eight == "O") || (three == "O" && six == "O" && nine == "O")
					|| (one == "O" && five == "O" && nine == "O") || (three == "O" && five == "O" && seven == "O")) {
				System.out.println("Congratulations O's have won! Thanks for playing.");
				System.out.println("The final result of Tic Tac Toe game is");
				System.out.println("--------------------------------");
				System.out.println("/---|---|---\\");
				System.out.println("| " + one + " | " + two + " | " + three + " |");
				System.out.println("|-----------|");
				System.out.println("| " + four + " | " + five + " | " + six + " |");
				System.out.println("|-----------|");
				System.out.println("| " + seven + " | " + eight + " | " + nine + " |");
				System.out.println("/---|---|---\\");
				isDraw = false;
				break;

			}

			// Initiate switch to other player
			player1 = !player1;
			numTurns++;

		}
		// No winner
		if (isDraw) {
			System.out.println("Its a draw! Thanks for playing");
			System.out.println("The final result of Tic Tac Toe game is");
			System.out.println("--------------------------------");
			System.out.println("/---|---|---\\");
			System.out.println("| " + one + " | " + two + " | " + three + " |");
			System.out.println("|-----------|");
			System.out.println("| " + four + " | " + five + " | " + six + " |");
			System.out.println("|-----------|");
			System.out.println("| " + seven + " | " + eight + " | " + nine + " |");
			System.out.println("/---|---|---\\");
		}
	}
}
