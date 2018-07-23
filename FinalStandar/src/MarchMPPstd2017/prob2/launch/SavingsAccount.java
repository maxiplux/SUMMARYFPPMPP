package MarchMPPstd2017.prob2.launch;

public class SavingsAccount extends Account {
	private Double balance;	
	private String  accId; 
	private Double interesRate;
	
	
	public SavingsAccount(String accId, double interesRate, double startbalance) {
		// TODO Auto-generated constructor stub
		this.accId=accId;
		this.balance=startbalance;
		this.interesRate=interesRate;
	}

	@Override
	public
	String getAccountid() {
		// TODO Auto-generated method stub
		return this.accId;
	}

	@Override
	public
	Double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public
	Double computeUpdateBalance() {
		// TODO Auto-generated method stub
		this.balance=this.balance + (this.balance* this.interesRate);
		return this.balance;
	}

}
