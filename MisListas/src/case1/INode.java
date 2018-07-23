package case1;

public class INode {

	int data;
	INode pre;
	INode next;
	private int size;

	@Override
	public String toString() {
		return "INode [data=" + data +"]";
	}

	public void add(INode data) {
		if (this.next == null) {
			data.pre = this;
			this.next = data;
			this.size++;
		}

	}

	public INode() {

	}

	public INode(int data, INode pre, INode next) {
		super();
		this.data = data;
		this.pre = pre;
		this.next = next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INode n1 = new INode();
		n1.data = 1;
		n1.pre = null;
		n1.next = null;

		INode n2 = new INode();
		
		n2.data = 2;
		n2.pre = n1;		
		n1.next=n2;
		
		INode n3 = new INode();
		
		n3.data = 3;
		n3.pre = n2;		
		n3.next=null;
		n2.next=n3;
		n3.printBack();
		int sum=0;
		
		for(INode current=n1;current!=null;current=current.next)
		{
			
			sum=sum+current.data;
			//System.out.println(sum);
			
		}
	}
	
	public void printNext()
	{
		for(INode current=this;current!=null;current=current.next)
		{
			System.out.println(current);
			
			
		}
	}
	public void printBack()
	{
		for(INode current=this;current!=null;current=current.pre)
		{
			System.out.println(current);
			
			
		}
	}

}
