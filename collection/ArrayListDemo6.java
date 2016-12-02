import java.util.*;

public class ArrayListDemo6 {
	
	public static void main(String[] args) {
		// 상품명을 저장하는 ArrayList 만들기.
		ArrayList<String> productNames = new ArrayList<String>();

		productNames.add("연필");
		productNames.add("색종이");
		productNames.add("가위");
		productNames.add("싸인펜");
		productNames.add("공책");
		productNames.add("책받침");
		productNames.add("색연필");
		
		System.out.println(productNames);
		// [연필, 색종이, 가위, 싸인펜, 공책, 책받침, 색연필]
		
		// Collections는 List ,set과 관련된 유용한 메소드들이있다.
		// Collection 는 인터페이스 Collections 는 메소드들의 집합이다.
		// Collections에 있는 sort 메소드는 List를 정렬해준다.
		Collections.sort(productNames);

		System.out.println(productNames);
		// [가위, 공책, 색연필, 색종이, 싸인펜, 연필, 책받침]


	}
}