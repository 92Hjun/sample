public class App {
	public static void main(String[] args) {
		// System.out.println(A.x);  static���� ������� �ʾұ� ������ ��ü�� ���� �Ŀ� ����� ����
		// Ŭ������.���������� ���డ��
		System.out.println(A.y); // static ����� Ŭ������.���� �Ǵ� Ŭ������.�޼ҵ�() �������� ���

		// �������� y�� �� �Ҵ��ϱ�
		// AŬ������ ����ؼ� ���� ��� ��ü��
		// �������� t���� �����Ѵ�.
		// A.y = 100;

		A a1 = new A();
		// a1.x = 10;
		System.out.println("a1.x : " + a1.x); 
		// System.out.println("a1.y : " + a1.y); // static ������ y���� ����� ������
						    				     // ��ü ������ ������ ���ɼ��� �ִ�.
		// ���� �Ʒ��� ���� ����Ѵ�.
		System.out.println(" A.y : " + A.y);

		A a2 = new A();
		// a2.x = 20;
		System.out.println("a2.x : " + a2.x); 
		System.out.println(" A.y : " + a2.y);
		
		A a3 = new A();
		// a3.x = 30;
		System.out.println("a3.x : " + a3.x); 
		System.out.println(" A.y : " + a3.y);
	}
}