package lambdalib;

import java.util.List;

import quizclasses.Employee;
import quizclasses.EmployeeTestData;
import quizclasses.TraderTransactTestData;
import quizclasses.Transaction;

/** SOLVE THE PROBLEMS HERE USING A LAMBDA LIBRARY */
public class Main {
	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		// Example of desired style:
		// This creates a Lambda Library entry that prints all Employee records
		// for which name has length > 5 and birth year is > 1970
		//System.out.println(LambdaLibrary.SAMPLE.apply(sampleData, 5, 1970));

		prob1();
		prob2();
		prob3();
	}

	// Problem 1
	// Create a Lambda Library entry that does the following:
	// Create a stream pipeline that obtains a list of
	// all name/salary pairs extracted from a list of Employees
	// for which salary > 55000 and less than 120000, in ascending
	// order of name, then descending order of salary
	// Then call your Lambda Library entry to print the list to the console
	public static void prob1() {
		System.out.println("\nProb 1   \n\n\n");
		// use this list
		List<Employee> list = EmployeeTestData.getList();
		int lower = 55000;
		int  upper = 120000;
		System.out.println(LambdaLibrary.PROB1.apply(list, lower, upper));

	}

	// Problem 2
	// Create a Lambda Library entry that does the following:
	// Obtain a list of all transactions from year 2011 and
	// sort them by value (small to high).
	// (Note: there is an instance variable "value" in Transaction)
	// Then call your Lambda Library entry to print the list to console
	public static void prob2() {
		// use this list
		System.out.println("\nProb 2  \n\n\n");
		List<Transaction> list = TraderTransactTestData.getTransactions();
		int year  = 2011 ;
		System.out.println(LambdaLibrary.PROB2.apply(list, year));
	}

	// Problem 3
	// Create a Lambda Library entry that does the following:
	// Obtain a list of all traders from Cambridge,
	// sort them by name. Then call your Lambda Library entry
	// to print to console
	public static void prob3() {
		// Use this list
		
		System.out.println("\nProb 3  \n\n\n");
		
		List<Transaction> list = TraderTransactTestData.getTransactions();
		String city = "Cambridge";
		System.out.println(LambdaLibrary.PROB3.apply(list, city));

	}

}
