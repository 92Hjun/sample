import java.util.StringTokenizer;

public class Quiz5 {

	public static void main(String[] args) {

		String[] words = {"����", "��", "��", "����"};

		String text = "����� ���� �� ������� ���� ���� ������";
		
		StringTokenizer st = new StringTokenizer(text);

		// ������ ������ ��Ģ� ���ԵǾ� �ִ��� ���� Ȯ���ϱ�
		boolean isContains = false;
		
		/* �迭 ������ ���θ� Ȯ���� ��
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
		
		// ���� ������ ���θ� Ȯ���� ��
		for ( String w : words ) {
			boolean value = text.contains(w);
			if (value) {
				System.out.println("��Ģ��: " + w);
				isContains = true;
			}
		}

		if(isContains) {
			System.out.println("��Ģ� ���ԵǾ� �ֽ��ϴ�.");
		}
	}
}