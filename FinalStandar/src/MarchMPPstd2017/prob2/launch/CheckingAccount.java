package MarchMPPstd2017.prob2.launch;

public class CheckingAccount extends Account {

	private Double balance;	
	private String  accId; 
	private Double monthyFee;
	
	public CheckingAccount(String string, double fee, double startBalance) {
		// TODO Auto-generated constructor stub
		this.monthyFee=fee;
		this.balance=startBalance;
		
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
		this.balance=this.balance-this.monthyFee;
		return this.balance;
	}

}
