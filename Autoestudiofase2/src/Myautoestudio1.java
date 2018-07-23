
public class Myautoestudio1 {

	public static int bs(int[] array, int value, int low, int hig) {

		if (low <= hig) {
			int mid = (low + hig) / 2;
			if (array[mid] == value) {
				return mid;
			}

			if (array[mid] < value) {
				low = mid - 1;
				return bs(array, value, mid - 1, hig);
			} else {
				
				return bs(array, value, low, mid + 1);
			}
		}
		return -1;
	}

	public static int bs(int[] array, int value) {
		int low = 0;
		int hig = array.length;
		while (low <= hig) {
			int mid = (low + hig) / 2;
			if (array[mid] == value) {
				return mid;
			}

			if (array[mid] < value) {
				low = mid - 1;
			} else {
				hig = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		System.out.println(bs(myarray, 6));

	}

}
