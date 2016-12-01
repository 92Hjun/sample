public class StudentApp2 {
	public static void main(String[] args) {
		
		// 학생들을 여러 명 저장하는 배열 만들기
		// Student객체 5개를 담을 수 있는 배열을 생성해서 students 변수에 담기.
		Student[] students = new Student[3];

		students[0] = new Student(1, "순신", 40 ,80, 90);
		students[1] = new Student(5, "유신", 80 ,70, 70);
		students[2] = new Student(7, "길동", 90 ,10, 20);

		//students[0].info();
		//students[1].info();
		//students[2].info();

		//for (int i=0; i<students.length; i++) {		
		//	Student s = students[i];
		//	s.info(); }

		//for (Student s : students) {
		//	System.out.println(s.avg());
		
		System.out.println("이름 국어 영어 수학 총점 평균");
		for (Student s : students) {
			System.out.printf("%s %4d %4d %4d %4d %2.2f\n",
							s.name, s.kor, s.eng, s.math, s.total(), s.avg());
		}
	}	
}