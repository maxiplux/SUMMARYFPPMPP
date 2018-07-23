package problem1;

public class Circle extends Shape {

	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double calcualteArea() {
		

		return Math.PI * this.radius * this.radius;
	}

	@Override
	double calculatePerimeter() {
		return 2 * Math.PI * this.radius;

	}

}
