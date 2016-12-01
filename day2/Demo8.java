public class Demo8 {
	public static void main(String[] args){
		// 수동 형 변환
		int a = (int) 3.14; // 자료의 손실이 발생하지만 원하는 정수 타입으로 변환해라.
		System.out.println(a);

		double b = (double) 10;
		System.out.println(b);
		
		System.out.println((double) a); // 3.14에서 다시 복원되지는 않는다.
		System.out.println((double) 24);

		System.out.println((char) 65);
		System.out.println((char) 66); // 문자형과 정수형은 상호 변환이 가능하다.

		// int x = (int) "123"; String type을 int type으로 변경할 수는 없다. String은 참조형 타입이다.
	}
}