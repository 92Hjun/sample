public class MemberServiceApp {
	public static void main(String[] arge) {
		/*
		�̸� :		"ȫ�浿"
		���̵� :	"hong"
		��й�ȣ :	"1234"
		���� :		30
		������ ���� Member��ü�� ����ִ� MmberService��ü �����ϱ�
		*/
		
		Member member = new Member();
		member.setName("ȫ�浿");
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