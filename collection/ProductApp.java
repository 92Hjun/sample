import java.util.*;

public class ProductApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductRepository  pr = new ProductRepository();
		
		// �Է°� �о����
		System.out.println("��ǰ��ȣ�� �Է��ϼ���.");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("��ǰ���� �Է��ϼ���.");
		String name = sc.nextLine();
		
		// �Է°��� ���� ��ü �����
		Product p = new Product();
		
		// ������ ��ü�� �Է°� ���.
		p.setNo(no);
		p.setName(name);
		
		// db���� ���� �������ִ� �޼ҵ忡 ���� ����ִ� ��ü�� �����ϱ�.
		pr.addProduct(p);
		System.out.println("ã����� ��ǰ���� �Է��ϼ���.");
		pr.findProduct(sc.next());
		pr.displayProducts();
	}
}