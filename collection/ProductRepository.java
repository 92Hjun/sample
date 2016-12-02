import java.util.*;

public class ProductRepository {
	
	ArrayList<Product> db = new ArrayList<Product>();

	// 새로운 상품객체를 전달받아서 5번 라인에서 미리 생성한 ArrayList에 저장하는 메소드
	public void addProduct (Product item) {
		db.add(item);
	}
	// 상품이름을 전달받아서 ArrayList에서 그 상품이름에 해당하는 상품을 찾아서 반환하는 메소드
	public Product findProduct(String name) {
		Product result = null;
		for (Product pro : db) {
			boolean contains = pro.getName().contains(name);
			if (contains) {
				result = pro;
			}
		}
		return result;
	}

	// ArrayList에 저장된 모든 상품정보를 출력하는 메소드
	public void displayProducts() {
		for (Product p : db){
			System.out.printf("상품번호: %d , 상품명: %s\n", p.getNo(), p.getName());
		}

	}
}