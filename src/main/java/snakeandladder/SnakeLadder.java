package snakeandladder;

public class SnakeLadder {
	public static final int START_POSITION = 0;
	public static final int IS_SNAKE = 1;
	public static final int IS_LADDER = 2;
	public static final int WINNING_POSITION = 100;
	public static int currentPosition = 0;

	public static void main(String[] args) {
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");
		System.out.println("<--------------------------------------------->");
		int diceNumber = (int) ((Math.random() * 10 % 6) + 1);// UC2 - Player rolls the dice
		System.out.println("Dice Number : " + diceNumber);
		System.out.println("<--------------------------------------------->");
		int option = (int) ((Math.random() * 10 % 3) + 1); // UC3 - Player check options
		if (option == IS_SNAKE) {
			currentPosition -= diceNumber;
			if (currentPosition < 0) { // UC4 - Player restarts from 0
				currentPosition = START_POSITION;
				System.out.println("Snake eats you...!!!");
			}
			System.out.println("Player position is : " + currentPosition);
		} else if (option == IS_LADDER) {
			currentPosition += diceNumber;
			System.out.println("Player position moves : " + currentPosition);
		} else {
			System.out.println("No Play " + currentPosition);
		}
	}
}
