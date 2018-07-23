package MarchMPPstd2017.prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		return list.stream().mapToDouble(x-> x.computeUpdatedBalanceSum()).sum();
	}
}
