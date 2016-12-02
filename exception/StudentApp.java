import java.io.*;

public class StudentApp {
	
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		String text = reader.readLine();
		System.out.println("파일 내용: " + text);

		String[] arr = text.split(",");

		Student stu1 = new Student();
		stu1.setName(arr[0]);
		stu1.setGrade(arr[1]);
		int kor1 = Integer.parseInt(arr[2]);
		stu1.setKor(kor1);
		int eng1 = Integer.parseInt(arr[3]);
		stu1.setEng(eng1);
		int math1 = Integer.parseInt(arr[4]);
		stu1.setMath(math1);
		
		System.out.println("----학생 정보----");
		System.out.println("학생 이름: " + stu1.getName());
		System.out.println(" 학   년 : " + stu1.getGrade());
		System.out.println("국어 점수: " + stu1.getKor());
		System.out.println("영어 점수: " + stu1.getEng());
		System.out.println("수학 점수: " + stu1.getMath());
	}
}