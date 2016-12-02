import java.util.*;

public class ArrayListDemo {
	
	public static void main (String[] args) {
		// �̸��� ���� �� ������ �� �ִ� ArrayList �����.
			
			// ���ڿ��� 10�� ������ �ִ� collection�� �����Ѵ�.
		ArrayList<String> names = new ArrayList<String>();
		
			// ArrayList�� String��ü(�ʱ⿡ ���׸�ǥ������ �������ذ�ü)�� index���� �����Ѵ�.
		names.add("ȫ�浿");
		names.add("������");
		names.add("�̼���");
		names.add("������");
		names.add("������");
		names.add("������");


			
			//ArrayList�� ����� ��� ������Ʈ�� �ѹ��� �����Ҷ� ����Ҽ��ִ�.
		/*	
			names.clear(); // ��°� 0

		*/
			
			// ArrayList�� ����� ������Ʈ ���� ��ȸ�ϱ�
			// ArrayList�� �ִ� �޼ҵ� size()�� ���ؼ� collection�� ���̸� Ȯ���Ҽ��ִ�.
		int length = names.size();
		System.out.println(length);
		
			// ArrayList�� ����� String��ü�� ������ index�� ����� ���� �ҷ��ü��ִ�.
		// 1��° ���
		for (int i =0; i<length; i++) {
			System.out.println(names.get(i));
		}
			/*
				ȫ�浿
				������
				�̼���
				������
			*/

		// 2��° ���
		for (String userName : names) {
			System.out.println(userName);
		}
			/*
					ȫ�浿
					������
					�̼���
					������
			*/

		// ArrayList�� ������Ʈ�� ����Ǿ� �ִ��� Ȯ���ϱ�.
		// ArrayList�� isEmpty�޼ҵ带 �̿��Ͽ� �����̵Ǿ��ִ��� �ƴ��� boolean���� Ȯ�����ش�.
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("������Ʈ�� �����ϴ� ArrayList��.");
		} else {
			System.out.println("����ִ� ArrayList��.");
		}

		
	}
}