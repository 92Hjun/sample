public class Plus {

	public static void main (String[] args) {
		try{	
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			int sum = num1 + num2;
			System.out.println(sum);
			// RuntimeException (���࿹��)
			// ���� try catch �� �����ʾƵ� ������ �ϰԵǸ� ���α׷� ��뼺�� ��������.
		} catch (NumberFormatException n){
			System.out.println("����: java Plus <����> <����>");
		}
	}
}