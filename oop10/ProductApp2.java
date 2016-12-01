public class ProductApp2 {

	public static void main(String[] args) {
		
		Product p1 = new Product("연필", 500);
		Product p2 = new Product("연필", 500);

		// ==과 equals(Object o)는 동일한 객체인지 비교
		boolean result1 = (p1 == p2);
		boolean result2 = p1.equals(p2);

		System.out.println("  ==   비교: " + result1);
		System.out.println("equals 비교: " + result2);
		System.out.println("------------------------");

		// 해시코드값 조회
		int value1 = p1.hashCode();
		int value2 = p2.hashCode();
		System.out.println("해시코드값: " + value1);
		System.out.println("해시코드값: " + value2);
		System.out.println("------------------------");

		// toString 비교
		String str1 = p1.toString();
		String str2 = p2.toString();
		System.out.println("객체 정보: " + str1);
		System.out.println("객체 정보: " + str2);
		// str1은 value1의 해시코드 366712642를
		// 클래스이름@1366712642의 16진수 반환값을 반환
		// "객체 정보: Product@15db9742"

		System.out.println(p1); // = System.out.println("객체 정보: " + str1);
		System.out.println(p2); // = System.out.println("객체 정보: " + str2);
		// String 객체는 System.out.println(p1);로 출력될 때
		// ( )안의 p1뒤에 .toString()이 생략되 있다.

	}
}

