import java.util.*;

public class IfDemo1 {
	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다");

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		if (score >= 60) {
		
			System.out.println("합격입니다.");
		
		} else {
			
			System.out.println("불합격입니다.");
		}
		System.out.println("프로그램을 종료 합니다.");
	}
}