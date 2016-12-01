public class RuntimeExceptionDemo {
	public static void main (String[] args) {
		// NullPointerException
		//		참조변수에 객체의 주소갑 대신 null이 저장되어 있는 상태에서 속성이나 기능을 사용한 경우 발생한다.
		String str = "abc";
		System.out.println(str.length());

		String[] names = new String[3];
		names[0] = "홍길동";
		names[1] = "김유신";

		for (String name : names) {
			/*
			if (name != null) {
				System.out.println(name + ", " + name.length());	
			}
			*/
			System.out.println(name == null ? "없음" : name);
		}
	}
}