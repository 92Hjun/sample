import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���ڸ� �Է¹޾� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� �����
		// 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���

		int sum = 0;

		for (;;){
			System.out.println("---------------------------------------");
			System.out.println("���Ḧ ���Ͻ� ��� 0���� �Է��ϼ���");
			System.out.print("���� ������ �� �л����� ���� �Է��ϼ���: ");
			int size = sc.nextInt(); // �л��� == �迭�� ũ��
	
				if( size==0 ) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}

			int[] number = new int[size]; // �л� �� ��ŭ�� ������ ���� �迭�� ����
			
			for( int i=0; i<number.length; i++) {
				System.out.print("���� ������ �Է��ϼ���: ");
				int score = sc.nextInt();
				
				if (score > 100){
					System.out.println("������ 100�� ���� �� �����ϴ�.");
					i--;
					size--;
				} else {
					number[i] = score; // �Է� ������� �迭�� ������ ����
					sum += number[i];
				}
			}
			int avg = sum/number.length;
			System.out.print("�л����� ������ ");
			for (int i=0; i<number.length; i++) {
			System.out.print( number[i]+"\t" );
			}
			System.out.println();
			System.out.printf("����: %d\t�����: %d �Դϴ�.\n", sum, avg);
		}
	}	
}