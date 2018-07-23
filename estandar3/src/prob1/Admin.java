package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		
		HashMap<Key, Student> result = new HashMap<>();
		Iterator<Student>i = students.iterator();
		while(i.hasNext())
		{
			Student student = i.next();
			Key key=new Key(student.getFirstName(), student.getLastName());
			result.put(key, student);

		}
		return result;
	}
}
