public class MemberApp {

	public static void main(String[] args) {
		
		// 회원 정보를 담기위한 Member 객체를 생성하고
		Member m = new Member();

		// Setter를 사용해 이름,아이디,비번,나이 등의 데이터를 객체에 저장하기
		m.setName("홍길동");
		m.setId("Reader");
		m.setPassword("1234");
		m.setAge(29);

		// 생성된 Member객체에 저장된 값을 getter함수를 사용해서 화면에 출력하기.
		System.out.printf("이    름: %s\n아 이 디: %s\n비밀번호: %s\n나    이: %d\n",
							m.getName(), m.getId(), m.getPassword(), m.getAge());
	}
}