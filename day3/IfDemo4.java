import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:Ŀ��(1500��)  2:�����ֽ�(2000��)  3:�̿�����(1000��)");

		// �ݾ��Է¹ް� -> �޴� ���� -> "~���Ḧ �޾ư�����" -> �Ž������� ~�Դϴ�
		System.out.print("�޴��� �����ϼ���(1~3��) :");
		int no = sc.nextInt();
		System.out.print("�ݾ��� �Է��ϼ��� :");
		int money = sc.nextInt();

		int returnCoin = 0;

		if (no == 1) {
			returnCoin = money-1500;
			if (money < 1500) {
				System.out.println( (1500-money) + "���� �����մϴ�.");
			} else {
				System.out.println("Ŀ�� �޾ư����� �ܵ��� " + returnCoin + "�� �Դϴ�. �����մϴ�.");
			}
		} else if (no == 2) {
				returnCoin = money-2000;
			if (money < 2000) {
				System.out.println( (2000-money) + "���� �����մϴ�.");
			} else {
				System.out.println("�����ֽ� �޾ư����� �ܵ��� " + returnCoin + "�� �Դϴ�. �����մϴ�.");
			}
		} else if (no == 3) {
			returnCoin = money-1000;
			if (money < 1000) {
				System.out.println( (1000-money) + "���� �����մϴ�.");
			} else {
				System.out.println("�̿����� �޾ư����� �ܵ��� " + returnCoin + "�� �Դϴ�. �����մϴ�.");
			}
		} else {
		System.out.println("�߸��� ��ȣ�� �����ϼ̽��ϴ�.");
		}
				
		int five = returnCoin/5000;
		int ten = returnCoin/1000;
		int fCoin =(returnCoin - ten*1000)/500;
		int hCoin =(returnCoin - ten*1000)/100;
		int fCent =((returnCoin - ten*1000 - hCoin*100)/50);
		int hCent =((returnCoin - ten*1000 - hCoin*100)/10);

		if (returnCoin >= 5000) {
					System.out.println(" 5õ��¥�� : " + five + "��");
					System.out.println(" 1õ��¥�� : " + (ten - 5*five)  + "��");
					System.out.println(" 500��¥�� : " + fCoin + "��");
					System.out.println(" 100��¥�� : " + (hCoin - 5*fCoin) + "��");
					System.out.println(" 50��¥�� : " + fCent + "��");
					System.out.println(" 10��¥�� : " + (hCent - 5*fCent)+ "��");
		} else if (no<=3){
			System.out.println(" 1õ��¥�� : " + ten + "��");
			System.out.println(" 500��¥�� : " + fCoin + "��");
			System.out.println(" 100��¥�� : " + (hCoin -5*fCoin) + "��");	
			System.out.println(" 50��¥�� : " + fCent + "��");
			System.out.println(" 10��¥�� : " + (hCent - 5*fCent)+ "��");
		}
	}
}