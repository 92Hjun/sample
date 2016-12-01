public class ProductApp {
	public static void main(String[] args) {

		// 상품 5개를 담는 배열 정의하기
		Product[] products = new Product[5];

		// 배열에 상품 5개 저장하기
		products[0] = new Product(1, "초코 우유", 9000, 10, false, "남양");
		products[1] = new Product(2, "바나나 우유", 12000, 7, true, "서울우유");
		products[2] = new Product(3, "저지방 건강 우유", 11000, 3, false, "건국");
		products[3] = new Product(4, "스누피 딸기 우유", 10000, 15, false, "GS_PB");
		products[4] = new Product(5, "멜론 우유", 8500, 10, false, "롯대");

		// 배열에 저장된 상품 중에서 판매 중인 상품만 표시하기
		System.out.println("--------현재 판매 중--------");
		for ( Product s : products ) {
			if(s.sold == true){
				System.out.println(s.productName);
			}
		}

		// 배열에 저장된 상품중에서 가격이 10000원 이상인 상품만 표시하기
		System.out.println("--------10,000원 이상인 상품 목록--------");
		for ( Product p : products ) {
			if(p.price >= 10000) {
				System.out.println(p.productName);
			}
		}

		//배열에 저장된 상품의 전체가격을 표시하기
		System.out.println("--------상품의 가격 목록--------");
		for ( Product p : products ) {
			System.out.printf("%s\t 정가 : %4d\t  할인가 : %4d \n", p.productName,p.price,Math.round(p.salePrice()));
		}
	}	
}