package problem2;

public class Secretary extends DeptEmployee {

	double overtimeHours;

	public Secretary(String name, int yearOfHire, int monthOfHire, int dayOfHire, double salary) {
		super(name, yearOfHire, monthOfHire, dayOfHire, salary);
		this.overtimeHours = 0;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		return this.salary + 12 * this.overtimeHours;

	}

}
