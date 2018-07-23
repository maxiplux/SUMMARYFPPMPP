package Problem6;

public class Solution6 {
	public static void main(String[] args) {

		Computer computer = new Computer("Asus", "x3120", 1024, 3200);
		Person federico = new Person("Federico", computer);

		Person leonardo = federico;

		Person francisco = (Person) federico.clone();
		//// the same addres on memory
		System.out.println("Leonardo and federicho has a pointer to same adddres ");
		System.out.println(leonardo);
		leonardo.name = "lernardo";

		System.out.println(leonardo.hashCode());
		System.out.println(federico.hashCode());

		System.out.println(leonardo);
		System.out.print("Who is federico ? ---- >");
		System.out.println(federico);

		System.out.println("the next example , francisco has a new addres  ");
		///
		System.out.println(francisco.hashCode());
		System.out.println("Francisco is a diferent object on meomry the values are the same , but the memory pointer is other");
	}

}
