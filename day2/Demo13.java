public class Demo13 {
	public static void main(String[] args) {
		// 증감연산자
		// ++는 1씩 증가  --는 1씩 감소
		int a = 3;
		a++;
		++a;
		System.out.println("a의 값:" + a);
		
		a--;
		--a;
		--a;
		System.out.println("a의 값:" + a);

		int x = 10;
		int y = 10;

		int m = x++; // x의 값을 m에 대입하고 증가
		int n = ++y; // y의 값을 먼저 증가시키고 n에 대입

		System.out.println("m의 값: " + m);
		System.out.println("n의 값: " + n);
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
	}	
}