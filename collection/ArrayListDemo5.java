import java.util.*;

public class ArrayListDemo5 {
		
		public static void main (String[] args) {
		ArrayList<Product> cart = new ArrayList<Product>();
		Product p1 = new Product(1, "å");
		Product p2 = new Product(2, "����");
		Product p3 = new Product(3, "������");
		Product p4 = new Product(4, "ũ���Ľ�");

		cart.add(p1);
		cart.add(new Product(5, "���찳"));
		cart.add(p2);
		cart.add(p3);
		cart.add(p4);
		cart.add(new Product(6, "�ϸ�Ŀ"));

		// ArrayList�� ����� ��ü�߿��� ���� ��ǰ �����

		// ArrayList�� ����� ��ü�߿��� [��ǰ��ȣ = 5, ��ǰ��= ���찳] ã�Ƽ� �����.
		Product p = new Product(5,"���찳");
		cart.remove(p);

		
		// ArrayList �� add�� �����־ ����ϸ� 
		// ��ü�� �������� ��µǴµ� ��簴ü���� Object�� ��ӹ޾� ������̱⶧����
		// Object�ȿ� toString�� Product�� ������ �Ͽ��ָ�
		// �ٷ� ��ü���� ���� �ٷ� ����Ҽ��ִ�.
		// �׷��� toString�� �������Ͽ� ������ϸ� ������ ������ ����Ȯ���Ҽ��־� ���ϴ�.
		
		/*
		[Product[no=12], name=[å], Product[no=23], name=[����], Product[no=32], 
		name=[������], Product[no=43], name=[ũ���Ľ�], Product[no=52], 
		name=[�ϸ�Ŀ], Product[no=61], name=[���찳]]
		*/
		
		// �ڹٿ��� ������ ��ü��?  �ؽ��ڵ尪�� equals������� true�� ���;� �����ϴ�.

		System.out.println(cart);


		}
}