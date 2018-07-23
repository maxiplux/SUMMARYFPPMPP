package april2017.startupCode.prob2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	public void addMessage(String message)
	{
		this.queue.enqueue(message);
		
	}
	public String nextMessage()
	{
		
		try 
		{	String value = this.queue.dequeue();
			return value ;
		}
		
		catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			return null;
		}
				
		
	}
	abstract String getName();
	//implement
}
