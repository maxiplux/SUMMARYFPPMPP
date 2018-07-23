package lessson10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	//Use the reduce method to produce a single space-separated String
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
		System.out.println(strings.reduce((x,y) -> String.format("%s %s", x,y)  ).orElse(""));
		
		//System.out.println(strings.collect(Collectors.summarizingDouble( String::length )).getMax() );
		
		
		
	}

}
