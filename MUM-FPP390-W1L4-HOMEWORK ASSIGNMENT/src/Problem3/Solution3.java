package Problem3;

public class Solution3 {

	public static int binarySearch(int[] database, int index, int databaseSize, int goal)

	{
		if (databaseSize >= index) {
			int mid = index + (databaseSize - index) / 2;

			if (database[mid] == goal) {
				return mid;
			}

			if (database[mid] > goal) {
				return binarySearch(database, index, mid - 1, goal);
			}

			return binarySearch(database, mid + 1, databaseSize, goal);

		}

		return -1;

	}
	public static void main(String[] args) {
		int[] myarray = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		System.out.printf("the result of try to use binarysearch is %s",binarySearch(myarray, 0, myarray.length - 1, 10));

	}

}
