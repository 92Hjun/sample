/*�Ӽ�
	��ǰ ��ȣ, ��ǰ��, ����, ������(�Ǽ�)������ 10%, �Ǹſ���, ������

  ������
	�⺻������, �Ű����� �ִ� ������
	
  ���
	���ε� ������ ��ȯ�ϴ� �޼ҵ�(������ ����)
	��ǰ������ ��� ����ϴ� �޼ҵ�(���ΰ� ����)
	
*/
public class Product {

	int productNum;
	String productName;
	int price;
	double saleRate;
	boolean sold;
	String productor;

	public Product(){
		productNum = 0;
		productName = "";
		price = 0;
		saleRate = 0.0;
		sold = false;
		productor = "";
	}

	public Product(int pro, String na, int pri, double rat, boolean t, String tor) {
		productNum = pro;
		productName = na;
		price = pri;
		saleRate = rat;
		sold = t;
		productor = tor;
	}

	public double salePrice() {
		double salePrice = 0;
		salePrice = (int) (price - (price/100)*saleRate);
		return salePrice;
	}

	public void info() {
		System.out.println("----------��ǰ ����-----------");
		System.out.println("  ��ǰ  ��ȣ  : " + productNum);
		System.out.println("  ��ǰ  �̸�  : " + productName);
		System.out.println("  ��ǰ  ����  : " + price);
		System.out.println(" ��ǰ���ΰ��� : " + price*salePrice());
		System.out.println("  ��ǰ  ����  : " + saleRate);
		System.out.println("  ��ǰ  ��Ȳ  : " + sold);
		System.out.println("   �� �� ��   : " + productor);
	}
}