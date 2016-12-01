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
		System.out.println(result); // 앞의 최상위 비트가 1(음수)에서 0(양수)로 바뀜
	}
}