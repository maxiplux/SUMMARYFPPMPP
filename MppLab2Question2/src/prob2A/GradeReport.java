package prob2A;

public class GradeReport {
	
	Student student;

	@Override
	public String toString() {
		
		return String.format("GradeReport(Studen:(%s)) Grade Id : %s", this.student.getName(), this.hashCode());
	}

	public GradeReport(Student student) {
		 
		this.student = student;
		this.student.setGrade(this);
	}
	

}
