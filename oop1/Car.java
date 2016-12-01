public class Car {
	// 속성(필드) 정의하기
	int speed;
	boolean engineStarted;
	
	// 기능(매소드) 정의하기
	public void speedUp() {
		speed +=10;
		System.out.println("현재 속도: " + speed + "km");
	}

	public void speedDown() {
		speed -=10;
		System.out.println("현재속도: " + speed + "km");
	}
}