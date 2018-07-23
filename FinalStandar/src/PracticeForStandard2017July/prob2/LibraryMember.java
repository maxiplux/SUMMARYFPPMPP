package PracticeForStandard2017July.prob2;

public class LibraryMember {

	private String memberId; private String firtsName; private String lastName; private  String phone;
	
	private CheckoutRecord checkoutRecord;
	
	public LibraryMember(String id, String fname, String lname, String phone) {
	
		this.memberId = id;
		this.firtsName = fname;
		this.lastName = lname;
		this.phone = phone;
	}
	

	

	@Override
	public String toString() {
		return "LibraryMember [memberId=" + memberId + ", firtsName=" + firtsName + ", lastName=" + lastName
				+ ", phone=" + phone + ", checkoutRecord=" + checkoutRecord + "]";
	}




	public String getMemberId() {
		return memberId;
	}



	public String getFirtsName() {
		return firtsName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getPhone() {
		return phone;
	}



	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		// TODO Auto-generated method stub
		this.checkoutRecord=checkoutRecord;
	}
	public CheckoutRecord getCheckoutRecord() {
		// TODO Auto-generated method stub
		return this.checkoutRecord;
	}
	



	
	
}
