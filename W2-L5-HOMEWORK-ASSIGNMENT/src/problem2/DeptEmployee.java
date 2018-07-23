package problem2;

import java.time.LocalDate;

public class DeptEmployee {
	String name;
	LocalDate hireDate;
	double salary;

	public DeptEmployee(String name, int yearOfHire, int monthOfHire, int dayOfHire, double salary) {

		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		this.salary = salary;
	}

	public double computeSalary() {
		return this.salary;

	}

}
