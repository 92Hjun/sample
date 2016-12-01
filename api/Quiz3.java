public class Quiz3 {
	public static void main(String[] args) {
		// a가 몇 글자인지, b가 몇 글자인지, c가 몇 글자인지 각각 출력하시오.
		String text = "Every string builder has a capacity. As long as the length of the character sequence ";
		text = text.toLowerCase();
	
		int[] arr = new int[26];
		for(int i=0; i<text.length()-1; i++) {
			int c = text.charAt(i);
			if(c>=97) { // 소문자 a가 97이므로 97부터 시작.
				arr[c-97]++; 
			}
		}
		System.out.println("a의 갯수:"+arr[0]+"\tb의 갯수:"+arr[1]+"\tc의 갯수:"+arr[2]);

		System.out.println(java.util.Arrays.toString(arr));

		for( int i=0; i<arr.length; i++ ) {
			System.out.println( (char)(i+97) + ":" + arr[i]);
		}
	}
}