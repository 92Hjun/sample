import java.util.*;

public class ArrayListDemo {
	
	public static void main (String[] args) {
		// 이름을 여러 개 저장할 수 있는 ArrayList 만들기.
			
			// 문자열을 10개 남을수 있는 collection을 생성한다.
		ArrayList<String> names = new ArrayList<String>();
		
			// ArrayList에 String객체(초기에 제네릭표현으로 설정해준객체)를 index없이 저장한다.
		names.add("홍길동");
		names.add("김유신");
		names.add("이순신");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");


			
			//ArrayList에 저장된 모든 엘리먼트를 한번에 삭제할때 사용할수있다.
		/*	
			names.clear(); // 출력값 0

		*/
			
			// ArrayList에 저장된 엘리먼트 갯수 조회하기
			// ArrayList에 있는 메소드 size()를 통해서 collection의 길이를 확인할수있다.
		int length = names.size();
		System.out.println(length);
		
			// ArrayList에 저장된 String객체를 지정된 index에 저장된 값을 불러올수있다.
		// 1번째 방법
		for (int i =0; i<length; i++) {
			System.out.println(names.get(i));
		}
			/*
				홍길동
				김유신
				이순신
				강감찬
			*/

		// 2번째 방법
		for (String userName : names) {
			System.out.println(userName);
		}
			/*
					홍길동
					김유신
					이순신
					강감찬
			*/

		// ArrayList에 엘리먼트가 저장되어 있는지 확인하기.
		// ArrayList에 isEmpty메소드를 이용하여 저장이되어있는지 아닌지 boolean으로 확인해준다.
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("엘리먼트가 존재하는 ArrayList다.");
		} else {
			System.out.println("비어있는 ArrayList다.");
		}

		
	}
}