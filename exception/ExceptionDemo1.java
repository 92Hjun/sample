import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException; // ���� import�� ���ش�.
import java.io.IOException;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
		// FileNotFoundException�� ������ ������
		BufferedReader reader = new BufferedReader(new FileReader("��������.txt"));

		// IOException�� ������ �޼ҵ�
		String text = reader.readLine();
		System.out.println("���� ����: " + text);

		} catch (FileNotFoundException fnfe) {
			System.out.println("���� �߻�!!!!!");
			System.out.println("���ܰ�ü: " + fnfe);
			fnfe.printStackTrace(); // ������ ������ �� �ִ� ������ ȭ�鿡 ����ϴ� �޼ҵ�

			// ���� ó�� �ڵ� �ۼ�
			// 1. ����� ģȭ���� ���� �޼����� ǥ���Ѵ�.
			System.out.println("������ ã�� �� �����ϴ�. ��� �� ���� �̸��� Ȯ���ϼ���");

		} catch (IOException ioe) { // catch�� �ߺ��ؼ� ���� ó���� �� �� �ִ�.
			
			// IOException�� ������ ������ �о�� �� ������ �߻��ϴ� ��� �����.
			System.out.println("������ �о���� ���� ������ �߻��Ͽ����ϴ�");
			System.out.println("���� ���¸� Ȯ���ϼ���");
		}
	} // catch�� ����ڰ� ��� ������ ������ �˷��ִ� ����� ģȭ���� �޼����� �˷��ش�.
}
