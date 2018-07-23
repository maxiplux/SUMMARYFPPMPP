package problem3.employeeinfo;
import static java.util.Optional.ofNullable;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	
	
	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		
		
		
		
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		if (this.checkingAcct == null ) {
			this.checkingAcct=new Account(this, AccountType.CHECKING, startAmount);
			
		}
		
		
		
	}

	public void createNewSavings(double startAmount) {
		
				if (this.savingsAcct == null ) {
					this.savingsAcct=new Account(this, AccountType.SAVINGS, startAmount);
					
				}
		
	}

	public void createNewRetirement(double startAmount) {
		if (this.retirementAcct == null ) 
		{
			this.retirementAcct=new Account(this, AccountType.RETIREMENT, startAmount);
			
		}
		
	}

	public String getFormattedAcctInfo()	
	{
		String template  = "ACCOUNT INFO FOR %s\n\n%s%s%s";		
		return String.format(template,this.getName(), (this.checkingAcct==null?"":this.checkingAcct),(this.savingsAcct==null?"":this.savingsAcct) ,(this.retirementAcct==null?"":this.retirementAcct) );		
	}
	public void deposit(AccountType acctType, double amt){		
		switch (acctType) 
		{
		case CHECKING:
			this.checkingAcct.makeDeposit(amt);
			
			break;
		
		case RETIREMENT:
			this.retirementAcct.makeDeposit(amt);
			
			break;
		case SAVINGS:
			this.savingsAcct.makeDeposit(amt);			
			break;
		default:
			System.out.println("the type that your enter is not define on our database");
			break;
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		switch (acctType) 
		{
		case CHECKING:
			return this.checkingAcct.makeWithdrawal(amt);
			
			 
		
		case RETIREMENT:
			return this.retirementAcct.makeWithdrawal(amt);
			
			 
		case SAVINGS:
			return this.savingsAcct.makeWithdrawal(amt);			
		default:
			System.out.println("the type that your enter is not define on our database");
			break;
		}
		return false;
	}

}
