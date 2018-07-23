package problem2;

public class Professor extends DeptEmployee {
	int numberOfPublications;

	public Professor(String name, int yearOfHire, int monthOfHire, int dayOfHire, double salary,
			int numberOfPublications) {
		super(name, yearOfHire, monthOfHire, dayOfHire, salary);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
