public class MemberService{
	
	// �� ����
	private Member member;

	//�α��� ����
	private boolean auth;

	public MemberService(Member member) {
		this.member = member;
	}

	public boolean isAuth() {
		return auth;
	}

	// ���̵�� ����� ���޹޾� member�� ����� ���̵�� ��й�ȣ�� ���� 
	// ���̵�, ��й�ȣ�� ��ġ�ϸ� auth���� true�� �����ϱ�
	public void login(String id, String password) {
		if(member.getId().equals(id) && member.getPassword().equals(password)) {
			auth = true;
		}
	}

	// ���̵� ���޹޾� �α׾ƿ� ó���ϱ�(auth�� ���� false�� �ٲٱ�)
	public void logout() {
		if(auth) {
			auth = false;
		}
	}
}