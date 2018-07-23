
public class Mylista {
	Node header;

	public void addOrder(String name, Double salary) {
		if (this.header == null) {
			this.header = new Node(null, name, salary, null);
			return;
		}

		if (this.header.salary > salary) {
			Node new_node = new Node(null, name, salary, null);
			Node old = this.header;

			new_node.next = new_node;
			this.header = new_node;
			return;
		}
		
		Node current = this.header;
		Node previus = null;
		while (current != null && current.salary < salary) {
			 
			previus = current;
			current = current.next;
		}
		if (current == null) {
			previus.next = new Node(previus, name, salary, null);
		} 
		else {
			Node nuevo = new Node(previus, name, salary, current);			
			current.previous = nuevo;
			if (previus!=null)
			{
				previus.next = nuevo;
			}
			
		}
	}
	
	public boolean insertAt(int pos,String  name,Double salary) 
	{
		if (this.header == null) {
			
			return false;
		}
		
		if (pos==0) {
			Node old=this.header;
			Node new_node=new Node(old.previous, name, salary, old);
			this.header=new_node;
			return true;
		}
		Node temp = this.header;
		int index=0;
		while (temp!=null)
		{
			
			if (index==pos)
			{
				
				Node old=temp;
				Node new_node=new Node(old.previous, name, salary, old);
				if (old.previous!=null)
				{
					old.previous.next=new_node;
					
				}
				
				temp=new_node;
				System.out.println(temp);
				return true;
			}
			index++;
			temp=temp.next;
			
		}
		return false;
			

	}
	
	public boolean deleteAt(int pos) 
	{
		if (this.header == null) {
			
			return false;
		}
		Node temp = this.header;
		int index=0;
		while (index<pos & temp!=null)
		{
			index++;
			temp=temp.next;
			if (index==pos)
			{
				Node old=temp;
				temp.previous.next=temp.next;
				temp=null;
				return true;
			}
			
		}
		return false;
			

	}
	public void addFront(String name, Double salary) {
		if (this.header == null) {
			this.header = new Node(null, name, salary, null);
			return;
		}
		Node old = this.header;
		Node new_node = new Node(null, name, salary, null);
		new_node.next = old;
		this.header = new_node;

	}
	
	public boolean add(int pos,String name, Double salary) 
	{
		
		if (pos > this.size() )
		{
			 
			return false;
		}
		if (pos < 0)
		{
			return false;
		}
		Node current = this.header;
		int index=0;
		while(current.next!=null && index!=pos)
		{
			
			current=current.next;
			index=index+1;
		}
		System.out.println(index);
		
		
		
		 
		Node nuevo=new Node(current.previous, name, salary,current);
		 
		 
		//nuevo.next=old;
		//old.previous=nuevo;
		
		this.header=nuevo;
		
	 
		
		 
		return true;

	}
	public int size() 
	{
		
		int total=0;
		Node current = this.header;
		while(current!=null )
		{ 
		 
			current=current.next;
			total=total+1;
		}
		return  total;

	}

	public void addLast(String name, Double salary) {
		if (this.header == null) {
			this.header = new Node(null, name, salary, null);
			return;
		}
		Node temp = this.header;
		while (temp.next != null) {
			temp = temp.next;
		}

		Node new_node = new Node(temp, name, salary, null);
		temp.next = new_node;

	}

	public String toString() {
		if (this.header == null) {
			return "";
		}
		String str = "";
		Node temp = header;
		while (temp != null) {
			 
				str = str + "-->(" + temp.name  + ")";
			 
			
			temp = temp.next;
		}
		str = str + "-->(" + "NULL" + ")";
		return str;
	}

	public static void main(String[] args) {
		Mylista mySL = new Mylista();
		int[] intArray = new int[] { 2, 1, 6, 5, 7, 8, 3, 4, 9, 10 };
		
		for (int i = 0; i <intArray.length; i++) {
			int j = intArray[i];
			mySL.addOrder(String.format("%s", i),i + 0.0);
			
		}
		 
		//System.out.println(mySL.deleteAt(5));
		
		System.out.println(mySL.insertAt(0,"Policifo",900.0));
		
		System.out.println(mySL);

	}

}
