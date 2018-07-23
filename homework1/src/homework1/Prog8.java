package homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class Prog8 {

	public static int[] PivotHelper(int[] array, Integer pivot, Boolean less) 
	{

		//ArrayList<Integer> temp = new ArrayList<Integer>();
		
		int[] temp = new int[0];
		
		if (array.length <= 1 || array == null) 
		{

			return temp ;//temp.stream().mapToInt(Integer::intValue).toArray();

		}

		for (int i = 0; i < array.length; i++)
		{
		 
			if (less) 
			{

				if (array[i] < pivot) 
				{
					
					 
					temp = Arrays.copyOf(temp, temp.length +1);
					temp[temp.length-1] = array[i];
				     	 
				}
			}

			else {
				if (array[i] > pivot) {
					
					 
					temp = Arrays.copyOf(temp, temp.length +1);
					temp[temp.length-1] = array[i];
					 
				}
			}

		}

		return temp;

	}

	public static int[] JoinHelper(int[] left, Integer pivot, int[] right)
	{
		int[] temp = new int[0];
		
		
		
		
		for (int i = 0; i < left.length; i++) {
			
			temp = Arrays.copyOf(temp, temp.length +1);
			temp[temp.length-1] = left[i];

		}
		
		temp = Arrays.copyOf(temp, temp.length +1);
		temp[temp.length-1] = pivot;
		
		
		for (int i = 0; i < right.length; i++) {
			
			
			temp = Arrays.copyOf(temp, temp.length +1);
			temp[temp.length-1] = right[i];

		}
		return temp;

	}

	public static int[] quickSort(int[] array) {

		if (array.length <= 1) {
			return array;

		}

		Integer pivot = array[0];

		int[] left = quickSort(PivotHelper(array, pivot, true));

		int[] right = quickSort(PivotHelper(array, pivot, false));

		return JoinHelper(left, pivot, right);

	}

	public static void main(String[] args) {

		int[] listBase = new int[] { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22 };

		int[] result = quickSort(listBase);

		System.out.println(Arrays.toString(result));


	}

}
