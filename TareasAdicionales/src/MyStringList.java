import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {

		if (this.size >= this.strArray.length) {
			this.resize();
		}

		this.strArray[this.size] = s;
		this.size++;

	}

	public String get(int i) {
		if (i >= this.strArray.length) {
			return null;

		}
		return this.strArray[i];
	}

	public boolean find(String s) {
		for (String string : strArray) {
			if (string != null) {
				if (string.equals(s)) {
					return true;
				}
			}

		}
		return false;
	}

	public void insert(String s, int pos) {
		// implement
		if (pos < this.size) {
			this.strArray[pos] = s;
		}

	}

	public boolean remove(String s) {
		if (this.find(s)) 
		{

			String[] temp_strArray = new String[this.size-1];
			int ocurrence = 0;
			int index = 0;
			this.size = this.size - 1;

			for (String string : strArray) {

				if (s.equals(string) && ocurrence == 0) {
					ocurrence = 1;
					continue;

				}

				else {
					temp_strArray[index] = string;
				}

				index++;

			}

			this.strArray = temp_strArray;
			return true;

		}
		return false;
	}

	private void resize() {
		String[] tmpArray = new String[this.strArray.length + strArray.length / 2];
		System.arraycopy(this.strArray, 0, tmpArray, 0, this.strArray.length);

		strArray = tmpArray;

	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (String string : strArray) {
			if (string != null) {
				builder.append(string);

				builder.append(",");

			}

		}
		builder.replace(builder.length() - 1, builder.length(), "");
		builder.append("]");
		return builder.toString();
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();

		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	}

}
