public class ArrayService {

	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	 			//0  1  2  3  4  5  6  7  8  9 //
	// �迭 �̵���Ű��
	// arr1�迭���� no�� �ش��ϴ� ���ڸ� ã�� no�� �ǵ��� �迭�� �ִ´�.

	// no�� 3�϶�.
	public int[] move(int no) {

		for( int i = no+1; i<=arr1.length; i++ ) {
			arr1[i-2] = arr1[i-1];
		}
			arr1[arr1.length-1] = no;
		return arr1;
	}

	// �߰� ����
	// n��° ���ں��� step��ŭ �������� �̼۽��Ѷ�
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

	// �迭 �����ϱ�
	// arr2�迭�� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
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
	// �迭 �߶󳻱�
	// arr3�迭
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