import java.util.*; // java���� ���� util ���� ����� ����Ѵ�.

public class Quiz1 { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// �ý��ۿ��� �Է��� �޴´�.
		
		// ����, ����, ���� ������ �Է� �޾Ƽ�
		// ���հ� ����� ����ϱ�
		System.out.print("���������� �Է� �ϼ��� : ");
		int kor = sc.nextInt();
		System.out.print("���������� �Է� �ϼ��� : ");
		int eng = sc.nextInt();
		System.out.print("���������� �Է� �ϼ��� : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;

		System.out.println("���� : " + total + "\t��� : " + Math.round(avg));
	}
}