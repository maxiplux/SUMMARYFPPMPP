package Problem1;

public class Customer {

	String firstName ;
	String lastName ;
	String socSecurityNum ;
	Address billingAddress;
	Address shippingAddress;
	public Customer(String firstName, String lastName, String socSecurityNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
		+ "]";
		}
	
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	

	public static void main(String[] args) {
		
		   String NAMECITY="CHICAGO";
		Customer pedro=new Customer("Pedro", "pablo", "DFDIF32304");
		Customer roberto=new Customer("roberto", "pombo", "R84332DS");
		Customer tarziso=new Customer("TARZISO", "pablo", "SDIDFO4332");
		
		Address chicago=new Address("Avenidad siempre viva 744", NAMECITY, "3213");
		Address newyork=new Address("SIX AV", "NEW YOUR", "4312");
		Address deli=new Address("100n 400th st", "farfield", "3932");
		
		pedro.setBillingAddress(chicago);
		roberto.setBillingAddress(newyork);
		tarziso.setBillingAddress(deli);
		
		Customer[]  database = new  Customer[3];
		database[0]=pedro;
		database[1]=roberto;
		database[2]=tarziso;
		
		for (Customer customer : database) {
			
			if  (customer.getBillingAddress() != null )
			{
				if (customer.getBillingAddress().getCity().equals(NAMECITY) )
				{
					System.out.printf("UPPS , we get a person from %s and her name is %s , %s",NAMECITY,customer.toString(),"\n");				
				}
				else 
				{
					System.out.println(customer);
					
				} 
			}
			else 
			{
				System.out.println(customer);
				
			}
			
			
			
		}
		
		
		
	}
	
	
	
	
	
}
