public class CalculatorApp {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();

		int result1 = c.plus(2, 5, 5);
		System.out.println(result1);

		double result2 = c.plus(2.0, 5.0, 5.0);
		System.out.println(result2);
	}
}