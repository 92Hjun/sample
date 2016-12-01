public class ArrayService {

	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	 			//0  1  2  3  4  5  6  7  8  9 //
	// 배열 이동시키기
	// arr1배열에서 no에 해당하는 숫자를 찾고 no를 맨뒤의 배열로 넣는다.

	// no가 3일때.
	public int[] move(int no) {

		for( int i = no+1; i<=arr1.length; i++ ) {
			arr1[i-2] = arr1[i-1];
		}
			arr1[arr1.length-1] = no;
		return arr1;
	}

	// 추가 문제
	// n번째 숫자부터 step만큼 왼쪽으로 이송시켜라
	public int[] leftShift(int begin, int step) {
		int position = 0;
		int[] temp = new int[arr1.length];

		for (int i = begin-1; i<arr1.length; i++) {
			temp[position] = arr1[i];
			position++;
			if(i==10) {
				break;
			}

		}
		int[] result = new int[position];
		for(int i=0; i<position; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	// 배열 복사하기
	// arr2배열을 지정된 위치부터 끝까지 복사한 배열을 반환하기
	public int[] copy(int begin) {
		int position = 0;

		int[] temp = new int[arr2.length];
		for(int i=0; i<=arr2.length-begin; i++) {
			temp[position] = arr2[begin+i-1];
			position++;
		}
		int[] result = new int[position];
		for(int i=0; i<position; i++) {
			result[i] = temp[i];
		}
		return result;
	}
	// 배열 잘라내기
	// arr3배열
	public int[] copy(int begin, int end) {
		int position = 0;
		int[] temp = new int[arr3.length];

		for(int i=0; i<=(end-begin); i++) {
			temp[position] = arr3[begin+i-1];
			position++;
		}
		int[] result = new int[position];
		for(int i=0; i<position; i++) {
			result[i] = temp[i];
		}
		return result;
	}
}