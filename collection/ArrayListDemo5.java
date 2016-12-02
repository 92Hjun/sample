import java.util.*;

public class ArrayListDemo5 {
		
		public static void main (String[] args) {
		ArrayList<Product> cart = new ArrayList<Product>();
		Product p1 = new Product(1, "책");
		Product p2 = new Product(2, "연필");
		Product p3 = new Product(3, "색종이");
		Product p4 = new Product(4, "크레파스");

		cart.add(p1);
		cart.add(new Product(5, "지우개"));
		cart.add(p2);
		cart.add(p3);
		cart.add(p4);
		cart.add(new Product(6, "북마커"));

		// ArrayList에 저장된 객체중에서 연필 상품 지우기

		// ArrayList에 저장된 객체중에서 [상품번호 = 5, 상품명= 지우개] 찾아서 지우기.
		Product p = new Product(5,"지우개");
		cart.remove(p);

		
		// ArrayList 의 add의 값을넣어서 출력하면 
		// 객체의 참조값이 출력되는데 모든객체들이 Object를 상속받아 만든것이기때문에
		// Object안에 toString을 Product에 재정의 하여주면
		// 바로 객체안의 값을 바로 출력할수있다.
		// 그래서 toString을 재정의하여 출력을하면 간단한 정보를 빨리확인할수있어 편하다.
		
		/*
		[Product[no=12], name=[책], Product[no=23], name=[연필], Product[no=32], 
		name=[색종이], Product[no=43], name=[크레파스], Product[no=52], 
		name=[북마커], Product[no=61], name=[지우개]]
		*/
		
		// 자바에서 동일한 객체란?  해시코드값과 equals결과값이 true가 나와야 동일하다.

		System.out.println(cart);


		}
}