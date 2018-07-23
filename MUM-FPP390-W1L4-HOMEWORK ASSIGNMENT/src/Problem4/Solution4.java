package Problem4;

public class Solution4 {

	public static Boolean isPalindrome(String string)
	{
		StringBuilder builder = new StringBuilder();
		for (int i = string.length() -1 ; i !=-1 ; i--) 
		{
			builder.append( String.valueOf(string.charAt(i)));
			
		
			
		}
		 
		return string.equalsIgnoreCase(builder.toString()) ;
	}
	public static void main(String[] args) 
	{	
		String string= "mum";
		System.out.printf("is Palindrome %s %s",string , ( isPalindrome(string) ?  "Yes" : "No" ));

	}
}
