/*속성
	상품 번호, 상품명, 가격, 할인율(실수)할인은 10%, 판매여부, 제조사

  생성자
	기본생성자, 매개변수 있는 생성자
	
  기능
	할인된 가격을 반환하는 메소드(정수로 리턴)
	상품정보를 모두 출력하는 메소드(할인가 포함)
	
*/
public class Product {

	int productNum;
	String productName;
	int price;
	double saleRate;
	boolean sold;
	String productor;

	public Product(){
		productNum = 0;
		productName = "";
		price = 0;
		saleRate = 0.0;
		sold = false;
		productor = "";
	}

	public Product(int pro, String na, int pri, double rat, boolean t, String tor) {
		productNum = pro;
		productName = na;
		price = pri;
		saleRate = rat;
		sold = t;
		productor = tor;
	}

	public double salePrice() {
		double salePrice = 0;
		salePrice = (int) (price - (price/100)*saleRate);
		return salePrice;
	}

	public void info() {
		System.out.println("----------제품 정보-----------");
		System.out.println("  제품  번호  : " + productNum);
		System.out.println("  제품  이름  : " + productName);
		System.out.println("  제품  가격  : " + price);
		System.out.println(" 제품할인가격 : " + price*salePrice());
		System.out.println("  제품  할인  : " + saleRate);
		System.out.println("  제품  현황  : " + sold);
		System.out.println("   제 조 사   : " + productor);
	}
}