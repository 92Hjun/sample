public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact 객체를 전달받아서 배열에 저장하기.
	public void addContact(Contact contact) {
		contacts[currentPosition] = new Contact();
		contacts[currentPosition] = contact;	
		currentPosition++;		
	}

	// Contact 배열에 저장된 모든 연락처 정보 표시하기.
	public void displayContact() {
			for (int i=0; i<currentPosition; i++) {
			System.out.printf("번호 : %d\n이름 : %s\n전화번호 : %s\n이메일 : %s\n", 
									contacts[i].getNo(), contacts[i].getName(), contacts[i].getPhone(), contacts[i].getEmail());
		}
	}
}