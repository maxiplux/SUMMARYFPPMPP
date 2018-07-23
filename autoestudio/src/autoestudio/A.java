package autoestudio;

public class A {
  
	  int x,y;
	  
	  protected int sigma;
	  private  int sigma2;
	  
	  A(int ix, int iy, int sigma)
	  { 
		  this.x=ix;
		  this.y=iy;
		  this.sigma=sigma;
				  
		  };
		  
		  private void  B1()
		  {
		    System.out.println(this.sigma);
		  }
		  
		  class Az{
			public void test()
			{
				B1();
			}
		  }
		  public class A22 {
			  private void sigma2() {
				// TODO Auto-generated method stub

			}
		  }	 

}
