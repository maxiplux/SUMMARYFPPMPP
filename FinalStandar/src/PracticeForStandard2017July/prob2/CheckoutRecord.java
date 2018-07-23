package PracticeForStandard2017July.prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord 

{

	
	@Override
	public String toString() {
		return "CheckoutRecord [checkoutRecordEntry=" + checkoutRecordEntry + "]";
	}


	List<CheckoutRecordEntry> checkoutRecordEntry;
	
	public List<CheckoutRecordEntry> getcheckoutEntryList(){
		return this.checkoutRecordEntry;
	} 
	
	
	public CheckoutRecord() {
		
		this.checkoutRecordEntry = new ArrayList<CheckoutRecordEntry>();
	}


	public void addCheckoutEntry(CheckoutRecordEntry checkoutRecordEntry) 
	{
		// TODO Auto-generated method stub
		this.checkoutRecordEntry.add(checkoutRecordEntry);
		
	}


	
	
	
}
