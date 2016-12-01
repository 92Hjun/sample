public class ForDemo6 {
	public static void main(String[] args) {
		
		// 1~100까지의 합을 계산하기
		// 단, 합계가 3000을 넘어가는 순간의 숫자를 알아내기

		int sum = 0;
		int a = 1;

		for (; a<=100; a++) {
			sum += a;
			if( sum>=3000 ) {
				break;
			}
		}
		System.out.println("3000이 넘는 순간의 숫자 :" + sum + "\t실행횟수:" + a );
	}	
}