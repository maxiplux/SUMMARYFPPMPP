package MarchMPPstd2017.prob2;

import java.util.ArrayList;
import java.util.List;

import MarchMPPstd2017.prob2.launch.Account;

public class Employee {
	private String name;
	private List<Account> accts;
	public Employee(String name) {
		super();
		this.accts=new ArrayList<Account>();
		this.name = name;
	}
	 

	public double computeUpdatedBalanceSum() {		
		return this.accts.stream().mapToDouble(x-> x.computeUpdateBalance()).sum();
	}

	public void addAccount(Account account) {
		
		
		this.accts.add(account);
	}

	
}
