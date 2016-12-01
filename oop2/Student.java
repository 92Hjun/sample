public class Student {
	int no; // 학번
	String name; 
	int kor;
	int eng;
	int math;
	
	// 기본 생성자
	public Student(){
		no = 0;
		name = "";
		kor = 0;
		eng = 0;
		math = 0;
	}
	
	
	// 모든 필드를 초기화하는 생성자

	public Student(int n, String na, int k, int e, int m){
		no = n;
		name = na;
		kor = k;
		eng = e;
		math = m;
	}

	// 총점을 반환하는 기능
	public int total() {
		return kor + eng + math;
	}

	// 평균을 반환하는 기능
	public double avg() {
		return total()/3.0;
	}

	// 학생 정보를 출력하는 기능
	public void info() {
		System.out.println("---------학생 정보---------");
		System.out.println("학     번 : " + no);
		System.out.println("학생 이름 : " + name);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("총     점 : " + total());
		System.out.println("평     균 : " + avg());
	}

}