public abstract class Tarnsaction {
	public void connect( ) {
		System.out.println("���� ������ ����.");
	}

	public void close( ) {
		System.out.println("���� ������ ���� ����.");
	}

	public abstract void job( );

	public void process( ) {
		connect();
		job();
		close();
	}
}