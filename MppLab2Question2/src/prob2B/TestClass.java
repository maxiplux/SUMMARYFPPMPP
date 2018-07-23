package prob2B;

import java.net.NetworkInterface;

import prob2A.GradeReport;
import prob2A.Student;

public class TestClass {
	
	
	public static void main(String[] args) {
		OrderLine line1= new OrderLine();
		OrderLine line2= new OrderLine();
		OrderLine line3= new OrderLine();
		Order order = new Order();
		order.addOrder(line1);
		order.addOrder(line2);
		order.addOrder(line3);
		
		
		
		System.out.println(order);
		

	}


}
