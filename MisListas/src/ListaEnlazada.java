
public class ListaEnlazada {
	Node header;

	public ListaEnlazada() {
		
		this.header = null;
	}
	
	
	public void addFront(String value)
	{
		
		if (this.header==null)
		{
			this.header= new Node(null,value,null);
			return; 
			
		}
		
		Node n=new Node(null,value,this.header);
		this.header.next= n;
		this.header=n;
		
	}
	

}
