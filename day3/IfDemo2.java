import java.util.*;

public class IfDemo2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력 하세요 : ");
		int score = sc.nextInt();

		if (score >= 95) {
			System.out.println("A+ 입니다.");
			if (score >= 98) {
				System.out.println("장학금을 지급합니다.");
			}
		} else if (score >=90) {
			System.out.println("A 입니다.");
		} else if (score >=85) {
			System.out.println("B+ 입니다.");
		} else if (score >=80) {
			System.out.println("B 입니다.");
		} else if (score >=75) {
			System.out.println("C+ 입니다.");
		} else if (score >=70) {
			System.out.println("C 입니다.");
		} else {
			System.out.println("F 입니다.");
		}

	}
}