public class MethodDemo1 {
	
	// 메소드 정의(구현)
	public static void a() {
		System.out.println("사용자가 정의한 a메소드입니다.");	
	}

	public static void b(int x) {
		System.out.println("b 메소드가 실행되었습니다.");
		System.out.println("b 메소드 실행시 전달받은 값: " + x);
		System.out.println("--------------------------------------");
	}

	public static void c(String str) {
		System.out.println("c 메소드가 실행되었습니다.");
		System.out.println("c 메소드 실행시 전달받은 값: " + str);
		System.out.println("--------------------------------------");
	}
	
	public static void d(int x, int y) {
		System.out.println("d 메소드가 실행되었습니다.");
		System.out.println("d 메소드가 실행시 전달받은 값: " + x + "," + y);
	}

	public static void e(String name, String email, int age) {
		System.out.println("e 메소드가 실행되었습니다.");
		System.out.println("e 메소드가 실행시 전달받은 값: " + name);
		System.out.println("e 메소드가 실행시 전달받은 값: " + email);
		System.out.println("e 메소드가 실행시 전달받은 값: " + age);
		System.out.println("---------------------------------------");
	}

	public static void main(String[] args) {
		// 메소드 호출(실행)
		// a();
		// 매개변수가 있는 메소드 호출
		b(100);
		int k = 20;
		b(k);
		//b(); 컴파일 오류, b 메소드를 실행하기 위해서는 반드시 정수값 하나가 전달되어야 한다.

		c("알 수 없음.");
		c("안녕, "+"저는 홍길동이라고 합니다.");

		d(1000, 2000);
		int i = 10;
		int j = 20;
		d(i, j);

		e("홍길동", "hong@gmail.com", 23);
		e("김유신", "kim@gmail.conm", j);
	}
}