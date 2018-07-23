package problem1;

import java.util.ArrayList;


public class Solution1 {
	public static String[] PivotHelper(String[] array, String pivot, Boolean less) {

		ArrayList<String> temp = new ArrayList<String>();
		if (array.length <= 1 || array == null) {

			return temp.toArray(new String[temp.size()]);

		}

		for (int i = 0; i < array.length; i++) {
			if (less) {

				if (array[i].hashCode() < pivot.hashCode()) 
				{
					temp.add(array[i]);
				}
			}

			else {
				if (array[i].hashCode() > pivot.hashCode())
				{
					temp.add(array[i]);
				}
			}

		}

		return temp.toArray(new String[temp.size()]);

	}

	public static String[] JoinHelper(String[] left, String pivot, String[] right) {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < left.length; i++) 
		{
			temp.add(left[i]);

		}
		temp.add(pivot);
		for (int i = 0; i < right.length; i++) {
			temp.add(right[i]);

		}
		return temp.toArray(new String[temp.size()]);

	}
	
	public static String[] quickSort(String[] array) {

		if (array.length <= 1) {
			return array;

		}

		String  pivot = array[0];

		String[] left = quickSort(PivotHelper(array, pivot, true));

		String[] right = quickSort(PivotHelper(array, pivot, false));

		return JoinHelper(left, pivot, right);

	}
	
	
	public static void main(String[] args) 
	{
		
		String  string1="ace";
		String   string2= "bdf";
		StringBuilder temp = new StringBuilder();
		temp.append(string1);
		temp.append(string2);
		
		String[] listBase =temp.toString().split("");
		String[] result = quickSort(listBase);	 		
		StringBuilder builder = new StringBuilder();
		for (String string : result) {
		    builder.append(string);
		}
		System.out.println(  builder );

	}

}
