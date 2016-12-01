public class Demo1 {
	public static void main(String[] args) {
		// 정수타입
		byte b1 = 23;
		byte b2 = -126;
		// byte b3 = 128; byte 자료형의 범위를 벗어난 값은 오류를 발생시킨다.
		
		int a1 = 128;
		int a2 = -128;

		long c1 = 10000;
		long c2 = 100000000000L;

		int m1 = 10;		// 십진수로 10을 표현
		int m2 = 012;		// 8진수로 10을 표현 (숫자 0 다음에 숫자부터가 값을 표현). 1*8^1 + 2*8^0
		int m3 = 0xA;		// 16진수로 10을 표현 (Ox 다음에 숫자부터가 값을 표현). 10*16^0

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		// java7부터 숫자를 적을 때 자릿수를 표현하기 위해 _(Under Bar) 사용이 가능하다.
		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4*m5);
	}
}