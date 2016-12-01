public class ArrayApp {
	public static void main(String[] args) {
		ArrayService s1 = new ArrayService();
		
		//int[] arr1 = s1.move(4);

		/*
		for(int i=0; i<10; i++) {
		System.out.println(arr2[i]);
		}
		
		//int[] arr2 = s1.copy(5);
		//System.out.println(arr2[5]);

		int[] arr3 = s1.copy(3,9);
		
		for(int i=0; i<9; i++) {
		System.out.println(arr3[i]);
		}
		*/
		
		int[] arr1 = s1.leftShift(4,2);
		for(int i=0; i<9; i++) {
		System.out.println(arr1[i]);

		}
	}
}