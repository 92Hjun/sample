public class WrapperDemo1 {

	public static void main(String[] args) {

		// 정수 23을 가지고 있는 Integer 객체를 참조하는 a
		Integer a = new Integer(23);		// <--- 박싱(Boxing)
		// Integer 객체에 보관된 정수값을 반환하는 메소드 : int intVlaue()
		int	x = a.intValue();				// <--- 언박싱(unBoxing)
		double y = a;

		System.out.println("x:" + x);
		System.out.println("y:" + y);


		// 정수 23을 저장하고 있는 b
		int b = 23;

		Integer c = 20;						// <--- 오토박싱
		int d = c;							// <--- 오토언박싱
		System.out.println(c);
	}
}
