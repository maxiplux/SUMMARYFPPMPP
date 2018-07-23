package masestudio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.asList("a","b","c",null);
		Arrays.asList("a","b","c",null).stream().filter(x -> x  != null  ).collect(Collectors.toList());
		
		Arrays.asList("a","b","c",null).stream().collect(Collectors.toList()).forEach((x) -> {
			
			System.out.println( Optional.ofNullable(x).orElse("kkkkkkkkkk") );
		});;
		
		
	//	Arrays.asList("a","b","c",null).stream().map(x -> Optional.ofNullable(x)  ).map( (x) -> x.orElse("Valor nuloxxxxxxxxxxxx") ).collect(Collectors.toList()).forEach(System.out::println);
		Arrays.asList("a","b","c",null).stream().map(x -> Optional.ofNullable(x)  ).collect(Collectors.toList()).forEach( (x) ->  {
		
			x.ifPresent( (sigma) -> System.out.println(sigma) );
		
		});
		
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars().mapToObj(x -> String.valueOf((char)x)).collect(Collectors.toList()).forEach(System.out::println);

	}

}
