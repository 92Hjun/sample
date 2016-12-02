import java.io.*;

public class ExceptionDemo2 {

	// reading()�� �ڽ��� ����ϴ� ���๮���� �߻��ϴ� ���ܸ� ó������ �ʰ�
	// ��� �߻��� ����Ǵ� ���ܸ� throws ���� �ٽ� ����������.
	public static void reading() throws FileNotFoundException, IOException{

		// reading()�� �����ϴ� ������ ���ܸ� ó���϶�� �ٽ� �����ٴ� ���� �ǹ�.
		// FileNotException�� ������ ������
		BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));

		// IOException�� ������ �޼ҵ�
		String text = reader.readLine();
		System.out.println("���� ����: " + text);
	}

	// main()�޼ҵ�� reading()�޼ҵ尡 ������ ���ܿ� ���� ó���� �����ϰ� �ִ�.
	// reading()�޼ҵ�� �ڽ��� ����ϴ� main()���� ����ó���� å���� ���Ѱ��.
	public static void main(String[] args) {
		try {
			ExceptionDemo2.reading();
			// reading()�� ����ϴ� ������ ���� ó���� ���־�� �Ѵ�.

		} catch (FileNotFoundException e1) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e2) {
			System.out.println("������ �д� �� ������ �߻��߽��ϴ�.");
		}
	}
}