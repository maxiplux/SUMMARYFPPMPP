package homework1;

public class Prog2 {

	public static void main(String[] args) {
		float x = 1.27f;
		float y = 3.881f;
		float z = 9.6f;

		int question1 = (int) x + (int) y + (int) z;
		int question2 = Math.round(x) + Math.round(y) + Math.round(z);

		System.out.println(String.format("The ansewer Problem 2  to question 1 is %s", question1));
		System.out.println(String.format("The ansewer Problem 2  to question 2 is %s", question2));

	}
}
