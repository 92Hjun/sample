import java.util.Scanner;

public class ContactAppT2 {
	public  static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("------------------------");
			System.out.println("1:등록   2:조회   0:종료");
			System.out.println("------------------------");
		
			System.out.print("메뉴 번호를 입력하세요 :");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {

				Contact con = new Contact();

				System.out.print("순서를 입력하세요 >");
				con.setNo(sc.nextInt());

				System.out.print("이름을 입력하세요 >");
				con.setName(sc.next());

				System.out.print("전화번호를 입력하세요 >");
				con.setPhone(sc.next());

				System.out.print("이메일을 입력하세요 >");
				con.setEmail(sc.next());

				System.out.println(con.getName() + "의 등록이 완료되었습니다.");
				mgr.addContact(con);

			} else if (menuNo == 2) {
				mgr.displayContact();
			} else if (menuNo == 0){
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 숫자를 입력해주세요.");
			}
		}		
	}	
}