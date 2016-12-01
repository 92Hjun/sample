public class ScoreApp3 {
	public static void main(String[] args) {
		
		// 생성자의 매개 변수에 값을 넣어 초기화해줌.
		Score s = new Score("홍길동", 86, 88, 98);

		int result1 = s.total();
		double result2 = s.avg();

		System.out.println("총   점 : " + result1);
		System.out.println("합   계 : " + result2);
	}	
}