package lessson10;

import java.util.stream.Stream;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(Stream.of("A","B","C").reduce((x,y) -> x+y ));

	}

}
