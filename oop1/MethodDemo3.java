import java.util.*;

public class MethodDemo3 {

	// 난수를 발생시키는 메소드 만들기
	public static int random() {
		Random r = new Random();
		int number = r.nextInt(100); // 0부터 99까지의 랜덤 정수를 호출
		// return 키워드는 이 메소드를 호출한 곳에 값을 반환한다.
		// 리턴 형이 void가 아닐 경우 반드시 return을 해주어야 한다.
		return number;
	}

	// 오늘 날짜를 반환하는 메소드 만들기
	public static String getCurrentDate() {
		Date now = new Date();
		String str = now.toString();

		return str;
	}

	public static void a() {
		// return 값이 존재하지 않으므로 출력x
	}
	
	public static void main(String[] args) {
		int x = random();
		System.out.println(x);

		System.out.println(random());
		System.out.println(random() * 100);

		int y = random() * 1000;
		System.out.println(y);

		String d = getCurrentDate();
		System.out.println(d);
	}	
}