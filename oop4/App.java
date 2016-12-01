public class App {
	public static void main(String[] args) {
		// System.out.println(A.x);  static으로 선언되지 않았기 때문에 객체를 생성 후에 사용이 가능
		// 클래스명.변수명으로 실행가능
		System.out.println(A.y); // static 멤버는 클래스명.변수 또는 클래스명.메소드() 형식으로 사용

		// 정적변수 y에 값 할당하기
		// A클래스를 사용해서 만든 모든 객체는
		// 정적변수 t값을 공유한다.
		// A.y = 100;

		A a1 = new A();
		// a1.x = 10;
		System.out.println("a1.x : " + a1.x); 
		// System.out.println("a1.y : " + a1.y); // static 변수인 y값이 출력이 되지만
						    				     // 객체 변수로 오해할 가능성이 있다.
		// 따라서 아래와 같이 사용한다.
		System.out.println(" A.y : " + A.y);

		A a2 = new A();
		// a2.x = 20;
		System.out.println("a2.x : " + a2.x); 
		System.out.println(" A.y : " + a2.y);
		
		A a3 = new A();
		// a3.x = 30;
		System.out.println("a3.x : " + a3.x); 
		System.out.println(" A.y : " + a3.y);
	}
}