

public class Node implements Comparable<Object> {
	
	public Object value;
	public Node next;
	public Node previous;
	
	public Node(Node previous,Object value, Node next) {
		super();
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append(this.value);
		if (this.next!=null)
		{
			builder.append(" >> Next --> "+String.valueOf(this.next.value));
		}
		
		if (this.previous!=null)
		{
			builder.append(" >> Previous -- > "+  this.previous.value);
		}
		
		
		return builder.toString();
	}
	@Override
	public int compareTo(Object o2) 
	{
		String o1=(String) this.value;
		String val2=(String) o2;
		return o1.compareTo(val2);
	}
	
	
}
