public abstract class Tarnsaction {
	public void connect( ) {
		System.out.println("금융 결제원 연결.");
	}

	public void close( ) {
		System.out.println("금융 결제원 연결 해제.");
	}

	public abstract void job( );

	public void process( ) {
		connect();
		job();
		close();
	}
}