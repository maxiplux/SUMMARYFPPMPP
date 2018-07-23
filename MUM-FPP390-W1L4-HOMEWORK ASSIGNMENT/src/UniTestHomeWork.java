import static org.junit.Assert.*;
import org.junit.Test;
import Problem3.Solution3;
import Problem4.Solution4;


public class UniTestHomeWork 
{

	@Test
	public void goodBinarySearch() 
	{
		int[] database = { 1, 2, 3, 4, 5, 6, 7,8, 9, 10 };
		int find = 10 ;
		int expected = 9;
		assertEquals(expected, Solution3.binarySearch(database, 0, database.length, find));
		
	}
	@Test
	public void badBinarySearch() 
	{
		int[] database = { 1, 2, 3, 4, 5, 6, 7,8, 9, 10 };
		int find = 10 ;
		int expected =8;
		assertNotEquals(expected, Solution3.binarySearch(database, 0, database.length, find));
		
	}
	
	@Test
	public void badProblem4() 
	{
		assertNotEquals(false, Solution4.isPalindrome("Mum"));		
	}
	
	@Test
	public void goodProblem4() 
	{
		assertEquals(true, Solution4.isPalindrome("Mum"));		
	}
	

}
