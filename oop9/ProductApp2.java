import java.util.Arrays;

public class ProductApp {

	public static void main(String[] args) {
		
		Product[] cart = new Product[5];
		cart[0] = new Product("����", 3000);
		cart[1] = new Product("����", 16000);
		cart[2] = new Product("����", 1000);
		cart[3] = new Product("����", 2000);
		cart[4] = new Product("���찳", 500);

		System.out.println(Arrays.toString(cart));

		//Arrays.sort(cart);
		//Arrays.sort(cart, (a, b) -> b.getPrice() - a.getPrice());


		//for (Product p : cart) {
		//	System.out.println(p.getName() + " " + p.getPrice());
		
	}
}

