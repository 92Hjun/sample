public class StudentApp {
	public static void main(String[] args) {
		
		Student s1 = new Student(12, "ȫ�浿", 96, 88, 90);

		Student s2 = new Student();
		s2.info();

		int result1 = s1.total();
		double result2 = s1.avg();
		System.out.println("��      �� : " + result1);
		System.out.println("��      �� : " + result2);
		s1.info();
	}	
}