package homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDups {

	public static void main(String[] args) {
		String[] baseString = new String[] { "horse", "dog", "cat", "horse", "dog" };
		String[] result = removeDuplicates(baseString);
		System.out.println(Arrays.toString(baseString));
		System.out.println(Arrays.toString(result));

	}

	private static Boolean existsElement(ArrayList<String> result, String value) {

		for (String string : result) {
			if (string.equals(value)) {
				return true;
			}

		}
		return false;
	}

	private static String[] removeDuplicates(String[] baseString) {

		ArrayList<String> result = new ArrayList<String>();
		for (String string : baseString) {
			if (!existsElement(result, string)) {
				result.add(string);

			}
		}
		return result.toArray(new String[result.size()]);
	}

}
