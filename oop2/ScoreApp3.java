public class ScoreApp3 {
	public static void main(String[] args) {
		
		// �������� �Ű� ������ ���� �־� �ʱ�ȭ����.
		Score s = new Score("ȫ�浿", 86, 88, 98);

		int result1 = s.total();
		double result2 = s.avg();

		System.out.println("��   �� : " + result1);
		System.out.println("��   �� : " + result2);
	}	
}