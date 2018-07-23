package prob2;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List <Student> convertArray(Object[] studentArray) 
	{
		List <Student> result = new ArrayList<>(); 
				
		for (Object object : studentArray) {
			result.add((Student) object);
			
		}
		return result;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		
		double result=0.0;
		
		for (Student student : studentList) {
			
			result=result+student.computeGpa();
			
		}
		return result/studentList.size();
	}
}
