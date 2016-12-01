public class Exercise06 {
	public static void main(String[] args) {
		
		
		for ( int a=0; a<6; a++) {
			for ( int b=0; b<=a; b++) {
				System.out.print("¤»");
			}
			System.out.println();
		}
		
		for ( int c=1; c<=5; c++) {
			for ( int d=1; d<=6-c; d++) {
				System.out.print("¤»");
			}
			System.out.println();
		}
	}
}