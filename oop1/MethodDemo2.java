public class MethodDemo2 {

	public static void displayGugudan(int dan) {
		
		System.out.println("-------------------------");
		for (int i = 1; i<=9; i++) {
			int result = dan * i; // result ������ �ȿ��� ���ֱ�.
			System.out.printf("%d * %d = %d\n", dan, i, result);
		}
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		displayGugudan(9);

		displayGugudan(19);

	}	
}