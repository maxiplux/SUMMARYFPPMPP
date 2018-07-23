package autoestudio;
class A222 
{
    int i;
    void display() 
    {
        System.out.println(i);
    }
}    
class B2222 extends  A222
{
    int j;
    void display() 
    {
        System.out.println(j);
    }
}  
public class Probador2     {
	
	

	public static void main(String[] args) {
		B2222 obj = new B2222();
         obj.i=1;
         obj.j=2;   
         obj.display();     
		 
			
	}
	 

	public static void Mymethod(int count)
	{
		if (count == 0)
		{
			return ;
		}
		else 
		{
			System.out.println(" " +count);
			//count=count-1;
			count--;
			Mymethod(count);
			return ;	
		}
		
	}

}
