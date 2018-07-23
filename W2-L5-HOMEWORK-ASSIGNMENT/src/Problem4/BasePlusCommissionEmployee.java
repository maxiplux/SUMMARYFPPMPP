package Problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	double baseSalary;

	public BasePlusCommissionEmployee(String firtsName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firtsName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;

	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", grossSales=" + grossSales
				+ ", commissionRate=" + commissionRate + ", firtsName=" + firtsName + ", lastName=" + lastName
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	@Override
	public double getPayment() {

		return this.baseSalary + (this.grossSales * this.commissionRate);
	}

}
