import java.util.Scanner;

public class MaxArray {
	/* �迭�� ���޹޾Ƽ� �� �迭���� ���� ū ���� ��ȯ�ϴ� �޼ҵ�
		�迭�� ���ڸ� ���޹޾� �� �迭�� �� ���ڰ� ���ԵǾ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�
		
	*/

	public void maxInput() {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		for(;;) {
			System.out.println("---------------------------------");			
			System.out.println("0���� �Է��� ��� ����˴ϴ�.");
			System.out.print("����(����)�� ũ�⸦ �Է��ϼ��� >");		
			int size = sc.nextInt();
			int[] number = new int[size]; // �л� �� ��ŭ�� ������ ���� �迭�� ����
			
			if( size==0 ) { // ���� ó��
				System.out.println("���α׷��� �����մϴ�.");
				break;

			}

			for( int i=0; i<size; i++) {
				System.out.print("���ڸ� �Է��ϼ���. >");
				number[i] = sc.nextInt();
				if( number[i] > max) {
					max = number[i];
				}
			}
			System.out.println("���� ū ���� " + max + "�Դϴ�.");
		}
	}

	public static int maxCom(int[] values) {
		int max = 0;

		for(int i=0; i<values.length; i++) {
			if(values[i] > max) {
				max = values[i];
			}
		}

		return max;
	}

}