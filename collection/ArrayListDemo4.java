import java.util.*;

public class ArrayListDemo4 {
		
	public static void main (String[] args) {
		
		// ������� �����ϴ� ArrayList�����
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("�ڹ�");
		subjects.add("�ڹٽ�ũ��Ʈ");
		subjects.add("SQL");
		subjects.add("�ϵ�");
		
		// 1��° ���	subjects.remove("SQL"); ������ ��ü�� ��ġ�ϴ� ��ü�� ã�Ƽ� �����.
		// 2��° ���
		subjects.remove(2);	// ������ index�� ����� ��ü�� �����.
		
		for (String a : subjects) {
			System.out.println(a);
		}
		
	}
}