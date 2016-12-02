import java.util.*;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ArrayList 클래스를 String 타입의 객체만 담는 변수 names 를 생성한다.
		// List는 몇개를 저장할지 크기를 미리 결정하지 않아도 크기가 가변적이다.
		ArrayList<String> names = new ArrayList<String>();

		while (true){
			System.out.println("1. 등록 2. 조회 0. 종료");
			System.out.println("선택>");

			int menu = sc.nextInt();
			
			if (menu == 1) { // 등록
				System.out.println("등록할 이름을 입력하세요: ");
				String name = sc.next();
				//ArrayList에 메소드 add 를 사용하여 입력받은 이름을 names에 저장한다.
				names.add(name);
			} else if (menu == 2) { // 조회
				// 이네스트 for문을 사용하여 저장한값을 출력한다.
				for (String n : names) {
					System.out.println(n);
				}
			} else if (menu == 0) { // 종료
				break;
			}
		}
	}
}