import java.util.*;

public class MethodDemo3 {

	// ������ �߻���Ű�� �޼ҵ� �����
	public static int random() {
		Random r = new Random();
		int number = r.nextInt(100); // 0���� 99������ ���� ������ ȣ��
		// return Ű����� �� �޼ҵ带 ȣ���� ���� ���� ��ȯ�Ѵ�.
		// ���� ���� void�� �ƴ� ��� �ݵ�� return�� ���־�� �Ѵ�.
		return number;
	}

	// ���� ��¥�� ��ȯ�ϴ� �޼ҵ� �����
	public static String getCurrentDate() {
		Date now = new Date();
		String str = now.toString();

		return str;
	}

	public static void a() {
		// return ���� �������� �����Ƿ� ���x
	}
	
	public static void main(String[] args) {
		int x = random();
		System.out.println(x);

		System.out.println(random());
		System.out.println(random() * 100);

		int y = random() * 1000;
		System.out.println(y);

		String d = getCurrentDate();
		System.out.println(d);
	}	
}