public class Demo3 {
	public static void main(String[] args){
		// ���� ������.
		// (���ǽ�)? true�϶� ����� Ȥ�� �� : false�϶� ����� Ȥ�� ��.
		
		int score = 97;
		String result1 = ((score >= 90) ? "�հ�" : "���հ�");
		System.out.println("���� ��� : " + result1);

		// ���� �ݾ��� 50,000�� �̻��̸� ��ۺ� ����.
		int price = 25_000;
		int payment =  ((price > 50_000) ? price : price + 2_500);
		System.out.println("���� �ݾ� : " + payment + "��");
		
	}
}