public class ArrayUtils3 {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	public int[] cut(int begin, int end) {
		int[] result = new int[end-begin+1];
		for (int i=begin; i<= end; i++) {
			result[i-begin] = arr[i];
		}
		System.out.println(java.util.Arrays.toString(result));
		return result;
	}

	public static void main(String[] args) {
		ArrayUtils3 s = new ArrayUtils3();
		s.cut(2,5);
}