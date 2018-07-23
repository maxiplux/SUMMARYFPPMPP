package april2017.startupCode.prob1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeAdmin {

	// returns a list of social security numbers, sorted in ascending order,
	// that belong to an Employee in the input table but that are not on the
	// socSecNums input list
	public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		
		return table.values().stream() 
				
				.filter(x -> !socSecNums.contains(x.getSsn()) )
				.map((x) -> x.getSsn())
				.sorted(Comparator.comparing(String::toString))
				.collect(Collectors.toList());
				
	}			
		//return a list of Employees whose social security number 
				//is on the input list socSecNums
				//and whose salary is >80000; the return list does not need to be sorted  
	public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) 
	{
		int salary =  8000; 
		List<Employee> cz =  table.entrySet().stream()
								.map(Map.Entry::getValue)
									.filter(x-> socSecNums.contains(x.getSsn()))
										.filter(x-> x.getSalary()> salary )
												.collect(Collectors.toList());
		
		return cz;
	}
}