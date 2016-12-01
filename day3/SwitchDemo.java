import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하십시오 : ");
		String grade = sc.next();

		switch (grade) {
			case "Gold" :
				System.out.println("골드등급 고객님 환영합니다.");
				break;	
			case "Silver" :
				System.out.println("실버등급 고객님 환영합니다.");
				break;
			case "Bronze" :
				System.out.println("브론즈등급 고객님 환영합니다.");
				break;
			default:
				System.out.println("손님 환영합니다.");
				break;
		}
	}	
}