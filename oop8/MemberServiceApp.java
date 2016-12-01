public class MemberServiceApp {
	public static void main(String[] arge) {
		/*
		이름 :		"홍길동"
		아이디 :	"hong"
		비밀번호 :	"1234"
		나이 :		30
		정보를 가진 Member객체를 담고있는 MmberService객체 생성하기
		*/
		
		Member member = new Member();
		member.setName("홍길동");
		member.setId("hong");
		member.setPassword("1234");
		member.setAge(30);
		
		MemberService memberService = new MemberService(member);

		// System.out.println(memberService.login("hong","1234"));
		// memberService.logout("hong");

		memberService.login("hong","1234");
		System.out.println(memberService.isAuth());
		memberService.logout();
		System.out.println(memberService.isAuth());
	}
}