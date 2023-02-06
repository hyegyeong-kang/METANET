package kosa.course;

import java.util.ArrayList;
import java.util.List;

public class Course {
	// 과목 이름
	// 해당 학생이 신청한 과목 이름을 출력한다.
	
	private String subjectName;
	private List<Student> students;
	
	public Course() {}
	
	public Course(String subjectName) {
		super();
		this.subjectName = subjectName;
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudents(Student student) {
		students.remove(student);
	}
	
	// 과목별로 신청한 학생 이름 출력
	public void showStudentList() {
		System.out.println("과목명:" + subjectName);
		for (Student student : students) {
			System.out.println("수강신청 학생명:" + student.getName());
		}
	}
	

	public String getsubjectName() {
		return subjectName;
	}

	public void setsubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}
