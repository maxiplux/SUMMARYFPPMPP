package problem1;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] database = { new Rectengle(45, 21, "gray"), new Circle("Black", 5),
				new Circle("Brown", 51), new Square(3, "Blue"), new Rectengle(84, 23, "Yellow"), };
		printTotal(database);

	}

	public static void printTotal(Shape[] shapes) {
		int index = 0;
		for (Shape shape : shapes) {
			String className = shape.getClass().getName();
			System.out.printf(
					"The class on index %s , with Class Name  %s and the perimiter of it is %s  and  the Area %s \n",
					index, className, shape.calculatePerimeter(), shape.calcualteArea());
			index = index + 1;
		}
	}

}
