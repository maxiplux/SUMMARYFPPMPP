package innerclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import quizclasses.Employee;
import quizclasses.EmployeeTestData;
import quizclasses.Pair;
import quizclasses.TraderTransactTestData;
import quizclasses.Transaction;

/**
 * SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE
 * SOLUTIONS WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {

		// Example of desired style:
		// Using local inner classes to replace lambdas in your pipeline
		// solution
		// to this sample problem:
		// Print all Employee records for which name has length > 5 and birth
		// year is > 1970

		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}

		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();

		List<Employee> result = sampleData.stream().filter(new NameLength()).filter(new BirthYear())
				.collect(Collectors.toList());
		System.out.println(result);

		prob1();
		prob2();
		prob3();
	}

	// Problem 1
	// Transform your pipeline solution to prob1 in the pipeline package so that
	// every lambda is replaced by an instance of a
	// local inner class of the correct type
	public static void prob1() {
		System.out.println("\n\n Problem 1\n\n\n");

		class SalaryPredicate implements Predicate<Employee> {
			public boolean test(Employee x) {
				int lower = 55000;
				int upper = 120000;
				return x.getSalary() > lower && x.getSalary() < upper;
			}
		}

		Comparator<Employee> comparator = Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)
				.reversed();

		class EmployeeCompare implements Comparator<Employee> {

			@Override
			public int compare(Employee x, Employee y) {

				return comparator.compare(x, y);
			}
		}

		EmployeeTestData.getList().stream().filter(new SalaryPredicate()).sorted(new EmployeeCompare())
				.map((x) -> new Pair(x.getName(), x.getSalary())).collect(Collectors.toList())
				.forEach(System.out::println);

	}

	// Problem 2
	// Transform your pipeline solution to prob2 so that
	// every lambda is replaced by an instance of a
	// local inner class of the correct type
	public static void prob2() {
		// use this list
		System.out.println("\n\n Problem 2\n\n\n");

		class YearPredicate implements Predicate<Transaction> {
			public boolean test(Transaction x) {
				int year = 2011;
				return x.getYear() == year;
			}
		}

		class TransactionCompare implements Comparator<Transaction> {

			@Override
			public int compare(Transaction x, Transaction y) {

				return x.getValue() - y.getValue();
			}
		}

		TraderTransactTestData.getTransactions().stream().filter(new YearPredicate()).sorted(new TransactionCompare())
				.collect(Collectors.toList()).forEach(System.out::println);
		;
	}

	// problem 3
	// Transform your pipeline solution to prob3 so that
	// every lambda is replaced by an instance of a
	// local inner class of the correct type
	public static void prob3() {
		// Use this list
		System.out.println("\n\n Problem 3 \n\n\n");

		class TransactionPredicate implements Predicate<Transaction> {
			public boolean test(Transaction x) {
				String city = "Cambridge";

				return x.getTrader().getCity().equals(city);
			}
		}

		class TransactionCompare implements Comparator<Transaction> {

			@Override
			public int compare(Transaction x, Transaction y) {

				return x.getTrader().getName().compareTo(y.getTrader().getName());
			}
		}

		TraderTransactTestData.getTransactions().stream().filter(new TransactionPredicate())
				.sorted(new TransactionCompare()).collect(Collectors.toList()).forEach(System.out::println);
		;

	}
}
