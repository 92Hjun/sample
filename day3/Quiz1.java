import java.util.*; // java파일 밑의 util 밑의 기능을 사용한다.

public class Quiz1 { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 시스템에서 입력을 받는다.
		
		// 국어, 영어, 수학 점수를 입력 받아서
		// 총합과 평균을 계산하기
		System.out.print("국어점수를 입력 하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력 하세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력 하세요 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;

		System.out.println("총합 : " + total + "\t평균 : " + Math.round(avg));
	}
}