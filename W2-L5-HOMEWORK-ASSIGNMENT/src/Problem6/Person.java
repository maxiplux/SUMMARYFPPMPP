package Problem6;

class Person implements Cloneable {
	String name;
	Computer computer;

	public Person(String name, Computer computer) {
		super();
		this.name = name;
		this.computer = computer;
	}
	

	@Override
	public String toString() {
		return "Person >>>>> name=" + name + ", computer=" + computer + "<<<<<";
	}


	public Object clone() {

		try {
			Person obj = (Person) super.clone();
			return obj;
		} catch (CloneNotSupportedException ex) {
			System.out.println("Fail on cloning");
		}
		return null;
	}

}