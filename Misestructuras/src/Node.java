
public class Node {
	String name;
	Double salary;
	Node previous;
	Node next;
	
	public Node(Node previous,String name, Double salary, Node next) {		
		this.name = name;
		this.salary = salary;
		this.previous = previous;
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append(String.format("<%s/%s>", this.name,this.salary));
		if (this.previous!=null) {
		builder.append(String.format("<--(%s/%s)", this.previous.name,this.previous.salary));
			
		}
		if (this.next!=null) {
			builder.append(String.format("-->(%s/%s)", this.next.name,this.next.salary ));
				
			}
			
		return builder.toString();
	}
	
	
	
}
