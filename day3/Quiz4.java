import java.util.Scanner;

public class  Quiz4 {
	public static void main(String[] args) { 
		// 임의의 정수 두자리를 입력받아 숫자를 문자로 출력하시오.
		// 예) 23 = 이십삼.

		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하시오 : ");
		int number = sc.nextInt();
		int number1 = number/10;
		int number2 = (number - number1*10);

		String hangul = "";
		
		if(number1 == 0) {
		} else if(number1 == 1) {
			hangul = "십";
		} else if(number1 == 2) {
			hangul = "이십";
		} else if(number1 == 3) {
			hangul = "삼십";
		} else if(number1 == 4) {
			hangul = "사십";
		} else if(number1 == 5) {
			hangul = "오십";
		} else if(number1 == 6) {
			hangul = "육십";
		} else if(number1 == 7) {
			hangul = "칠십";
		} else if(number1 == 8) {
			hangul = "팔십";
		} else if(number1 == 9) {
			hangul = "구십";
		}

		if(number2 == 0) {
		} else if(number2 == 1) {
			hangul += "일";
		} else if(number2 == 2) {
			hangul += "이";
		} else if(number2 == 3) {
			hangul += "삼";
		} else if(number2 == 4) {
			hangul += "사";
		} else if(number2 == 5) {
			hangul += "오";
		} else if(number2 == 6) {
			hangul += "육";
		} else if(number2 == 7) {
			hangul += "칠";
		} else if(number2 == 8) {
			hangul += "팔";
		} else if(number2 == 9) {
			hangul += "구";
		}

		System.out.println(hangul);
	}	
}