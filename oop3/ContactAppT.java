import java.util.Scanner;

public class ContactAppT {
	public  static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for (;;) {
			System.out.println("------------------------");
			System.out.println("1:���   2:��ȸ   0:����");
			System.out.println("------------------------");
		
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� :");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// currentPosition�� ����Ű�� ��ġ�� Contact �迭 �����ϰ� ����ϱ�
				
				System.out.print("������ �Է��ϼ��� >");
				int no = sc.nextInt();

				System.out.print("�̸��� �Է��ϼ��� >");
				String name = sc.next();

				System.out.print("��ȭ��ȣ�� �Է��ϼ��� >");
				String phone = sc.next();

				System.out.print("�̸����� �Է��ϼ��� >");
				String email = sc.next();

				Contact contact = new Contact();
				contact.setNo(no);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);

				contacts[currentPosition] = contact;
				System.out.println(contacts[currentPosition].getName() + "�� ����� �Ϸ�Ǿ����ϴ�.");

				// currentPosition�� ���� 1 ������Ų��.
				currentPosition++;


			} else if (menuNo == 2) {
				// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
				// <-- enhanced for�� ����ϸ� �迭�� 100�� ������ ��������Ƿ� null ������
				// �迭 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ϱ�
				for (int i=0; i<currentPosition; i++) {
					Contact c = contacts[i];
					System.out.println("----------------------------");
					System.out.printf("��ȣ : %d\n�̸� : %s\n��ȭ��ȣ : %s\n�̸��� : %s\n", 
									c.getNo(), c.getName(), c.getPhone(), c.getEmail());
				}
			} else if (menuNo == 0){
				System.out.println("�ý����� �����մϴ�.");
				break;
			} else {
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���.");
			}
		}		
	}	
}