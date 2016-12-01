import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz4 {
	public static void main(String[] args) {

		// 아이디를 입력받아 올바른 아이디인지 검사하기
		// 아이디 작성 규칙(길이가 6글자 이상, 영어 소문자만 가능)
		Scanner sc = new Scanner(System.in);

			System.out.print("아이디를 입력하세요 >");
			String userId = sc.next();

			// 검사하기			
			// 아이디가 6글자 이상인지 검사하기
			int len = userId.length();
			if ( len<6 ) {
				System.out.println("아이디를 6글자 이상 입력해주세요.");
				return;
			}
			
			// 아이디가 영어 소문자로만 구성되었는지 검사하기 <---- boolean으로
			// Flag 변수 : 로직 수행의 특정 상태를 저장하는 변수
			boolean invalid = false;
			for(int i=0; i<userId.length(); i++) {
				int c = userId.charAt(i);
				if( c<97 || c>122 ) { 
					invalid = true;
					break;
				}
			}
			if(invalid) {
				System.out.println("ID가 소문자로만 구성되어있지 않습니다.");
				System.out.println("다시 입력해주세요.");				
			} else {
				System.out.println("ID가 소문자로만 구성되었습니다.");
			}
		

		//정규 표현식 (인터넷에 있음)					// import java.util.regex.Pattern; 후 사용
			boolean valid = false;
			String regExp = "^[a-z]{6,}$";				// ^는 표현식 시작, &는 종료
			valid = Pattern.matches(regExp, userId);	// a부터 z까지 6자리 이상 쓰였는가.

			if( !valid ) {
				System.out.println("유효하지 않음");
			}/*
			// id, pw, 날짜, email 등 특별한 패턴을 가졌을 때 사용한다.
			\\d = 숫자 (역슬래시 2개)
			\\D = 숫자가 아닌 것
			010 - 1234 -5678은 "\\d{3}-\\d{4}-\\d{4}"
		*/
	}
}