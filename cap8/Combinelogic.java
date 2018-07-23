import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinelogic {
	public static void main(String args[]){
		List<Number> list = new ArrayList();
		List<Integer> ilist = new ArrayList(Arrays.asList(10,20,30,40));
		List<Double> dlist = new ArrayList(Arrays.asList(10.56,20.34,30.56,40.67));
		List<Number> cmd = combine(ilist,dlist);
		System.out.println(cmd);
	}

	private static List<Number>combine(List<Integer> ilist, List<Double> dlist) {
			// TODO Auto-generated method stub
		List<Number> res = new ArrayList();
	//	res.addAll(ilist);
	//	res.addAll(dlist);
		for(Number n : ilist)
			res.add(n);
		for(Number n : dlist)
			res.add(n);
         
		return res;
	}

	
}
