package problem1;

public class Square extends Rectengle {

	public Square(double side, String color) {
		super(side, side, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcualteArea() {
		return this.width * this.height;
	}

	@Override
	double calculatePerimeter() {
		return 4 * this.width;

	}

}
