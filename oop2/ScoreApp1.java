public class ScoreApp1 {
	public static void main(String[] args) {
		Score s1 = new Score();

		s1.name = "ȫ�浿";
		s1.kor = 90;
		s1.eng = 100;
		s1.math = 98;

		int result1 = s1.total();
		double result2 = s1.avg();

		System.out.println("��   �� : " + result1);
		System.out.println("��   �� : " + result2);
	}	
}