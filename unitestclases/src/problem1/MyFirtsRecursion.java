package problem1;

public class MyFirtsRecursion {
	public static int binarySearch(int[] database, int index, int databaseSize, int goal)

	{
		if (databaseSize >= index) 
		{
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

}
