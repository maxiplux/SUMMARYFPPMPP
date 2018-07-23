package Problem4;

import java.text.NumberFormat;
import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {

		Employee eduardo = new CommissionEmployee("Juan ", "Francisco", "14623807", 2500, 0.1);
		Employee jhon = new HourlyEmployee("Juan", "Francisco", "31251721", 50000, 12);	
		Employee frank = new SalariedEmployee("Frank ", "Salazar", "38487", 3000);
		Employee alejandra = new BasePlusCommissionEmployee("Alenadra", "Saavedra", "8489823", 8478398, 0.1, 95000);
		Employee[] database = { eduardo, jhon, frank, alejandra };
		double total_salary = Arrays.stream(database).mapToDouble(o -> o.getPayment()).sum();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(total_salary);
		System.out.printf("The Total salary of database of employees is %s \n", moneyString);

	}
}
