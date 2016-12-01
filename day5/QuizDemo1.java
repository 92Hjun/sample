public class QuizDemo1 {
	
	public static int max(int[] numbers) {

		int maxNumber = 0;
		for(int num : numbers) {
			if(num > maxNumber){
				maxNumber = num;
			}
		}
		return maxNumber;	
	}

	public static boolean contains(int[] numbers, int num) {
		boolean isExist = false;

		for(int n0 : numbers) {
			
			if(number == num) {
				isExist = true;
			}
		}
		return isE;
	}

	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 4, 2, 56, 7, 23, 9};
		int maxValue1 = max(arr1);
		System.out.println("최대값: " + maxValue1);
		
		boolean look1 = contains(arr1, 10);
		System.out.println("포함되어 있는가? " + look1);
		
		int[] arr2 = {-1, -499, 42, -5, 15, -29, 9, 10};
		int maxValue2 = max(arr2);
		System.out.println("최대값: " + maxValue2);

		boolean look2 = contains(arr2, -499);
		System.out.println("포함되어 있는가? " + look2);
	}	
}