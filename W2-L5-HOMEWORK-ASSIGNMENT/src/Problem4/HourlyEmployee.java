package Problem4;

public class HourlyEmployee extends Employee {
	double wage;
	double hours;

	@Override
	public String toString() {
		return "HourlyEmployee -->wage=" + wage + ", hours=" + hours + ", firtsName=" + firtsName + ", lastName="
				+ lastName + ", socialSecurityNumber=" + socialSecurityNumber + "<----";
	}

	public HourlyEmployee(String firtsName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firtsName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return this.wage * this.hours;
	}

}
