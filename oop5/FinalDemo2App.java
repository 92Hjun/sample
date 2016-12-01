public class FinalDemo2App {
	public static void main(String[] args) {
		
		/*
			FinalDemo2객체는 객체마다 x값과 y값을 각각 다른 값을 가진 객체를
			생성할 수 있다.
			하지만, final로 지정된 x값은 변경할 수 없다.

		*/
		FinalDemo2 d1 = new FinalDemo2(10,1);
		d1.setY(9);
		System.out.println(d1.getX());

		FinalDemo2 d2 = new FinalDemo2(20,3);
		d2.setY(5);
		System.out.println(d2.getX());
		// d2.setX(10); 생성자를 통해 한번 선언된 final 변수의 값은 변경할 수 없다,
	}
}