public class Contact {
	// 속성 정의하기
	
	// 순번
	// 이름
	// 연락처
	// 이메일
	int no;
	String name;
	String phoneNum;
	String email;
	
	// 기능 정의하기

	// 전화하기
	public void call() {
		System.out.println(phoneNum+ "로 연락을 합니다.");
	
	}
	
	// 문자보내기
	public void sendMessage() {
		System.out.println(phoneNum + "로 문자를 보냅니다.");

	}	
	// 메일보내기
	public void sendMail() {
		System.out.println(email + "로 메일을 보냅니다.");

	}
}