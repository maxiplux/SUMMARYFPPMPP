package semana11;

import java.util.StringJoiner;

public class JugandoEnclases {
	public static void main(String[] args) {
		
		String example = new String ("");
		example=example+"12345";
		System.out.println(example.substring(2, 4));
		StringJoiner joiner = new StringJoiner("\",\"","[","]");
		joiner.add("la vida es hermosa");
		joiner.add("la vida es hermosa2");
		joiner.add("la vida es hermosa3");
		System.out.println(joiner);
		
	}
}
