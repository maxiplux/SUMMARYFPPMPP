package Problem1;

public class Address {
	private String  street;
	private  String  city;
	private  String  zip;
	
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZip() {
		return zip;
	}

	public Address(String street, String city, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
	

	
}
