package example;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void sum(int x)
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println(Constants.COMPANY.company());
		System.out.println(Constants.SALES_TARGET.company());
		List<Integer> arrays = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			arrays.add(i);
			
		}
		arrays.forEach(Main::sum);
		

	}

}
