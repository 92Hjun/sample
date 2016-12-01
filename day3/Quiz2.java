import java.util.*;

public class Quiz2 {
	public static void main(String[] args){
		// 3자리의 정수를 입력받아
		// 100의 자리 숫자
		// 10의 자리 숫자
		// 1의 자리 숫자를 각각 출력하시요.

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = sc.nextInt();

		int h = number/100;
		int d = (number - 100*h)/10;
		int a = number - 100*h - 10*d;
		System.out.println("100의 자리 : " + h);
		System.out.println("10의 자리 : " + d);
		System.out.println("1의 자리 : " + a + "\n");
	}
}