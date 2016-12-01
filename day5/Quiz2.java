import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자를 입력받아 그 숫자들의 합과 평균을 계산해서 출력하기
		// 1. 학생 수를 입력받기
		// 2. 학생 수 만큼의 크기를 가진 배열을 만들기
		// 3. 학생 수 만큼 반복하면서 점수를 입력받고 배열에 담기

		int sum = 0;

		for (;;){
			System.out.println("---------------------------------------");
			System.out.println("종료를 원하실 경우 0번을 입력하세요");
			System.out.print("국어 시험을 본 학생들의 수를 입력하세요: ");
			int size = sc.nextInt(); // 학생수 == 배열의 크기
	
				if( size==0 ) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

			int[] number = new int[size]; // 학생 수 만큼의 점수를 담을 배열을 생성
			
			for( int i=0; i<number.length; i++) {
				System.out.print("국어 점수를 입력하세요: ");
				int score = sc.nextInt();
				
				if (score > 100){
					System.out.println("점수는 100을 넘을 수 없습니다.");
					i--;
					size--;
				} else {
					number[i] = score; // 입력 순서대로 배열에 점수를 저장
					sum += number[i];
				}
			}
			int avg = sum/number.length;
			System.out.print("학생들의 점수는 ");
			for (int i=0; i<number.length; i++) {
			System.out.print( number[i]+"\t" );
			}
			System.out.println();
			System.out.printf("총점: %d\t평균은: %d 입니다.\n", sum, avg);
		}
	}	
}