package PracticeForStandard2017July.prob2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members
	//who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		List<LibraryMember> results = new ArrayList<>();
		//implement
		
		
		for (LibraryMember member : members) {
			System.out.println(item);
			for (CheckoutRecordEntry cre : member.getCheckoutRecord().getcheckoutEntryList()) {
				if (cre.getLendingItem().equals(item))
				{
					results.add(member);
				}
				
			} 
			
			
		}
		
		return results.stream()
				.map(x-> x.getPhone())
				.sorted((e1,e2) -> e1.compareTo(e2) )
				.collect(Collectors.toList());
	}
}
