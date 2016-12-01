public class Demo3 {
	public static void main(String[] args){
		// 삼항 연산자.
		// (조건식)? true일때 연산식 혹은 값 : false일때 연산식 혹은 값.
		
		int score = 97;
		String result1 = ((score >= 90) ? "합격" : "불합격");
		System.out.println("판정 결과 : " + result1);

		// 구매 금액이 50,000원 이상이면 배송비가 무료.
		int price = 25_000;
		int payment =  ((price > 50_000) ? price : price + 2_500);
		System.out.println("결제 금액 : " + payment + "원");
		
	}
}