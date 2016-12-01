import java.util.Scanner;

public class  Quiz3 {
	public static void main(String[] args) { 
		// 임의의 숫자를 입력받아 그 수가 짝수인지 홀수인지
		// 삼항연산자를 이용해 결과를 표시하시오.

		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하시오 : ");
		int a = sc.nextInt();

		String result = (a%2 ==0) ? "짝수입니다." : "홀수입니다.";
		System.out.println("결과 값은 "+ result + "입니다.");

	}	
}