import java.util.*;

public class Quiz2 {
	public static void main(String[] args){
		// 3�ڸ��� ������ �Է¹޾�
		// 100�� �ڸ� ����
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int number = sc.nextInt();

		int h = number/100;
		int d = (number - 100*h)/10;
		int a = number - 100*h - 10*d;
		System.out.println("100�� �ڸ� : " + h);
		System.out.println("10�� �ڸ� : " + d);
		System.out.println("1�� �ڸ� : " + a + "\n");
	}
}