import java.util.StringTokenizer;

public class Quiz5 {

	public static void main(String[] args) {

		String[] words = {"새끼", "놈", "년", "병신"};

		String text = "길라임 나쁜 년 우라질년 병신 빨리 내려와";
		
		StringTokenizer st = new StringTokenizer(text);

		// 위에서 나열한 금칙어가 포함되어 있는지 여부 확인하기
		boolean isContains = false;
		
		/* 배열 단위로 여부를 확인할 때
		while( st.hasMoreTokens() ) {
			String token = st.nextToken();
			for(int i=0; i<words.length; i++) {
				if(token.equals(words[i])) {
					isContains = true;
					break;
				}
			}
		}
		*/
		
		// 글자 단위로 여부를 확인할 때
		for ( String w : words ) {
			boolean value = text.contains(w);
			if (value) {
				System.out.println("금칙어: " + w);
				isContains = true;
			}
		}

		if(isContains) {
			System.out.println("금칙어가 포함되어 있습니다.");
		}
	}
}