package problem2;

public class testProblem2 {
	public static void main(String[] args) {
		
		Employee employee = new Employee("Juan Francisco", "Maxiplux", 1500000, 2018, 1, 30);
		Account account_checking = new Account(employee, AccountType.CHECKING,300.0);
		Account account_savings = new Account(employee, AccountType.SAVINGS,300.0);
		Account account_retirement = new Account(employee, AccountType.RETIREMENT,300.0);
		
		account_checking.makeDeposit(100);
		account_savings.makeDeposit(100);
		account_retirement.makeDeposit(100);
		
		account_checking.makeWithdrawal(50);
		account_savings.makeWithdrawal(50);
		account_retirement.makeWithdrawal(50);
		
		Account[] database = {account_checking,account_savings,account_retirement};
		
		for (Account account : database) {
			System.out.println(account);
			
		}
		
		
		
		
		
		
		
		
		
			}

}
