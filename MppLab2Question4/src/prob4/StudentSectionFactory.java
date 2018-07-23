package prob4;

public class StudentSectionFactory {
	TranscriptEntry new_ts_e = new TranscriptEntry();
	public Section createSection(int secNum, String courseName)
	{
		Section secction = new Section();
		secction.sectionNumber=secNum;
		secction.courseName=courseName;
		return secction;
	}
	public Student createStudent(String id, String name)
	{
		
		Student student=new Student();
		student.name=name;				
		return student;
	}
	public void newTranscriptEntry(Student s, Section sect, String grade)
	{
		new_ts_e= new TranscriptEntry();
		new_ts_e.section=sect;
		new_ts_e.student=s;
		new_ts_e.grade=grade;
		
		
		
	}

}
