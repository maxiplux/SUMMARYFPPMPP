package problem3.employeeinfo;

class Account {
 
	
	 

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType  acctType;
	
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance ) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
		
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString()
	{
		String template  = "";
		if (this.acctType!=null)
		{
			template  = String.format("Account type: %s", this.acctType);	
		}
		
		if (this.acctType!=null)
		{
			template = template + String.format("\nCurrent bal: %s\n", this.getBalance());	
		}
	
		
		return template;
	}

	public void makeDeposit(double deposit) {
		// implement
		this.balance=this.balance+deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (this.balance <= amount)
		{
			this.balance=this.balance-amount;
			return true;
			
		}
		 
		return false;
	}

	public static double getDefaultBalance() {
		return DEFAULT_BALANCE;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
  
	
}
