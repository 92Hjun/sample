import java.io.*;
import java.text.DecimalFormat;

public class StudentResultApp {

	public static Student resultPrint(String text) {
		Student student = new Student();
		String[] items = text.split(",");
		student.setName(items[0]);	
		student.setGrade(items[1]);
		student.setKor(Integer.parseInt(items[2]));
		student.setEng(Integer.parseInt(items[3]));
		student.setMath(Integer.parseInt(items[4]));

		return student;
	}
	
	public static void main(String[] args) throws Exception {
		Student[] students = new Student[10];

		BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));

		for(int i=0; i<students.length; i++) {
			students[i] = resultPrint(reader.readLine());
		}
		DecimalFormat df = new DecimalFormat("##.0");

		System.out.print(" 이름\t 학년\t 국어\t 영어\t 수학\t 총점\t 평균\n");
		for(Student s2 : students) {
			System.out.printf( "%s\t %s\t %d\t\t %d\t\t %d\t\t %d\t %s\n",
				s2.getName(), s2.getGrade(), s2.getKor(), s2.getEng(), s2.getMath(), 
				s2.getTotal(), df.format(s2.getAvg()));
		}
	}
}
