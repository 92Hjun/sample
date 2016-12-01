public class ProductApp {
	public static void main(String[] args) {

		// ��ǰ 5���� ��� �迭 �����ϱ�
		Product[] products = new Product[5];

		// �迭�� ��ǰ 5�� �����ϱ�
		products[0] = new Product(1, "���� ����", 9000, 10, false, "����");
		products[1] = new Product(2, "�ٳ��� ����", 12000, 7, true, "�������");
		products[2] = new Product(3, "������ �ǰ� ����", 11000, 3, false, "�Ǳ�");
		products[3] = new Product(4, "������ ���� ����", 10000, 15, false, "GS_PB");
		products[4] = new Product(5, "��� ����", 8500, 10, false, "�Դ�");

		// �迭�� ����� ��ǰ �߿��� �Ǹ� ���� ��ǰ�� ǥ���ϱ�
		System.out.println("--------���� �Ǹ� ��--------");
		for ( Product s : products ) {
			if(s.sold == true){
				System.out.println(s.productName);
			}
		}

		// �迭�� ����� ��ǰ�߿��� ������ 10000�� �̻��� ��ǰ�� ǥ���ϱ�
		System.out.println("--------10,000�� �̻��� ��ǰ ���--------");
		for ( Product p : products ) {
			if(p.price >= 10000) {
				System.out.println(p.productName);
			}
		}

		//�迭�� ����� ��ǰ�� ��ü������ ǥ���ϱ�
		System.out.println("--------��ǰ�� ���� ���--------");
		for ( Product p : products ) {
			System.out.printf("%s\t ���� : %4d\t  ���ΰ� : %4d \n", p.productName,p.price,Math.round(p.salePrice()));
		}
	}	
}