package autoestudio;

import java.nio.file.ProviderNotFoundException;
import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.Collections;

public class Shopping {
	
	

	
	String name;
	Double price;
	
	
	
	@Override
	public String toString() {
		return "Shopping [name=" + name + ", price=" + price + "]";
	}
	public Shopping(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

	public static void main(String[] args) {
		 ArrayList<Shopping> database = new ArrayList<>();
		 database.add(new Shopping("wallmart", 993.3));
		 database.add(new Shopping("wallmart2", 8723.3));
		 database.add(new Shopping("wallmart3", 3111.3));
		 database.add(new Shopping("wallmart4", 754.3));
		 System.out.println(database);
		 //database.sort((Shopping o1, Shopping o2)->o1.getPrice().compareTo(o2.getPrice()));
		 
		 
		 Collections.sort(database, new sortShopping(null));
		 
		 database.sort(new sortShopping(null));
		 System.out.println(database);
		 
		 
	}

	
	

}
