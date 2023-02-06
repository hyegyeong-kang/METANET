package kosa.course;

public class CourseMain {

	public static void main(String[] args) {
		
		// 과목 추가
		Course c1 = new Course("과목1");
		Course c2 = new Course("과목2");
		
		// 학생 생성
		Student s1 = new Student("hong");
		Student s2 = new Student("kang");
		
		// 수강신청
		s1.register(c1);
		s1.register(c2);
		
		s2.register(c2);
		
		// 수강신청 취소
		//s1.remove(c1);
		//s2.remove(c2);
		
		
		// 출력
		s1.showList();
		s2.showList();
		
		// 과목마다 신청한 학생 이름 출력
		c1.showStudentList();
		c2.showStudentList();
	}

}
