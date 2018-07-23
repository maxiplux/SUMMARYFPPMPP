package prob1;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
			if (this.header==null)
			{
				
				Node new_node= new Node();
				new_node.value=item;
				this.header=new_node;
				return;
			}
			Node new_node= new Node();
			new_node.value=item;
			Node temp=this.header;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			new_node.previous=temp;
			temp.next=new_node;
			
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
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
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Bill");
			list.addLast("Tom");
			list.addLast("Carol");
			System.out.println(list);
		}
}
