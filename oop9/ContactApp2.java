/*
Database�� ������� �ϴ� �۾�
	Create		- �� ������ ����
	Retrieve	- ������ ��ȸ
	Update		- ������ ����
	Dlelte		- ������ ����
*/
import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		int numberPosition = 0;
		

		for(;;) {			
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�̸� ���  2.��ȭ��ȣ �߰�  3.�ּ� ���/����  4.��ȸ  0.����");
			System.out.println("--------------------------------------------------------------");
			System.out.print("�޴��� �����ϼ��� >");
			int no = sc.nextInt();
			if (no == 1) {
				// �̸��� �Է¹޾� Contact�� �����մϴ�.
				System.out.print("�̸��� �Է��ϼ��� >");
				contact.setName(sc.next());

			} else if (no == 2) {
				// ��ȭ��ȣ ������ �Է¹޾� Contact�� �����մϴ�.
				// Tel��ü ���� -> �� �Է¹޾� ä��� -> Contact�� addTel(Tel tel)����
				// Tel ��ü �����ؼ� �迭�� ���
				System.out.print("��ȭ ��ȣ�� �Է��ϼ��� > ");
				Tel tels = new Tel( );
				tels.setNumber(sc.next());
				System.out.print("����ó�� ������ �Է��ϼ��� (����|���) > ");
				tels.setType(sc.next());
				contact.addTels(tels);
				numberPosition++;

			} else if (no == 3) {
				// �ּ������� �Է¹޾� Contact�� �����մϴ�.
				// Address��ü ���� -> �� �Է¹޾� ä��� -> Contact�� setter�̿��ؼ� ����.
				Address address = new Address();
				System.out.print("�� �Ǵ� ���� �Է��ϼ��� >");
				address.setSido(sc.next());
				System.out.print("�� �Ǵ� ���� �Է��ϼ��� >");
				address.setGugun(sc.next());
				System.out.print("������ �ּҸ� �Է��ϼ��� >");
				address.setDetail(sc.next());
				contact.setAddress(address);

			} else if (no == 4) {
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.
				if(numberPosition == 0) {
					System.out.println("����� ����ó ������ �����ϴ�.");
				} else if (numberPosition > 0) {
					System.out.println("------------------����ó ����------------------");
					System.out.println("��    ��:" + contact.getName());
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
				// ���α׷��� �����մϴ�.
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���");
			}			
		}
	}
}