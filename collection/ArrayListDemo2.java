import java.util.*;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ArrayList Ŭ������ String Ÿ���� ��ü�� ��� ���� names �� �����Ѵ�.
		// List�� ��� �������� ũ�⸦ �̸� �������� �ʾƵ� ũ�Ⱑ �������̴�.
		ArrayList<String> names = new ArrayList<String>();

		while (true){
			System.out.println("1. ��� 2. ��ȸ 0. ����");
			System.out.println("����>");

			int menu = sc.nextInt();
			
			if (menu == 1) { // ���
				System.out.println("����� �̸��� �Է��ϼ���: ");
				String name = sc.next();
				//ArrayList�� �޼ҵ� add �� ����Ͽ� �Է¹��� �̸��� names�� �����Ѵ�.
				names.add(name);
			} else if (menu == 2) { // ��ȸ
				// �̳׽�Ʈ for���� ����Ͽ� �����Ѱ��� ����Ѵ�.
				for (String n : names) {
					System.out.println(n);
				}
			} else if (menu == 0) { // ����
				break;
			}
		}
	}
}