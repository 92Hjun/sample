import java.util.Scanner;

public class MaxArray {
	/* 배열을 전달받아서 그 배열에서 가장 큰 값을 반환하는 메소드
		배열과 숫자를 전달받아 그 배열에 그 숫자가 포함되어 있는지 여부를 반환하는 메소드
		
	*/

	public void maxInput() {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		for(;;) {
			System.out.println("---------------------------------");			
			System.out.println("0번을 입력할 경우 종료됩니다.");
			System.out.print("숫자(정수)의 크기를 입력하세요 >");		
			int size = sc.nextInt();
			int[] number = new int[size]; // 학생 수 만큼의 점수를 담을 배열을 생성
			
			if( size==0 ) { // 종료 처리
				System.out.println("프로그램을 종료합니다.");
				break;

			}

			for( int i=0; i<size; i++) {
				System.out.print("숫자를 입력하세요. >");
				number[i] = sc.nextInt();
				if( number[i] > max) {
					max = number[i];
				}
			}
			System.out.println("가장 큰 수는 " + max + "입니다.");
		}
	}

	public static int maxCom(int[] values) {
		int max = 0;

		for(int i=0; i<values.length; i++) {
			if(values[i] > max) {
				max = values[i];
			}
		}

		return max;
	}

}