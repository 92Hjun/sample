public class B {
	int x;
	static int y;

	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	// static 메소드에서는 non-static 변수를 사용할 수 없다.
	// this를 사용할 수없다.
	public static void m2() {
		// System.out.println(x); // 컴파일 오류(x는 객체가 생성된 후에야 사용 가능하기 때문이다.
		// 잠을 자기도 전에 몇 시간 잤냐고 물어보는 것과 같다.
		System.out.println(y);
	}

	public void m3() {
		m1();
		m2();
	} // m3는 일반 메소드 이므로 객체 생성이 된 후 사용 가능하기 때문에 오류가 아니다.

	// static 메소드에서는 non-static 메소드를 사용할 수 없다.
	public static void m4() {
		// m1();
		m2();
	} // m1은 객체 생성이 된 후 사용이 가능하기 때문에 static 메소드로는 사용할 수 없다. 
}