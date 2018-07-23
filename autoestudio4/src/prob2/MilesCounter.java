package prob2;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		
		List<Vehicle> result= new ArrayList<>();
		for (Object vehicle : vehicleArray) {
			result.add((Vehicle) vehicle );
			
		}
		
		
		return result;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		int total =0;
		for (Vehicle vehicle : vehicleList) {
			total=total+vehicle.getMilesUsedToday();
			
			
		}
		return total;
	}
}
