public class Demo1 {
	public static void main(String[] args){
		// 논리 연산자.
		int x = 10;
		int y = 10;

		boolean result1 = false && x++ >10;
		boolean result2 = false & y++ > 10;
		// &&는 좌변이 false이면 우변을 평가하지않고 바로 전체 결과를 false로 판정.
		// 반면에 &는 좌변이 false여도 우변을 평가한다. 
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}