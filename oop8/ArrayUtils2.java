public class ArrayUtils2 {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	public int[] copy(int begin) {
		int[] result = new int[arr.length-begin];
		for (int i=begin; i<arr.length; i++) {
			result[i-begin] = arr[i];
		}
		System.out.println(java.util.Arrays.toString(result));
		return result;
	}

	public static void main(String[] args) {
		ArrayUtils2 s = new ArrayUtils2();
		s.copy(3);
	}
}