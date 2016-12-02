import java.util.*;

public class ProductRepository {
	
	ArrayList<Product> db = new ArrayList<Product>();

	// ���ο� ��ǰ��ü�� ���޹޾Ƽ� 5�� ���ο��� �̸� ������ ArrayList�� �����ϴ� �޼ҵ�
	public void addProduct (Product item) {
		db.add(item);
	}
	// ��ǰ�̸��� ���޹޾Ƽ� ArrayList���� �� ��ǰ�̸��� �ش��ϴ� ��ǰ�� ã�Ƽ� ��ȯ�ϴ� �޼ҵ�
	public Product findProduct(String name) {
		Product result = null;
		for (Product pro : db) {
			boolean contains = pro.getName().contains(name);
			if (contains) {
				result = pro;
			}
		}
		return result;
	}

	// ArrayList�� ����� ��� ��ǰ������ ����ϴ� �޼ҵ�
	public void displayProducts() {
		for (Product p : db){
			System.out.printf("��ǰ��ȣ: %d , ��ǰ��: %s\n", p.getNo(), p.getName());
		}

	}
}