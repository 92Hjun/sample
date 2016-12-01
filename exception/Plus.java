public class Plus {

	public static void main (String[] args) {
		try{	
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			int sum = num1 + num2;
			System.out.println(sum);
			// RuntimeException (실행예외)
			// 굳이 try catch 를 하지않아도 되지만 하게되면 프로그램 사용성이 높아진다.
		} catch (NumberFormatException n){
			System.out.println("사용법: java Plus <숫자> <숫자>");
		}
	}
}