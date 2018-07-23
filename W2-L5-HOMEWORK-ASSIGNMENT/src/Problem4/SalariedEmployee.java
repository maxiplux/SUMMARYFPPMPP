package Problem4;

public class SalariedEmployee extends Employee {
	double weeklySalary;

	public SalariedEmployee(String firtsName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firtsName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPayment() {

		return this.weeklySalary;
	}

}
