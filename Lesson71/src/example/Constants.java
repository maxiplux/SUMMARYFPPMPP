package example;

public enum Constants {
	COMPANY( "Microsoft"),
	SALES_TARGET("20000000");
	
	
	 private String company;
	
	Constants (String  company)
	{
		this.company=company;
	}
	public String company()
	{
		return this.company;
	}
	
	
	
}
