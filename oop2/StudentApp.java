public class StudentApp {
	public static void main(String[] args) {
		
		Student s1 = new Student(12, "È«±æµ¿", 96, 88, 90);

		Student s2 = new Student();
		s2.info();

		int result1 = s1.total();
		double result2 = s1.avg();
		System.out.println("ÃÑ      Á¡ : " + result1);
		System.out.println("Æò      ±Õ : " + result2);
		s1.info();
	}	
}