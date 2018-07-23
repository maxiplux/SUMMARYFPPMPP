package Problem4;

final class Triangle {

	
	private double base ;
	private double  height ;
	
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}


	public double computeArea() 
	{
		return  1.0/2.0 *  (this.base * this.height);
	}


	public double getBase() {
		return base;
	}


	public double getHeight() {
		return height;
	}
	
}
