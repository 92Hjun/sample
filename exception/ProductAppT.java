import java.io.*;

public class ProductAppT {
	
	// 상품정보 텍스트 한줄을 전달받고
	// 배열로 잘라 Product객체에 담아 반환하는 메소드
	public static Product parseData(String text) {
		Product product = new Product();

		String[] items = text.split(",");		

		product.setName(items[0]);
		product.setMaker(items[1]);
		product.setPrice(Integer.parseInt(items[2]));
		product.setDiscount(Double.parseDouble(items[3]));

		return product;
	}

	public static void main(String[] args) throws Exception{
		Product[] products = new Product[4]; // 4개의 아이템을 담을 배열
		
		BufferedReader reader = new BufferedReader(new FileReader("Product.txt"));

		products[0] = parseData(reader.readLine());
		products[1] = parseData(reader.readLine());
		products[2] = parseData(reader.readLine());
		products[3] = parseData(reader.readLine());

		for(Product p : products) { 
			System.out.printf("%s\t %s\t %d\t %f\n", 
				p.getName(), p.getMaker(), p.getPrice(), p.getDiscount());
		}
	}
}
