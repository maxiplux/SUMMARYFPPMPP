
public class Problem {

	
	public static Boolean existsValue(String values,String c)
	{
		String [] temp = values.split("");
		for (String val : temp) {
			if (val.equals(c))
			{
				return true;
			}
			
		}
				
		return false;
		
	}
	
	public static String removeDuplicates(String word)
	{
		String Container =new String ("");
		return removeDuplicates(word,Container);
	}
	
	public static String removeDuplicates(String values,String Container)
	
	{
		if (values==null)
		{
			return Container;
		}
		if (values.length() == 0)
			
		{
			return Container;
		}
		
		String value= String.valueOf(values.charAt(0));
		
		if (!existsValue(Container, value))
		{
			Container=Container+value;
		}
		
		return removeDuplicates(values.substring(1), Container);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "AABBCDEAAA";
		System.out.println(removeDuplicates(cadena));
		

	}

}
