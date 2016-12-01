public class OpticalMouse implements Mouse, Lightable {

		// Lightable 인터페이스에 정의된 추상 메소드 구현
	public void light() {
		System.out.println("반짝~ 반짝~");
	}

	public void geneteLight () { }
	


	// Mouse인터페이스에 정의된 추상메소드 구현
	public void wheel() { 
		System.out.println("빛을 번쩍이며 빙글.. 빙글..");
	}
	public void click() {
		System.out.println("빛을 번쩍이며 클릭.. 클릭..");
	}
	public void move() {
		System.out.println("빛을 번쩍이며 움직.. 움직..");
	}
	
	// Cleanable 인퍼퍼이스에 정의된 추상 메소드 구현
	//public void clean() {
	//	System.out.println("LED 발신부 청소 완료...");
	//}
}