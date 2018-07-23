package Problem4;

public abstract class Employee {
	String firtsName;
	String lastName;
	String socialSecurityNumber;

	public abstract double getPayment();

	public Employee(String firtsName, String lastName, String socialSecurityNumber) {
		super();
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

}
