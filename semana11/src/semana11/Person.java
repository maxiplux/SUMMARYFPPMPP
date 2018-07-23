package semana11;
public class Person {

	String fname;
	String lname;
	String gender;
	
	public  Person()  {
		
	}
	
	
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", gender=" + gender + "]";
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public  Person(String name,String lname, String  gender){
	
		this.fname=name;
		this.lname=lname;
		this.gender=gender;
		
	}	
	
}
