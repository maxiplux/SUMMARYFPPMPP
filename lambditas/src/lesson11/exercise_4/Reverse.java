package lesson11.exercise_4;
import java.util.*;



public class Reverse {
	//Fix this code using a helper method to capture the wildcard
	public static void reverse(List<?> list) {   
		List<Object> tmp = new ArrayList<Object>(list);   
		for (int i = 0; i < list.size(); i++) 
		{
			setOnPosition(tmp, list.get(i));
			
	      //list.set(i, tmp.get(list.size() - i - 1)); //compiler error
	   }
		
		
		list=tmp;
	}
	
	public static<T> void setOnPosition(List<T> list, T object) 
	{   
		list.set(0,  object);
		
		
	}
	 
	
	//Test your code with this main method
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Joe"), new Person("Jim"), 
				new Person("Tom"), new Person("Anne"));
		System.out.println("Before reversing: " + persons);
		Reverse.reverse(persons);
		System.out.println("After reversing: " + persons);
		
	}

}
