package prob1;



public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() {
		if (this.isEmpty())
		{
			throw new IllegalStateException("The list is empty");
		}
		
		if (this.header.next==null)
		{
			throw new IllegalStateException("The list only have on element , you can  delete it ");
		}
		
		Node temp = this.header.next;
		Node to_delete=temp.next;
		String value_to_delete=to_delete.value;
		temp.next=to_delete.next;
		to_delete=null;
		
		
		
		
				
		return value_to_delete;
	}
	
	public boolean isEmpty() {
		//implement
		return this.header.next==null ;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Bill");
		list.addLast("Tom");
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		System.out.println(list);

	}
}
