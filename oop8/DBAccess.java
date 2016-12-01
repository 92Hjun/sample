public abstract class DBAccess {
		
	// 추상화 메소드
	public abstract void createdRepository(); // 클래스도 추상화가 되야함.

	
	// 구현 메소드
	public void connect() {
		System.out.println("DB와 연결합니다");
	}

	// 구현 메소드
	public void disconnect() {
		System.out.println("DB와 연결을 헤제합니다");
	}
}