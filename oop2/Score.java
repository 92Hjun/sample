public class Score {
	String name;
	int kor;
	int eng;
	int math;

	// 기본 생성자
	public Score() {
		// 필드 초기화
		name = "홍길동";
		kor = 65;
		eng = 70;
		math = 80;
	}

	public Score(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}

	public int total() {
		return kor + eng + math;
	}

	public double avg() {
		return total()/3.0;
	}
}