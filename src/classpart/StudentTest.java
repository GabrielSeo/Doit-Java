package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안혜경";
		studentAhn.grade = 6;
		System.out.println(studentAhn.getGrade());
		System.out.println(studentAhn.getStudentName());
	}

}
