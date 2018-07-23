package homework1;

public class Prog5 {

	public static void main(String[] args) {
		String[] values = new String[8];
		for (int i = 0; i < values.length; i++) {
			values[i] = Integer.toString(RandomNumbers.getRandomInt(1, 99));
		}

		String template = "        %s    %s       %s      %s  \n" + "      + %s    +%s      + %s   + %s  \n"
				+ "      _____   ____     ____  ____  \n";
		template = String.format(template, values[0], values[1], values[2], values[3], values[4], values[5], values[6],
				values[7]);

		System.out.println(template);

	}

}
