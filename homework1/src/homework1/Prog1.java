package homework1;

public class Prog1 {

	public static double problem1Question1() {
		int x = RandomNumbers.getRandomInt(1, 9);
		return Math.pow(Math.PI, x);

	}

	public static double problem1Question2() {
		int y = RandomNumbers.getRandomInt(3, 14);
		return Math.pow(y, Math.PI);

	}

	public static void main(String[] args) {
		System.out.println(String.format("The ansewer Problem 1  to question 1 is %s", problem1Question1()));

		System.out.println(String.format("The ansewer Problem 1 to question  2 is %s", problem1Question2()));

	}
}
