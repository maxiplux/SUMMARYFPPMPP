import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;



public class Locuras {
	public static void main(String[] args) {
		
		System.out.println("Linked List Example!");
		LinkedList <Integer>list = new LinkedList<Integer>();
		int num1 = 11, num2 = 22, num3 = 33, num4 = 44;
		int size;
		
		//Adding data in the list
		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.add(num4);
		size = list.size();
		
		Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("colas");
        System.out.println(queue.peek());
        System.out.println(queue.remove());        
        System.out.println(queue);
        System.out.println("Fin colas");
        /////////////////////////////////////        
        Stack<String> stack = new Stack<String>();
        System.out.println("Stack");
        stack.push("Java");
        stack.push("DotNet");
        stack.push("PHP");
        stack.push("HTML");        
        System.out.println(stack.peek());
        System.out.println(stack.pop());        
        System.out.println(stack);
        System.out.println("Fin Stack");
        ///////////////////////////////////
		Hashtable myhashtable = new Hashtable();
        myhashtable.put("A", new Integer(3));
        myhashtable.put("B", new Integer(2));
        myhashtable.put("C", new Integer(8));
        myhashtable.remove(new String("A"));
        System.out.print(myhashtable.get("A"));
        System.out.print(myhashtable.containsKey("A"));
        System.out.print(myhashtable.contains(new Integer(8)));        
        System.out.print(myhashtable.entrySet());
        System.out.print(myhashtable);        
        Set<Entry<String, String>> entires = myhashtable.entrySet();
        for(Entry<String,String> ent:entires)
        {
            System.out.println(ent.getKey()+" ==> "+String.format("%s", ent.getValue()));
        }
        
        
        HashMap<String, Integer> myhashmap = new HashMap<>();
        myhashmap.put("A", new Integer(3));
        myhashmap.put("B", new Integer(2));
        myhashmap.put("C", new Integer(8));
        myhashmap.remove(new String("A"));
        System.out.print(myhashmap.get("A"));
        System.out.print(myhashmap.containsKey("A"));
        System.out.print(myhashmap.containsValue(new Integer(8)));        
        System.out.print(myhashtable.entrySet());
        System.out.print(myhashtable);        
        Set<Entry<String, String>> entiresmap = myhashtable.entrySet();
        for(Entry<String,String> ent:entiresmap)
        {
            System.out.println(ent.getKey()+" |==> "+String.format("%s", ent.getValue()));
        }
		
	}
}
