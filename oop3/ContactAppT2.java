import java.util.Scanner;

public class ContactAppT2 {
	public  static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("------------------------");
			System.out.println("1:���   2:��ȸ   0:����");
			System.out.println("------------------------");
		
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� :");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {

				Contact con = new Contact();

				System.out.print("������ �Է��ϼ��� >");
				con.setNo(sc.nextInt());

				System.out.print("�̸��� �Է��ϼ��� >");
				con.setName(sc.next());

				System.out.print("��ȭ��ȣ�� �Է��ϼ��� >");
				con.setPhone(sc.next());

				System.out.print("�̸����� �Է��ϼ��� >");
				con.setEmail(sc.next());

				System.out.println(con.getName() + "�� ����� �Ϸ�Ǿ����ϴ�.");
				mgr.addContact(con);

			} else if (menuNo == 2) {
				mgr.displayContact();
			} else if (menuNo == 0){
				System.out.println("�ý����� �����մϴ�.");
				break;
			} else {
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���.");
			}
		}		
	}	
}