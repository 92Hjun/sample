import java.util.*;

public class HashSetDemo {
	
	public static void main (String[] args) {
		// �޴��̸��� �����ϴ� HashSet��ü �����
		HashSet<String> menuSet = new HashSet<String>();

		menuSet.add("û����");
		menuSet.add("�����");
		menuSet.add("�κ�����");
		menuSet.add("�ѿ�������");
		menuSet.add("Ȳ������");
		menuSet.add("��������");
		menuSet.add("��������");
		menuSet.add("��������");
		menuSet.add("��������");

		int a = menuSet.size();

		// Set�������̽��� �ߺ��� ������Ʈ�� ���Ծ��ϱ⶧����
		// ���� 4�� �ߵ��� ���������� �����ʾ� ����Ȱ��� �� ��°��� 6���� ��µȴ�.
		System.out.println("����� ���� " + a);

		for (String menu : menuSet) {
			System.out.println(menu);
		}
	}
}