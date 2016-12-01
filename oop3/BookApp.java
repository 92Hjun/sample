public class BookApp {
	public static void main(String[] args) {

		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "�̰��� �ڹٴ�", "ȫ�浿", "�Ѻ��̵��", 35000, "2010-10-10");
		bookCart[1] = new Book(2, "�ڹ� �� �׼�", "������", "�Ѻ��̵��", 36000, "2016-05-10");
		bookCart[2] = new Book(3, "������ �����ӿ�ũ", "������", "�Ѻ��̵��", 27000, "2013-01-10");
		bookCart[3] = new Book(4, "������ ��ť��Ƽ", "�̼���", "�Ѻ��̵��", 26000, "2014-04-10");
		bookCart[4] = new Book(5, "�ڹ� �� ���α׷���", "����", "�Ѻ��̵��", 33000, "2015-11-23");
		
		
		// īƮ�� ����� ��� å���� ������ ǥ���ϱ�
		System.out.println("----����� å���� ����----");
		for ( Book num : bookCart ) {
			System.out.println(num.getTitle());
		}


		// īƮ�� ����� å���� ���� ������ ǥ���ϱ�
		System.out.println("----å���� ������ ����----");
		int total = 0;
		for ( Book num : bookCart ) {
			total += num.getPrice();
		}
		System.out.println(total);


		//īƮ�� ����� å�߿��� ���� ��� ������ å ����� ������ ǥ���ϱ�
		System.out.println("----���� ��� ������ å ����� ����----");
		int maxPrice = 0;
		String maxTitle = null;
		for ( Book num : bookCart ) {
			if( num.getPrice() > maxPrice ) {
				maxPrice = num.getPrice();
				maxTitle = num.getTitle();
			}		
		}
		System.out.printf("���� ��� å : %s  ���� : %d\n", maxTitle, maxPrice);
	}
}