package lesson11;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Masestudio {

	public static int sumar(List<? extends  Number> lista)
	{
	int result = 0;
	for (Number number : lista) {
		 result = result + number.intValue();
	}
	 //lista.stream().reduce(  (x, y) ->  (Number) (x.doubleValue() + y.doubleValue() ));
	 
	 		
	 return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(1, (x) -> x + 1).limit(3).reduce(0, (x, y) -> x + y);

		List<Integer> listadito = Stream.iterate(1, (x) -> x + 1).limit(3).collect(Collectors.toList());
		System.out.println(sumar(listadito));

	}

}
