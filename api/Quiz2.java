import java.util.StringTokenizer;

public class Quiz2 {	
	public static void main(String[] args) {		
		// �־��� �̸����� "<"�� ">"�� �����Ͽ� ����Ͻÿ�
		String text = "<koreaFighting@naver.com>,<kim@hanmail.com>,<kang@naver.com>,<yushin@daum.net>";

		String[] emails = text.split(",");
		// ���1
		System.out.println("---------���1---------");
		for(String mail : emails) {
			int index1 = mail.indexOf("<");
			int index2 = mail.indexOf(">");

			String id = text.substring(index1+1, index2);
			System.out.println("���̵�: " + id);
		}

		// ���2
		System.out.println("---------���2---------");
		for(String mail : emails) {
			mail = mail.substring(1, mail.length()-1);
			System.out.println("���̵�: " + mail);
		}

		// ���3
		System.out.println("---------���3---------");
		for(String mail : emails) {
			mail = mail.replace("<","").replace(">","");
			System.out.println("���̵�: " + mail);
		}
	}
}
