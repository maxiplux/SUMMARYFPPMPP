package Problem4;

public class CommissionEmployee extends Employee {

	double grossSales;
	double commissionRate;

	public CommissionEmployee(String firtsName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firtsName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return "CommissionEmployee --->grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", firtsName="
				+ firtsName + ", lastName=" + lastName + ", socialSecurityNumber=" + socialSecurityNumber + "<----";
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return this.grossSales * this.commissionRate;
	}

}
