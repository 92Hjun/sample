public class ArrayDemo1 {
	public static void main(String[] args) {

		// ���� 5���� ������ �ִ� �迭 �����
		int[] numbers = {1, 5, 8, 10, 4, 5, 66, 80, 1, 4, 6, 3, 5, 11, 52, 66, 28, 42, 8, 90};

		// �迭�� ũ�� �˾Ƴ���
		// numbers.length
		int size = numbers.length;
		System.out.println("�迭�� ũ��" + size);

		// �迭���� �� ��������
		// numbers[�ε��� ��ȣ]
		int x = numbers[0];
		int y = numbers[1];
		System.out.println("�迭�� 0��° ��: " + x);
		System.out.println("�迭�� 1��° ��: " + y);

		// ��� ������ �հ踦 ���ϱ�
		// ���1
		int total1 = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
		System.out.println("�հ�1: " + total1);

		// ���2
		int total2 = 0;
		total2 += numbers[0];
		total2 += numbers[1];
		total2 += numbers[2];
		total2 += numbers[3];
		total2 += numbers[4];
		System.out.println("�հ�2: " + total2);

		// ���3
		int total3 = 0;
		for ( int i=0; i<size; i++) {
		total3 += numbers[i];
		}
		System.out.println("�հ�3: " + total3);

		//���4
		int total4 = 0;
		for ( int a : numbers ) {
			total4 += a;
		}
		System.out.println("�հ�: " + total4);
	}	
}