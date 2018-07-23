package prob2;
 
import java.util.*;
public class Statistics  {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData>  aList) {
		double result = 0.0;
		for (EmployeeData employeeData : aList) {
			
			result=result+ employeeData.getSalary();
		}
		return result;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
