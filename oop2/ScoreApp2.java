public class ScoreApp2 {
	public static void main(String[] args) {
	
		// ��ü ���� �� ȫ�浿 �л��� �������� ��ü�� �ʱ�ȭ �Ǿ���.
		Score s1 = new Score();

		// ������ ��ü�� �ʵ带 �ʱ�ȭ�ϴ� ������ ������ �� �ִ�. (ScoreApp1�� ��)

		// �ٷ� ����� ����� �����ϴ�.

		int result1 = s1.total();
		double result2 = s1.avg();

		System.out.println("��   �� : " + result1);
		System.out.println("��   �� : " + result2);
	}
}