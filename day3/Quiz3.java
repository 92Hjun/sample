import java.util.Scanner;

public class  Quiz3 {
	public static void main(String[] args) { 
		// ������ ���ڸ� �Է¹޾� �� ���� ¦������ Ȧ������
		// ���׿����ڸ� �̿��� ����� ǥ���Ͻÿ�.

		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է��Ͻÿ� : ");
		int a = sc.nextInt();

		String result = (a%2 ==0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println("��� ���� "+ result + "�Դϴ�.");

	}	
}