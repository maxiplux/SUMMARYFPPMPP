package autoestudio;

public class B11 extends A 
{
	int z;
	B11(int ix, int iy , int sigma)
	  {
	    super(ix, iy,sigma);
	    this.z= sigma;
	  }
	void  B1()
	  {
	    System.out.println(this.sigma);
	  }

}
