package PracticeForStandard2017July.prob2;

public class Book extends LendingItem  {

	
	private String isbn;
	private String title;
	private String autorFirtsName;
	private String autorLastName;
	
	public Book(String isbn, String title, String autorFirtsName, String autorLastName) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.autorFirtsName = autorFirtsName;
		this.autorLastName = autorLastName;
	}

	
	
}
