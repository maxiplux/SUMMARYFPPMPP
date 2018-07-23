package autoestudio;

 

public class Probador3 {

	public  static  void test(String  str) 
	{
		if (str== null || str.equals(""))
		{
			return;  
		}
		test(str.substring(1));
		
		System.out.print(str.charAt(0));
	}
	public static void main(String[] args) 
	{
		test("Quiz");

		 
		
	}
}
