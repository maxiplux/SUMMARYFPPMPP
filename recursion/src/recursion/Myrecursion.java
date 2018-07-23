package recursion;

public class Myrecursion {

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

	public static int linearSearch(Object[] items, Object target) {
		// invoke private method to pass all the arguments
		return linearSearch(items, target, 0);
	}

	// Recursive Method - private
	private static int linearSearch(Object[] items, Object target, int posFirst) {
		if (posFirst == items.length) {
			return -1;
		} else if (target.equals(items[posFirst])) {
			return posFirst;
		} else {
			return linearSearch(items, target, posFirst + 1);
		}
	}

	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int[] myarray = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		System.out.printf("the result of try to use binarysearch is %s",
				binarySearch(myarray, 0, myarray.length - 1, 10));

	}

}
