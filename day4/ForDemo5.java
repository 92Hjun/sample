public class ForDemo5 {
	public static void main(String[] args) {
		
		for (int a = 1; a<=5; a++) {
			System.out.println("실행");
			for (int i = 0; i<10; i++) {
				System.out.println(i);
				if ( i == 5) {
					break; // 가장 가까운 for문에서만 탈출
				}
			} 
		}
	}	
}