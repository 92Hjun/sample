public class ForDemo6 {
	public static void main(String[] args) {
		
		// 1~100������ ���� ����ϱ�
		// ��, �հ谡 3000�� �Ѿ�� ������ ���ڸ� �˾Ƴ���

		int sum = 0;
		int a = 1;

		for (; a<=100; a++) {
			sum += a;
			if( sum>=3000 ) {
				break;
			}
		}
		System.out.println("3000�� �Ѵ� ������ ���� :" + sum + "\t����Ƚ��:" + a );
	}	
}