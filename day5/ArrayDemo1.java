public class ArrayDemo1 {
	public static void main(String[] args) {

		// 정수 5개를 가지고 있는 배열 만들기
		int[] numbers = {1, 5, 8, 10, 4, 5, 66, 80, 1, 4, 6, 3, 5, 11, 52, 66, 28, 42, 8, 90};

		// 배열의 크기 알아내기
		// numbers.length
		int size = numbers.length;
		System.out.println("배열의 크기" + size);

		// 배열에서 값 가져오기
		// numbers[인덱스 번호]
		int x = numbers[0];
		int y = numbers[1];
		System.out.println("배열의 0번째 값: " + x);
		System.out.println("배열의 1번째 값: " + y);

		// 모든 숫자의 합계를 구하기
		// 방법1
		int total1 = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
		System.out.println("합계1: " + total1);

		// 방법2
		int total2 = 0;
		total2 += numbers[0];
		total2 += numbers[1];
		total2 += numbers[2];
		total2 += numbers[3];
		total2 += numbers[4];
		System.out.println("합계2: " + total2);

		// 방법3
		int total3 = 0;
		for ( int i=0; i<size; i++) {
		total3 += numbers[i];
		}
		System.out.println("합계3: " + total3);

		//방법4
		int total4 = 0;
		for ( int a : numbers ) {
			total4 += a;
		}
		System.out.println("합계: " + total4);
	}	
}