import java.util.Scanner;

public class ForDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �ܼ��� �Է��ϼ���");
		
		int a = sc.nextInt();

		for (int i = 1; i < 20 ; i++){
			int result = a*i;
			System.out.println( a + " X " + i + " = " + result);
		}
	}	
}