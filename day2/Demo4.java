public class Demo4 {
	public static void main(String[] args){
		// 문자 타입 - 한 글자를 저장하는 자료형

		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		// char c4 = 'AB'; 글자 2개를 저장할 수 없다.
		// 영어 한 글자가 2byte이기 때문이다.
		// 유니코드의 모든 문자는 2byte 크기로 저장된다.
	}	
}