package lesson11.exercise_2;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class CountStringOccurrences {
	
	public static <K> int countOccurrences2  (K[] arr, K target) {
		
		return (int) Stream.of(arr).parallel().filter((e) -> e != null).filter((e)-> e.equals(target) ).count();
		
		
	}
	public static int countOccurrences(String[] arr, String target) { 
		
		return (int) Stream.of(arr).parallel().filter((e) -> Optional.ofNullable(e).orElse("").equals(target) ).count();
	}
	
	public static void main(String[] args) {
		String[] test = {"1","3",null,"4","4","4"};
		System.out.println( countOccurrences(test, "4") );
	}
}
