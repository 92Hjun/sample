import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 총점, 평균, 학점을 출력하시오.
		// 학점은 90이상:A, 80이상:B, 70이상:C, 60이상:D, 그외는 F 처리한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력 하세요 : ");
		int kor = sc.nextInt();		
		System.out.print("영어점수를 입력 하세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력 하세요 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		int avg = total/3;
		String score = "";

		if (avg >=90) {
			score = "A";
		} else if (avg >=80) {
			score = "B";
		} else if (avg >=70) {
			score = "C";
		} else if (avg >=60) {
			score = "D";
		} else {
			score = "F";
		}
		System.out.println("총점은 " + total + "\t평균은 " + avg + "\t학점은 "+ score); 
	}	
}