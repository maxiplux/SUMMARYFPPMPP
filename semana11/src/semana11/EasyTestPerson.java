package semana11;

import java.util.Scanner;

public class EasyTestPerson {
public static void main(String[] args) {
		
		
		 Person personita= new Person();
		 personita.setFname("francisco");
		 personita.setLname("juan");
		 personita.setGender("hombre");
		System.out.println(personita);
		Person[] arraytinypersons= new Person[5];
		arraytinypersons[0]= new Person("juan","mosquera","macho");
		
		System.out.println(arraytinypersons);
		
		
		
		
		} 

}
