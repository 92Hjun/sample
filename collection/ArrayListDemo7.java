import java.util.*;

public class ArrayListDemo7 {
	public static void main(String[] args){
		
		ArrayList<Product> cart = new ArrayList<Product>();

		cart.add(new Product(23, "����"));
		cart.add(new Product(12, "��å"));
		cart.add(new Product(17, "������"));
		cart.add(new Product(16, "å��ħ"));
		cart.add(new Product(11, "���찳"));

		// ��ǰ��ȣ ������ �����ϱ�.
		
		//error: no suitable method found for sort(ArrayList<Product>)
		// ������ Product Ŭ�������� implements Comparable<Product> Compararble�� ������
		// compareTo() �޼ҵ带 �������Ͽ��� ����� ���������� , ������ ���� 0 �̸� �ڸ���ü�� �ȵȴ�.
		// �׷��� sort�� �����ϸ� ������ȣ���� ū��ȣ ������ �����̵ȴ�.

		Collections.sort(cart);

		System.out.println(cart);
	}
}