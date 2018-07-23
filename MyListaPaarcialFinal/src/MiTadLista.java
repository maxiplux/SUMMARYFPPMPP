
public class MiTadLista {

	Node header;
	
	
	public void addOrder(Object value) {
		if (this.header == null) {
			this.header = new Node(null, value,  null);
			return;
		}

		if (this.header.compareTo(value)>0 ) {
			Node new_node = new Node(null, value,  null);
			Node old = this.header; 
			new_node.next = new_node;
			this.header = new_node;
			return;
		}		
		Node current = this.header;
		Node previus = null;
		int index = 0;
		while (current != null && current.compareTo(value) < 0) {
			index++;
			previus = current;
			current = current.next;
			
			
		}
		
		
		
	}
boolean  addLast(String value) {
		
		
		if (this.header==null)
		{
			this.header = new Node(null, value, null);
			return  true;
		}
		
		Node temp=this.header;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next= new Node(temp, value, null);
		 
		return true;
	}
	
	boolean  addFirts(String value) {
		
		
		if (this.header==null)
		{
			this.header = new Node(null, value, null);
			return  true;
		}
		
		Node old=this.header;
		Node new_node= new Node(null, value, old);
		this.header=new_node; 
		return true;
	}



	@Override
	public String toString() {
		Node temp=this.header;
		StringBuilder builder=new StringBuilder();
		int index = 0; 
		while(temp!=null)
		{
			
			builder.append(String.format("(%s)->",String.valueOf(temp.value) ));
			temp=temp.next;
			index++;
			System.out.println(index);
		}
		return builder.toString();
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiTadLista lista= new MiTadLista();
		lista.addOrder("1");
		lista.addOrder("5");
		lista.addOrder("3");
		lista.addOrder("4");
		lista.addOrder("-4");
		//System.out.println("ss");
		System.out.println(lista);

	}

}
