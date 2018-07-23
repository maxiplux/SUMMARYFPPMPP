package Prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) 
	{	
		HashMap<Key, Student>  result= new HashMap<Key, Student>();
		 
		for (Student student : students) {
			Key key= new Key(student.getFirstName(), student.getLastName());
			result.put(key, student);
			
			
		}
		return result;
	}
}
