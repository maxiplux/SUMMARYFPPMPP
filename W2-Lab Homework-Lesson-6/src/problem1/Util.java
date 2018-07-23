package problem1;

public class Util {

	public static int countLetters(String args) {
		return args.length();

	}

	public static String reverseLetters(String args) {
		StringBuilder builder = new StringBuilder();
		String[] container = args.split("");

		for (int i = container.length - 1; i != -1; i--) {

			builder.append(container[i]);

		}
		return builder.toString();

	}

	public static String removeDuplicates(String args) {
		StringBuilder builder = new StringBuilder();
		String[] container = args.split("");

		for (String string : container) {
			if (!builder.toString().contains(string)) {
				builder.append(string);
			}

		}
		return builder.toString();

	}

}
