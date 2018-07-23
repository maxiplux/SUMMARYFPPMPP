package semana11;

import java.util.Scanner;

public class ScannerHas {
	public static void main(String[] args) {

	      String s = "Hello World!\n641472";
	      	      
	      // create a new scanner with the specified String Object
	      Scanner scanner = new Scanner(s);
	    
	      // check if the scanner has a token
	      System.out.println("" + scanner.hasNext());

	      // print the rest of the string
	      System.out.println("" + scanner.nextLine());

	      // check if the scanner has an Integer  
	         System.out.println("" + scanner.hasNextInt());
	         System.out.println("" + scanner.nextInt());
	         
	     //     check if the scanner has a token
	           System.out.println("" + scanner.hasNextLine());
	         
	         
	      // close the scanner
	      scanner.close();
	   }
}
