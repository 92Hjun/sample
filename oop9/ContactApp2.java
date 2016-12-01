/*
Database를 대상으로 하는 작업
	Create		- 새 데이터 저장
	Retrieve	- 데이터 조회
	Update		- 데이터 수정
	Dlelte		- 데이터 삭제
*/
import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		int numberPosition = 0;
		

		for(;;) {			
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.이름 등록  2.전화번호 추가  3.주소 등록/수정  4.조회  0.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("메뉴를 선택하세요 >");
			int no = sc.nextInt();
			if (no == 1) {
				// 이름을 입력받아 Contact에 저장합니다.
				System.out.print("이름을 입력하세요 >");
				contact.setName(sc.next());

			} else if (no == 2) {
				// 전화번호 정보를 입력받아 Contact에 저장합니다.
				// Tel객체 생성 -> 값 입력받아 채우고 -> Contact의 addTel(Tel tel)에게
				// Tel 객체 전달해서 배열에 담기
				System.out.print("전화 번호를 입력하세요 > ");
				Tel tels = new Tel( );
				tels.setNumber(sc.next());
				System.out.print("연락처의 종류를 입력하세요 (개인|사업) > ");
				tels.setType(sc.next());
				contact.addTels(tels);
				numberPosition++;

			} else if (no == 3) {
				// 주소정보를 입력받아 Contact에 저장합니다.
				// Address객체 생성 -> 값 입력받아 채우고 -> Contact의 setter이용해서 저장.
				Address address = new Address();
				System.out.print("시 또는 도를 입력하세요 >");
				address.setSido(sc.next());
				System.out.print("구 또는 군을 입력하세요 >");
				address.setGugun(sc.next());
				System.out.print("나머지 주소를 입력하세요 >");
				address.setDetail(sc.next());
				contact.setAddress(address);

			} else if (no == 4) {
				// 연락처 정보를 화면에 표시합니다.
				if(numberPosition == 0) {
					System.out.println("저장된 연락처 정보가 없습니다.");
				} else if (numberPosition > 0) {
					System.out.println("------------------연락처 정보------------------");
					System.out.println("이    름:" + contact.getName());
					Address address2 = 
					contact.getAddressInfo();

					Tel[] t = new Tel[numberPosition];
					t = contact.getTels();
					for (int i=0; i<numberPosition; i++) {
						System.out.println(t[i].getType() + " : "+ t[i].getNumber());
					}
					System.out.println("-----------------------------------------------");
				}http://www.samsung.com/sec/gear/img/main/img_cont0_1114.jpg


			} else if (no == 0) {
				// 프로그램을 종료합니다.
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 번호를 입력하세요");
			}			
		}
	}
}