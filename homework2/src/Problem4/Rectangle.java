package Problem4;

final class Rectangle {
	private double width;
	private double  height;
	public Rectangle(double width, double height)
	{
		this.width=width;
		this.height=height;
		
	}
	public double computeArea() 
	{
		 
		return (1.0/2.0) * (this.width * this.height);
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	
	
	

}
