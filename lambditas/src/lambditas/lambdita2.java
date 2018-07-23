package lambditas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface XUtil {
	int produce(int x);
}

public class lambdita2 {

	static int count(int x) {
		return x == 0 ? 0 : x + count(x - 1);
	}

 
	 public static boolean isPrime(int n)
	 {	
		 
	        for (int i = 2; i <   Integer.valueOf((int) (Math.sqrt(n)+1)) ; i++) {
	        	 
	        	if (n%i==0) 
	        	{
	        		return false;
	        	}
				
			}
	        
	        return true;
	        	
	        	
	        
	 }
	 
	 public static boolean isPrime2(int n)
	 {	
		 	if (n%2==0) {
		 		return false;
		 	}
	        
	        //System.out.printf( "%s,%s,%s,%s \n" , n,n-1,  Stream.iterate(2, (x) -> x+1).skip(n-1).limit(n).filter( (x) -> n%x == 0  ).collect( Collectors.toList( ) ), Stream.iterate(2, (x) -> x+1).skip(n-1).limit(n).filter( (x) -> n%x == 0  ).count() == 0);
	        return Stream.iterate(2, (x) -> x+1).limit(n).filter( (x) -> n%x == 0 && x!=n ).limit(1).count() == 0 ;
	        
	        	
	 }

	public static void main(String[] args) {

		XUtil tool = (x) -> x * x;
		String words = "ABCDEERFGIJKLMNOPQRSTWXYZ";

		List<String> myList = new ArrayList<String>(Arrays.asList(words.split("")));
		myList.stream().map((x) -> x.toUpperCase());
		System.out.println(myList.stream().map((x) -> x.toUpperCase()).toArray());

		//Stream.iterate(1, x -> x + 1).limit(50).skip(20).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//Stream.iterate("", x -> x + "x").limit(50).skip(20).collect(Collectors.toList()).forEach(System.out::println);
	
		//Stream.concat(Stream.iterate(8.0, x -> x + Math.random()*8342310 ).limit(50).skip(20), Stream.iterate("", x -> x + "x").limit(50).skip(20)).collect(Collectors.toList()).forEach(System.out::println);
		
		//Stream.iterate(1, x -> x + 1).limit(100).filter((x) -> x%2==0 ).collect(Collectors.toList()).forEach(System.out::println);
		
	//	System.out.println(isPrime(11));
		
		Stream.iterate(1, x -> x + 1).limit(1000).filter( lambdita2:: isPrime2 ).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		

		// TODO Auto-generated method stub

		// BiFunction<Integer, Integer, Integer> lambda = (x,y)-> x*y ;
		// Function<Integer,Integer> lambda = (x) -> x == 0 ? 0 : x* x-1;

		// System.out.println( lambda.apply(6) );
	}

}
