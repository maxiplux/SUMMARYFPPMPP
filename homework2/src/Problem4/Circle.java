package Problem4;

final  class Circle {

	
	private double radius;

	public double computeArea() 
	{	
		return Math.PI * Math.pow(radius,2);
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
}
