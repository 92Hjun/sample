import java.io.*;

public class ProductApp {
	
	// 상품정보 텍스트 한줄을 전달받고
	// 배열로 잘라 Product객체에 담아 반환하는 메소드
	public static Product parseData(String text) {
		String[] arr = text.split(",");
		Product p = new Product();
		p.setName(arr[0]);
		p.setMaker(arr[1]);
		p.setPrice(Integer.parseInt(arr[2]));
		p.setDiscount(Double.parseDouble(arr[3]));
		return p;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader("Product.txt"));
		String text1 = reader.readLine();
		Product p1 = parseData(text1);
		String text2 = reader.readLine();
		Product p2 = parseData(text2);
		String text3 = reader.readLine();
		Product p3 = parseData(text3);
		String text4 = reader.readLine();
		Product p4 = parseData(text4);

		System.out.printf("제품명:%s\t\t\t제조사:%s\t\t가격:%d\t할인률:%f\n", 
						p1.getName(), p1.getMaker(), p1.getPrice(), p1.getDiscount());
		System.out.printf("제품명:%s\t\t제조사:%s\t\t가격:%d\t\t할인률:%f\n", 
						p2.getName(), p2.getMaker(), p2.getPrice(), p2.getDiscount());
		System.out.printf("제품명:%s\t\t\t제조사:%s\t\t가격:%d\t\t할인률:%f\n", 
						p3.getName(), p3.getMaker(), p3.getPrice(), p3.getDiscount());
		System.out.printf("제품명:%s\t\t제조사:%s\t\t가격:%d\t\t할인률:%f\n", 
						p4.getName(), p4.getMaker(), p4.getPrice(), p4.getDiscount());
	}
}