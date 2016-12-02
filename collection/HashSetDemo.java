import java.util.*;

public class HashSetDemo {
	
	public static void main (String[] args) {
		// 메뉴이름을 저장하는 HashSet객체 만들기
		HashSet<String> menuSet = new HashSet<String>();

		menuSet.add("청국장");
		menuSet.add("된장찌개");
		menuSet.add("두부조림");
		menuSet.add("한우육개장");
		menuSet.add("황태조림");
		menuSet.add("제육볶음");
		menuSet.add("제육볶음");
		menuSet.add("제육볶음");
		menuSet.add("제육볶음");

		int a = menuSet.size();

		// Set인터페이스는 중복된 엘리먼트를 포함안하기때문에
		// 위에 4번 중독된 제육볶음을 담지않아 저장된갯수 의 출력값은 6개로 출력된다.
		System.out.println("저장된 갯수 " + a);

		for (String menu : menuSet) {
			System.out.println(menu);
		}
	}
}