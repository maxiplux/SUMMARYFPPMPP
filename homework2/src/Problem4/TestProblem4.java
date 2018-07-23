package Problem4;

import java.util.Scanner;

public class TestProblem4 {
	
	
	public static  void menuOptions()
	{
		
		
		
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		Scanner in = new Scanner(System.in);		
		String option=in.nextLine();
		option=option.toUpperCase();
		switch (option) {
		case "C":
			proceesCircle();
			break;

		case "R":
			proceesRectangle();
			break;
		case "T":
			proceesTriangle();
			break;			
		default:
			System.out.println("Option no found");
			break;
		}
		in.close();
		
		
	}
	private static void proceesTriangle() {
		Scanner in = new Scanner(System.in);		
		System.out.println("Enter the base of the Triangle");
		double base=in.nextDouble();
		System.out.println("Enter the height of the Triangle");
		double height=in.nextDouble();
		Triangle figure=new Triangle(base, height);
		System.out.printf("The area of Triangle is : %s \n",figure.computeArea());
		in.close();
		
	}
	private static void proceesRectangle() {
		
		Scanner in = new Scanner(System.in);		
		System.out.println("Enter the width of the Rectangle");
		double width=Double.parseDouble(in.nextLine());
		System.out.println("Enter the height of the Rectangle");
		double height=Double.parseDouble(in.nextLine());
		Rectangle figure=new Rectangle(width, height);
		System.out.printf("The area of Rectangle is : %s \n",figure.computeArea());
		in.close();
		
		
		
		
	}
	private static void proceesCircle() {
		Scanner in = new Scanner(System.in);		
		System.out.println("Enter the radius of the Circle");
		double radius=in.nextDouble();
		Circle figure=new Circle(radius);
		System.out.printf("The area of Circle is : %s \n",figure.computeArea());
		in.close();
		
	}
	public static void main(String[] args) 
	{
		menuOptions();
		
	}
}
