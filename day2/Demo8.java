public class Demo8 {
	public static void main(String[] args){
		// ���� �� ��ȯ
		int a = (int) 3.14; // �ڷ��� �ս��� �߻������� ���ϴ� ���� Ÿ������ ��ȯ�ض�.
		System.out.println(a);

		double b = (double) 10;
		System.out.println(b);
		
		System.out.println((double) a); // 3.14���� �ٽ� ���������� �ʴ´�.
		System.out.println((double) 24);

		System.out.println((char) 65);
		System.out.println((char) 66); // �������� �������� ��ȣ ��ȯ�� �����ϴ�.

		// int x = (int) "123"; String type�� int type���� ������ ���� ����. String�� ������ Ÿ���̴�.
	}
}