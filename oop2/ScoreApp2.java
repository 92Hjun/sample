public class ScoreApp2 {
	public static void main(String[] args) {
	
		// 객체 생성 및 홍길동 학생의 성적으로 객체가 초기화 되었음.
		Score s1 = new Score();

		// 생성된 객체의 필드를 초기화하는 과정을 생략할 수 있다. (ScoreApp1과 비교)

		// 바로 기능의 사용이 가능하다.

		int result1 = s1.total();
		double result2 = s1.avg();

		System.out.println("총   점 : " + result1);
		System.out.println("평   균 : " + result2);
	}
}