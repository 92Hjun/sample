public class WrapperDemo2 {
	public static void main(String[] args) {
		
		// Integer의 정적 메소드

		// 문자열을 int값으로 변환하는 메소드 : int parseInt(String text)
		int num1 = Integer.parseInt("123");		// 글자 "123"을 정수 123으로 반환한다.
		System.out.println("num1:" + num1);

		int num2 = Integer.parseInt("1100", 2);	// 2진수로된 11을 10진수로 반환한다.
		System.out.println("num2:" + num2);

		int num3 = Integer.parseInt("a", 16);	// 16진수로된 char a를 int로 반환한다.
		System.out.println("num3:" + num3);

		String str1 = Integer.toBinaryString(12);	// 정수 12를 2진수로 반환한다.
		System.out.println("str1:" + str1);

		String str2 = Integer.toHexString(12345);	// 정수 12345를 16진수로 반환한다.
		System.out.println("str2:" + str2);

		double dou1 = Double.parseDouble("3.14");	// 글자 "3.14"를 더블형 3.14로 반환한다.
		System.out.println(dou1 * 2);
	}
}
