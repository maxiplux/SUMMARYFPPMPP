package mijava8;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list  = new ArrayList<Integer>();
		int Max = 9009;
		for (int Min = -100 ; Min < 100 ; Min++) {
			
			list.add(Min + (int)(Math.random() * ((Max - Min) + 1))) ;
				
			
		}
		
		list.sort( (s1, s2) -> s1==s2  ? 0 : s1<s2 ? -1 :1 );
		System.out.println(list);
		
		
		
	}

}
