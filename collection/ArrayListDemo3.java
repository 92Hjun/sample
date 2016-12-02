import java.util.*;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		/* ����ڽ�
		Integer a = new Integer(10);
		Integer a = (10);
		ArrayList���� ��ü�� ������ �ֱ⶧���� 
		Integer�� �̿��Ͽ� ������ ��ü�� ��ȯ�Ͽ� ��´�
		�̶� ���� �ִ� ����ڽ��� ����ϸ� numbers.add(new Integer(10));
		��� �����ʰ� numbers.add(12); ��� �ص� �����ϴ�.
		*/

		// �⺻�ڷ��� ���� �����ϴ� ArrayList�����
		// �⺻�ڷ��� Ÿ�Կ� �����Ǵ� WrapperŬ���� Ÿ���� ArrayList�� Ÿ������ �����Ѵ�.
		// ArrayList<Integer>, ArrayList<Double>, ...
		
		// ������ ������ �����ϴ� ArrayList �����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// ArrayList �� �ִ� add �޼ҵ带 ���ؼ� ���� �����Ѵ�.
		numbers.add(new Integer(12));
		numbers.add(23);	// numbers.add(new Integer(23)); // ����ڽ�
		numbers.add(16);	// numbers.add(new Integer(16)); // ����ڽ�
		numbers.add(5);		// numbers.add(new Integer(5));  // ����ڽ�
			
		/*
			Integer �� �̿��Ͽ� ��ü�� ��ȯ�� ���� ���� int Ÿ������ ��ȯ�Ϸ���
			Integer n1 = numbers.get(0);
			int x = n1.intValue();���� �ؾ��ϴµ�
			���� ��ڽ����ϸ� int n1 = numbers.get(0)�� �Ͽ��� �ڵ�����
			int Ÿ������ ��ȯ�Ͽ� ����.
		*/

		// ArrayList �� �ִ� get �޼ҵ带 ���ؼ� ���� ����Ѵ�.
		int n1 = numbers.get(0);		// int n1 <- x.intValue() <- Integer x = numbers.get(0)
		int n2 = numbers.get(1);		// int n2 = numbers.get(1).intValue();
		Integer n3 = numbers.get(2);
		Integer n4 = numbers.get(3);

		System.out.println(n1 + "," + n2 + "," + n3 + "," + n4);
		/* 12,23,16,5 */
		
		for (int a : numbers) {
			System.out.println(a);
		}
		/*
			12
			23
			16
			5
		*/


	}
}