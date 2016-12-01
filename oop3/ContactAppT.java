import java.util.Scanner;

public class ContactAppT {
	public  static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for (;;) {
			System.out.println("------------------------");
			System.out.println("1:등록   2:조회   0:종료");
			System.out.println("------------------------");
		
			System.out.print("메뉴 번호를 입력하세요 :");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// currentPosition이 가르키는 위치에 Contact 배열 저장하고 등록하기
				
				System.out.print("순서를 입력하세요 >");
				int no = sc.nextInt();

				System.out.print("이름을 입력하세요 >");
				String name = sc.next();

				System.out.print("전화번호를 입력하세요 >");
				String phone = sc.next();

				System.out.print("이메일을 입력하세요 >");
				String email = sc.next();

				Contact contact = new Contact();
				contact.setNo(no);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);

				contacts[currentPosition] = contact;
				System.out.println(contacts[currentPosition].getName() + "의 등록이 완료되었습니다.");

				// currentPosition의 값을 1 증가시킨다.
				currentPosition++;


			} else if (menuNo == 2) {
				// 배열에 저장된 모든 연락처 정보 표현하기
				// <-- enhanced for문 사용하면 배열이 100개 전까지 비어있으므로 null 오류남
				// 배열 0부터 currentPosition이 가르키는 위치 앞까지 반복하기
				for (int i=0; i<currentPosition; i++) {
					Contact c = contacts[i];
					System.out.println("----------------------------");
					System.out.printf("번호 : %d\n이름 : %s\n전화번호 : %s\n이메일 : %s\n", 
									c.getNo(), c.getName(), c.getPhone(), c.getEmail());
				}
			} else if (menuNo == 0){
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 숫자를 입력해주세요.");
			}
		}		
	}	
}