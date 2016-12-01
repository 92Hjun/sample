public class Demo5 {
	public static void main(String[] args){
		// 문자열 타입 <- 문자열(1글자 이상의 문자들)은 쌍따옴표로 표시.
		String s1 = "서울특별시 종로구 봉익동";
		String s2 = "서울특별시\n종로구\n봉익동";
		
		// s1은 참조 타입의 변수가 된다.
		// 메모리 어딘가에 저장된 기본 타입이 아닌 문자열 타입을 가르키는 참조 타입을 갖는다.
		System.out.println(s1);
		System.out.println(s2);
	}	
}