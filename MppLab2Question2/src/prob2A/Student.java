package prob2A;



public class Student {
	private String name;
	private GradeReport grade;

	public String getName() {
		return name;
	}
 

	public Student(String name) {	 
		this.name = name; 
	}

	

	public void setGrade(GradeReport grade) {
		
		this.grade = grade;
		
	}


	@Override
	public String toString() {		
		if (this.grade!=null)
		{
			return  String.format("Student(%s)/Grade (%s)", this.name,this.grade);
		}
		return  String.format("Student(%s)", this.name);
	} 
	
	
}