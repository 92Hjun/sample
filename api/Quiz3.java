public class Quiz3 {
	public static void main(String[] args) {
		// a�� �� ��������, b�� �� ��������, c�� �� �������� ���� ����Ͻÿ�.
		String text = "Every string builder has a capacity. As long as the length of the character sequence ";
		text = text.toLowerCase();
	
		int[] arr = new int[26];
		for(int i=0; i<text.length()-1; i++) {
			int c = text.charAt(i);
			if(c>=97) { // �ҹ��� a�� 97�̹Ƿ� 97���� ����.
				arr[c-97]++; 
			}
		}
		System.out.println("a�� ����:"+arr[0]+"\tb�� ����:"+arr[1]+"\tc�� ����:"+arr[2]);

		System.out.println(java.util.Arrays.toString(arr));

		for( int i=0; i<arr.length; i++ ) {
			System.out.println( (char)(i+97) + ":" + arr[i]);
		}
	}
}