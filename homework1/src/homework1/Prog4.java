package homework1;

public class Prog4 {

	public static void main(String[] args) {
		String intialquestion = "Hello";
		System.out.printf("The ansewer to Problem4  if your enter %s  the  solution is ", intialquestion);
		for (int i = intialquestion.length() - 1; i != -1; i--) {
			System.out.print(intialquestion.charAt(i));
		}

	}

}
