package homework1;

import java.util.Arrays;

public class Prog7 {

	public static void main(String[] args) {

		String myInput = String.join(",", args);

		System.out.printf("The ansewer to Problem7   question 1  if your enter %s  the  solution is %s", myInput, "\n");
		lengthEachString(args);
		System.out.println(String.format("The ansewer to Problem7   question 2  if your enter %s  the  solution is %s",
				myInput, lengthWithNameA(args)));

	}

	private static int lengthEachString(String[] baseString) {
		int result = 0;

		for (String word : baseString) {
			System.out.printf("%s  the size of it is %s %s", word, word.length(), "\n");

		}

		return result;

	}

	private static int lengthWithNameA(String[] baseString) {
		int result = 0;

		for (String word : baseString) {

			if (word.toLowerCase().startsWith("a")) {
				result = result + 1;

			}

		}

		return result;

	}
}
