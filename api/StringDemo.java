public class StringDemo {
	
	public static void main(String[] args){

		/*
			String 클래스
				String 클래스는 문자열을 표현한다.
				String값은 불변값이다. 한번 만들어진 이후에는 변경할 수 없다.
				String은 객체를 생성하는 특별한 방법을 제공한다.
					String str = new String("abc"); // 생성자를 이용한 String 객체 생성
					String str = "abc"; 			// 문자열 표현식을 이용한 String객체 생성
					아래식의 생성은 생성자 선언 없이도 객체를 생성할 수 있는 유일한 클래스이다.
				
				Employee emp = new Employee();
				emp.setNo(12);

				Radom ran = new Random();
				ran.nextInt();

				String str = new String("abc");
				str.toUpperCase(); 는
				"abc".toUpperCase(); 와 같다.
		*/
		String str = "자바 프로그래밍 연습";
		
		// 문자열의 길이를 반환하는 메소드 : int length()
		int len = str.length();
		System.out.println("문자열의 길이 : " + len);
		// 주민등록증과 같이 글자수의 개수가 필요한 곳에 사용할 수 있다.
		// 트위터, 페이스북 등 글자수 제한을 할 때도 사용할 수 있다.


		// 문자열이 비어있는지 여부를 반환하는 메소드: boolean isEmpty();
		// 문자열의 길이가 0이면 true를 반환하는 메소드이다.
		boolean empty = str.isEmpty(); // 자주 사용되는 메소드.
		System.out.println("빈 문자열인가? " + empty);
		// 반드시 입력해야하는 필수정보 등을 입력하는 곳에 사용된다.



		
		
		// 문자열에서 의미없는 공백을 제거한 새로운 문자열을 반환하는 메소드 : String trim();
		String str2 = "     홍   길 동     ";
		String str3 = str2.trim();
		System.out.println("str2:["+str2+"]");
		System.out.println("str3:["+str3+"]");

		
		// 문자열의 내용을 비교해 동일한 내용을 가진 
		// 문자열인지 여부를 반환하는 메소드 : boolean equals(Object str)
		String str4 = "애플";
		String str5 = "애플";
		boolean equal1 = str4.equals(str5);
		System.out.println("동일한 문자열인가? " + equal1);
		
		String str6 = "apple";
		String str7 = "Apple";
		boolean equal2 = str6.equalsIgnoreCase(str7);
		System.out.println("대소문자 구분 없이 비교했을 때 동일한 문자열인가? " + equal2);
		
		
		// 해당 문자열이 지정한 문자열을 포함하고 있는지의 여부를 반환하는 메소드 : boolean contains(String s)
		String str8 = "자바 프로그래밍 - 자바 기초 및 응용";
		boolean contains = str8.contains("자바");
		System.out.println("[자바]라는 문자열을 포함하고 있는가? " + contains);

		
		// 문자열에서 지정된 위치의 문자(char)를 반환하는 메소드 : char charAt(int index)
		char ch = str8.charAt(1);
		System.out.println("1번째 문자는? " + ch);


		// 문자열에서 지정된 문자열이 처음으로 등장하는 위치를 반환하는 메소드 : int indexOf(String str)
		// String str8 = "자바 프로그래밍";
		int index = str8.indexOf("프");
		System.out.println("문자열에서 [프]라는 글자가 처음으로 등장하는 위치는? : " + index);


		// 문자열의 내용을 지정된 문자열로 대체한 새로운 문자열을 반환하는 메소드 : String replace(String str, String str)
		String str9 = str8.replace("자바", "파이썬");
		System.out.println("str8 : [" + str8 + "]");	// str8은 변경할 수 없으므로
		System.out.println("str9 : [" + str9 + "]");	// str8을 참조해 str9를 새로 만든다.


		// 문자열에서 지정된 위치부터 끝까지 문자열을 잘라서 반환하는 메소드 : String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String str11 = str10.substring(5);
		System.out.println("5번째부터 잘라낸 문자열 : " + str11);


		// 문자열에서 지정된 구간의 문자열을 잘라서 반환하는 메소드 : String substring(int begin(inclusive), int end(exclusive))
		// 시작위치는 포함되고, 끝위치는 포함되지 않는다.
		// String str10 = "abcedfghijklmn";
		String sub2 = str10.substring(0, 4);
		System.out.println("0번부터 4번 앞까지 잘라는 문자열 : " + sub2);

		String name = "홍킬똥";
		String familyName = name.substring(0, 1);
		System.out.println("성: " + familyName);
		
		//----------------------------------------------------------------------------------------------//
		// 문자열을 지정한 구분자를 기준으로 잘라서 배열로 반환하는 메소드 : String[] split(String delim)
		String text = "서울,경기,인천,대전,부산,광주,울산,대구";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[1]);


		// 문자열을 소문자 또는 대문자로 변환한 새로운 문자열을 반환하는 메소드
		// String toUpperCase(), String toLowerCase()
		String str13 = "sony";
		String str14 = str13.toUpperCase();
		System.out.println("str13:["+str13+"]");
		System.out.println("str14:["+str14+"]");


		// 정수, 실수, 불린값, 기타 여러 종류의 값들을 문자열로 변환해 반환한다.
		// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234; // 정수 1234를
		String str15 = String.valueOf(number); // 문자열 "1234"로 변환해 반환한다.
		System.out.println(str15); // 문자열로 변환된 1234를 출력한다.
		System.out.println("일의 자리수: " + str15.substring(str15.length()-1));

		String str16 = 1234+""; // 문자열로 자동변환


	
	}
}