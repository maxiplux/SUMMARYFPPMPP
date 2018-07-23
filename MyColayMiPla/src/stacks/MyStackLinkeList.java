package stacks;
import core.Node;

public class MyStackLinkeList implements Stack {
	
	Node header ;
	

	public MyStackLinkeList() 
	{
		
		this.header = new Node(null,null,null);
		
	}
	

	
	@Override
	public Boolean push(Object value) 
	{
		if( this.header.value==null )
		{
			this.header.value=value;
			return true;
		}		
		if (this.header.next == null)
			
		{
			Object old_value=this.header.value;
			this.header.value=new Node(null, value,null);
			this.header.next=new Node(this.header, old_value,null);
			return true;
		}
		
				
		Node new_value=new Node(null, value,null);
		Node old_node=this.header;
		this.header=new_value;
		this.header.previous=null;
		this.header.next=old_node;
		old_node.previous=this.header;
		return true;
	}
	
//	@Override
//	public Boolean push(Object value) 
//	{
//		if( this.header.value==null )
//		{
//			this.header.value=value;
//			return true;
//		}
//		
//		if (this.header.next == null)
//			
//		{
//			this.header.next=new Node(this.header, value,null);		
//			return true;
//		}
//		
//		Node temp= this.header.next;
//		while(temp.next!=null)
//		{
//			temp=temp.next;
//		}
//		Node new_node=new Node(temp, value,null);
//		temp.next=new_node;
//		return true;
//	}

	@Override
	public Object pop() {
		Object value = this.header.value;
		this.header=this.header.next;		
		return value;
	}

	@Override
	public Object peek() {		
		return this.header.value;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.header.value+">");
		if (this.header.next==null)
		{
			return builder.toString();
			
		}
		Node temp= this.header.next;
		while (temp!=null)
			
		{
			
			builder.append(String.format("-- >  %s",temp.value));
			temp=temp.next;
			
		} 
		return builder.toString();
		
		
	}


	public static void main(String[] args) {
		MyStackLinkeList pila= new MyStackLinkeList();
		
		for (int i = 0; i <= 100; i++) {
			
			pila.push(String.format(" La vida es hermosa %s", i));
		}
		
		
	System.out.println(pila);
	}
	

}
