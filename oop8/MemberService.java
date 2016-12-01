public class MemberService{
	
	// 고객 정보
	private Member member;

	//로그인 여부
	private boolean auth;

	public MemberService(Member member) {
		this.member = member;
	}

	public boolean isAuth() {
		return auth;
	}

	// 아이디와 비번을 전달받아 member에 저장된 아이디와 비밀번호를 비교해 
	// 아이디, 비밀번호가 일치하면 auth값을 true로 변경하기
	public void login(String id, String password) {
		if(member.getId().equals(id) && member.getPassword().equals(password)) {
			auth = true;
		}
	}

	// 아이디를 전달받아 로그아웃 처리하기(auth의 값을 false로 바꾸기)
	public void logout() {
		if(auth) {
			auth = false;
		}
	}
}