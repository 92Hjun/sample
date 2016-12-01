public class ArrayUtils1 {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	public int[] move(int index) {

		// 원본 복사본을 만들자.
		int[] result = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			result[i] = arr[i];
		}

		// 제일 처음 덮여쓰여질 값을 미리 보관해놓자.
		int number = arr[index-1];

		for (int i=index; i<arr.length; i++) {
			result[i-1] = arr[i];
		}
		result[arr.length-1] = number;

		System.out.println(java.util.Arrays.toString(result));
		return result;
	}

	public static void main(String[] args) {
		ArrayUtils1 s = new ArrayUtils1();
		s.move(8);


	}
}