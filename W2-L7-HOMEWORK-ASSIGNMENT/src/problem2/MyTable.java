package problem2;

public class MyTable {
	private Entry[] entries= new Entry[26];
	private final  String alphabet="abcdefghijklmnopqrstuvwxyz";
	
	

	// returns the String that is matched with char c in the table
	public String get(char c) 
	{
		int index=this.alphabet.indexOf(c);
		Entry result = this.entries[index];
		
		return result.str;
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		int index=this.alphabet.indexOf(c);
		this.entries[index]=new Entry(c, s);
		
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Entry entry : entries) 
		{
		
			if (entry!=null)
			{
				builder.append(entry.toString()+"\n");
			}
			
			
		}
		return builder.toString();
	}

	private class Entry {
		char ch; String str;
		
		Entry(char ch, String str) 
		{
			 
			
			this.ch=ch;
			this.str=str;
		}

		
		public String toString() {
			alphabet.equals("3");
			StringBuilder builder = new StringBuilder();
			builder.append(this.ch);
			builder.append("->");
			builder.append(this.str);
			return builder.toString();
		}
	}
	
	
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('c',"Charlie");
		String s = t.get('b');
		System.out.println(s);
		
		
		System.out.println(t);
		//output
		 
	}

}
