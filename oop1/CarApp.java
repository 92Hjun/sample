public class CarApp {
	
	public static void main(String[] args) {
		
		Car c = new Car(); // ����Ÿ���� �����Ҷ� �޼ҵ��� Ÿ�԰� ���ƾ� �Ѵ�.
		System.out.println(c);

		// ������ ��ü�� �ʵ�, ������ ��ü�� �޼ҵ带 ����ϱ�.
		System.out.println(c.speed);
		c.speed = 10;
		System.out.println(c.speed);
		
		c.speedUp();
		System.out.println(c.speed);
	}	
}