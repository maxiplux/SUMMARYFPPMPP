package lambdalib;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import quizclasses.Employee;
import quizclasses.Transaction;


public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";

	// Example query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
	   = (list, namelength, year) -> list.stream()
	                                     .filter(e -> e.getName().length() > namelength)
	                                     .filter(e -> e.getYearOfBirth() > year)
	                                     .collect(Collectors.toList());

	   
		// Problem 1
		// Create a Lambda Library entry that does the following:
		// Create a stream pipeline that obtains a list of
		// all name/salary pairs extracted from a list of Employees
		// for which salary > 55000 and less than 120000, in ascending
		// order of name, then descending order of salary
		// Then call your Lambda Library entry to print the list to the console

	// Example query
		public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> PROB1
		   = (list, lower, upper) -> list.stream()
		                                     .filter(x -> x.getSalary() > lower && x.getSalary() < upper )
		                                     .sorted( Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed() )
		                                     .collect(Collectors.toList());
		

		   
			// Problem 2
			// Create a Lambda Library entry that does the following:
			// Obtain a list of all transactions from year 2011 and
			// sort them by value (small to high).
			// (Note: there is an instance variable "value" in Transaction)
			// Then call your Lambda Library entry to print the list to console
		   
		   public final static BiFunction<List< Transaction >, Integer, List<Transaction>> PROB2
		   = (list, year) -> list.stream()
		                                     .filter(x -> x.getYear() == year )
		                                     .sorted( Comparator.comparing(Transaction::getValue))
		                                     .collect(Collectors.toList());
		   
		   
			// Problem 3
			// Create a Lambda Library entry that does the following:
			// Obtain a list of all traders from Cambridge,
			// sort them by name. Then call your Lambda Library entry
			// to print to console
		   public final static BiFunction<List< Transaction >, String , List<Transaction>> PROB3
		   = (list, city) -> list.stream()
		                                     .filter(x -> x.getTrader().getCity().equals(city) )
		                                     .sorted( (x,y) -> x.getTrader().getName().compareTo(y.getTrader().getName()) )
		                                     .collect(Collectors.toList());

}

