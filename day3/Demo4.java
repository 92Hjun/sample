public class Demo4 {
	public static void main(String[] args){
		int a = 4;
		int b = 6;

		int result = a & b;
		System.out.println(result);
		result = a | b;
		System.out.println(result);
		result = a ^ b;
		System.out.println(result);
		result = ~a;
		System.out.println(result+"\n");

		int c = -4;
		result = c >> 2;
		System.out.println(result);
		result = c << 2;
		System.out.println(result);
		result = c >>> 2;
		System.out.println(result); // ���� �ֻ��� ��Ʈ�� 1(����)���� 0(���)�� �ٲ�
	}
}