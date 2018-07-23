package pipeline;

import java.util.List;
import java.util.stream.Collectors;

import quizclasses.Employee;
import quizclasses.EmployeeTestData;
import quizclasses.Pair;
import quizclasses.TraderTransactTestData;
import quizclasses.Transaction;

/** USE STREAM PIPELINES TO SOLVE THE PROBLEMS HERE */
public class Main {

	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		// Example of desired style:
		// This create a stream pipeline that does the following:
		// Print all Employee records for which name has length > 5 and birth
		// year is > 1970
		List<Employee> result = sampleData.stream().filter(e -> e.getName().length() > 5)
				.filter(e -> e.getYearOfBirth() > 1970).collect(Collectors.toList());
		System.out.println(result);

		prob1();
		prob2();
		prob3();
	}

	// Problem 1
	// Create a stream pipeline that obtains a list of
	// all name/salary pairs extracted from a list of Employees
	// for which salary > 55000 and less than 120000, in ascending
	// order of name, then descending order of salary
	// Then print the list to the console
	public static void prob1() {
		// use this list
		int lower = 55000;
		int upper = 120000;		
		System.out.println("\n Prob 1 \n\n");
		EmployeeTestData.getList().stream().map((x) ->  new Pair (x.getName(),x.getSalary()) ).filter( x -> x.salary > lower  && x.salary < upper ).sorted(  (x,y) ->  -1 * (int) (x.salary - y.salary) ).collect(Collectors.toList()).forEach(System.out::println);;

	}

	// Problem 2
	// Create a stream pipeline to find all transactions from year 2011
	// and sort them by value (small to high), and print to console
	// (Note: there is an instance variable "value" in Transaction)
	public static void prob2() {
		// use this list
		
		
		System.out.println("\n\n Problem 2\n\n\n");
		int year = 2011;
		TraderTransactTestData.getTransactions().stream().filter((x) -> x.getYear() == year ).sorted( (x,y) -> x.getValue() - y.getValue() ).collect(Collectors.toList()).forEach(System.out::println);;
	
	
	}

	// Problem 3
	// Create a stream pipeline to find all traders from Cambridge,
	// sort them by name, and print to console
	public static void prob3() {
		// Use this list
		// Use this list
				System.out.println("\n\n Problem 3\n\n\n");
				String city = "Cambridge";
				TraderTransactTestData.getTransactions().stream().filter(x -> x.getTrader().getCity( ).equals(city) ) .sorted( (x,y) -> x.getTrader().getName().compareTo(y.getTrader().getName())  ).collect(Collectors.toList()).forEach(System.out::println);


	}
}
