package autoestudio;

 

public class JuanArrayListApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] database =new int []{1,3,5,456,3,63,-1,4,45,5};
		
		System.out.println(minSort(database));

	}

	
	public static int[] removeElement(int[] database, int goal)

	{
		int[] temp = new int[database.length ];
		int repeats = 0;
	

		for (int i = 0; i < database.length; i++) {
			if (database[i] == goal && repeats == 0) {
				repeats = 1;
				continue;
			}
			temp[i] = database[i];

		}

		return temp;

	}

	@SuppressWarnings("null")
	public static int minElement(int[] database)

	{
		 
		int min = database[0];
		for (int i = 0; i < database.length; i++) {
			if (min < database[i]) {
				min = database[i];

			}
		}
		return min;
	}

	public static int[] minSort(int[] database) {
		int[] container = new int[database.length];
		return minSort(database, container, 0);

	}

	private static int[] minSort(int[] database, int[] container, int index) {
		container[index] = minElement(database);
		return minSort(removeElement(database, container[index]) ,   container,   index+1) ;
	}

	
}
