import java.util.*;

public class ArrayListDemo7 {
	public static void main(String[] args){
		
		ArrayList<Product> cart = new ArrayList<Product>();

		cart.add(new Product(23, "연필"));
		cart.add(new Product(12, "공책"));
		cart.add(new Product(17, "색연필"));
		cart.add(new Product(16, "책받침"));
		cart.add(new Product(11, "지우개"));

		// 상품번호 순으로 정렬하기.
		
		//error: no suitable method found for sort(ArrayList<Product>)
		// 하지만 Product 클래스에서 implements Comparable<Product> Compararble을 구현후
		// compareTo() 메소드를 재정의하여서 양수면 오른쪽으로 , 음수면 왼쪽 0 이면 자리교체가 안된다.
		// 그런후 sort를 실행하면 작은번호부터 큰번호 순으로 정렬이된다.

		Collections.sort(cart);

		System.out.println(cart);
	}
}