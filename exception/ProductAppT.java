import java.io.*;

public class ProductAppT {
	
	// ��ǰ���� �ؽ�Ʈ ������ ���޹ް�
	// �迭�� �߶� Product��ü�� ��� ��ȯ�ϴ� �޼ҵ�
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
		Product[] products = new Product[4]; // 4���� �������� ���� �迭
		
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
