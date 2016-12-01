public class StudentApp {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		Student student1 = service.getStudentByNo(25);
		System.out.println(student1);

		//.getStudentByNo(1);
		//.getStudentsByGrade(1);

		//Student student2 = new Student(28, 4, "ÀÌ¼ø½Å", "010-1234-5678");
		//student2.change(student2);
		//.out.println(student2);

		System.out.pritln(student1.getStudentByNo(23));

	}
}