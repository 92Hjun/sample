public class Quiz1 {
	public static void main(String[] args) {
		// 배열에서 가장 큰 숫자 찾기

		// 가장 큰 값을 담을 변수
		int max = 0;
		int min = 0;

		int[] numbers = {1, 3, 7, 4, 2, 6};

		for (int n : numbers) {
			if (max < n){
				max = n;
			}
		}
		System.out.println("최대값은 " + max);
	}
}