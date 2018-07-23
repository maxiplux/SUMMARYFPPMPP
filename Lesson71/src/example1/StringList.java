package example1;

public interface StringList {
	//uncomment these	
	abstract String[] strArray();
	abstract int size();
	abstract void setSize(int s);
	
	/** Adds a string to the end of the list */
	default public void add(String s) 
	{
		this.strArray()[this.size()] = s;
		this.setSize(this.size() + 1);
	}
	
	/** Gets the i_th string in the list */
	default public String get(int i) {
		return strArray()[i] ;
	}
	 
	
}
