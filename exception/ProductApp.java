import java.io.*;

public class ProductApp {
	
	// ��ǰ���� �ؽ�Ʈ ������ ���޹ް�
	// �迭�� �߶� Product��ü�� ��� ��ȯ�ϴ� �޼ҵ�
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

		System.out.printf("��ǰ��:%s\t\t\t������:%s\t\t����:%d\t���η�:%f\n", 
						p1.getName(), p1.getMaker(), p1.getPrice(), p1.getDiscount());
		System.out.printf("��ǰ��:%s\t\t������:%s\t\t����:%d\t\t���η�:%f\n", 
						p2.getName(), p2.getMaker(), p2.getPrice(), p2.getDiscount());
		System.out.printf("��ǰ��:%s\t\t\t������:%s\t\t����:%d\t\t���η�:%f\n", 
						p3.getName(), p3.getMaker(), p3.getPrice(), p3.getDiscount());
		System.out.printf("��ǰ��:%s\t\t������:%s\t\t����:%d\t\t���η�:%f\n", 
						p4.getName(), p4.getMaker(), p4.getPrice(), p4.getDiscount());
	}
}