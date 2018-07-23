package mytestcases;

import static org.junit.Assert.*;

import org.junit.Test;

import problem1.MyFirtsRecursion;

public class MyFirtsRecursionTest {

	@Test
	public void base() 
	{
		int[] database = { 1, 2, 3, 4, 5, 6, 7,8, 9, 10 };
		int find = 10 ;
		int expected = 9;
		assertEquals(expected, MyFirtsRecursion.binarySearch(database, 0, database.length, find));
		
	}
	@Test
	public void baseNoequal() 
	{
		int[] database = { 1, 2, 3, 4, 5, 6, 7,8, 9, 10 };
		int find = 10 ;
		int expected =8;
		assertNotEquals(expected, MyFirtsRecursion.binarySearch(database, 0, database.length, find));
		
	}

}
