import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		Account[] account = new Account[100];

		int	currentPosition = 0;

		for(;;) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("1.���  2.��ȸ  3.�������  4.�Ա�  5.���  6.����\n");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("��ȣ�� �����ϼ��� >");
			int menuNo = sc.nextInt();

			if(menuNo ==1) {

				account[currentPosition] = new Account();
				System.out.print("����ȣ�� �Է��ϼ��� >");
				account[currentPosition].setNo(sc.nextInt());
				System.out.print("�̸��� �Է��ϼ��� >");
				account[currentPosition].setName(sc.next());
				System.out.print("���¹�ȣ�� �Է��ϼ��� >");
				account[currentPosition].setNumber(sc.next());
				System.out.print("��й�ȣ�� �Է��ϼ��� >");
				account[currentPosition].setPassword(sc.nextInt());
				System.out.print("�Ա��� �ݾ��� �Է��ϼ��� >");
				account[currentPosition].setBalance(sc.nextInt());
				currentPosition++;				

			} else if (menuNo ==2){
				System.out.print("�� ��ȣ�� �Է��ϼ��� >");
				currentPosition = (sc.nextInt()-1);
				System.out.println("##########���� ��ȸ##########");
				System.out.println("��    ��: " + account[currentPosition].getName());
				System.out.println("���¹�ȣ: " + account[currentPosition].getNumber());
				System.out.println("��    ��: " + account[currentPosition].getBalance());
			
			} else if (menuNo ==3){
				System.out.print("�� ��ȣ�� �Է��ϼ��� >");
				currentPosition = (sc.nextInt()-1);
				System.out.print("���� ��й�ȣ�� �Է��ϼ��� >");
				if(account[currentPosition].getPassword() == sc.nextInt()) {
					System.out.print("������ ��й�ȣ�� �Է��ϼ��� >");
					account[currentPosition].setPassword(sc.nextInt());
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�");
				}			
			} else if (menuNo ==4){
				System.out.print("�� ��ȣ�� �Է��ϼ��� >");
				currentPosition = (sc.nextInt()-1);
				System.out.print("��й�ȣ�� �Է��ϼ��� >");
				if(account[currentPosition].getPassword() == sc.nextInt()) {
					System.out.print("�Ա��� �ݾ��� �Է��ϼ��� >");
					int total = sc.nextInt();
					total += account[currentPosition].getBalance();
					account[currentPosition].setBalance(total);
					System.out.println("���� �ܾ��� " + account[currentPosition].getBalance() + "�� �Դϴ�.");
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�");
				}
			} else if (menuNo ==5){
				System.out.print("�� ��ȣ�� �Է��ϼ��� >");
				currentPosition = (sc.nextInt()-1);
				System.out.print("��й�ȣ�� �Է��ϼ��� >");
				if(account[currentPosition].getPassword() == sc.nextInt()) {
					System.out.print("����� �ݾ��� �Է��ϼ��� >");
					int minus = sc.nextInt();
					if(minus > account[currentPosition].getBalance()){
						System.out.println("�ܾ��� �����մϴ�.");
					} else {
						minus -= account[currentPosition].getBalance();
						account[currentPosition].setBalance(minus);
						System.out.println("���� �ܾ��� " + account[currentPosition].getBalance() + "�� �Դϴ�.");
					}
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�");
				}
			
			} else if (menuNo ==6){
				System.out.println("���α׷��� �����մϴ�.");
				break;			
			} else {
				System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���.");
			}
		}
	}
}