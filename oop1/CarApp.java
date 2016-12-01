public class CarApp {
	
	public static void main(String[] args) {
		
		Car c = new Car(); // 참조타입을 선언할때 메소드의 타입과 같아야 한다.
		System.out.println(c);

		// 생성된 객체의 필드, 생성된 객체의 메소드를 사용하기.
		System.out.println(c.speed);
		c.speed = 10;
		System.out.println(c.speed);
		
		c.speedUp();
		System.out.println(c.speed);
	}	
}