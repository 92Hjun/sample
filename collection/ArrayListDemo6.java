import java.util.*;

public class ArrayListDemo6 {
	
	public static void main(String[] args) {
		// ��ǰ���� �����ϴ� ArrayList �����.
		ArrayList<String> productNames = new ArrayList<String>();

		productNames.add("����");
		productNames.add("������");
		productNames.add("����");
		productNames.add("������");
		productNames.add("��å");
		productNames.add("å��ħ");
		productNames.add("������");
		
		System.out.println(productNames);
		// [����, ������, ����, ������, ��å, å��ħ, ������]
		
		// Collections�� List ,set�� ���õ� ������ �޼ҵ�����ִ�.
		// Collection �� �������̽� Collections �� �޼ҵ���� �����̴�.
		// Collections�� �ִ� sort �޼ҵ�� List�� �������ش�.
		Collections.sort(productNames);

		System.out.println(productNames);
		// [����, ��å, ������, ������, ������, ����, å��ħ]


	}
}