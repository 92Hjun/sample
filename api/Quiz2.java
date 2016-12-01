import java.util.StringTokenizer;

public class Quiz2 {	
	public static void main(String[] args) {		
		// 주어진 이메일을 "<"와 ">"을 제거하여 출력하시오
		String text = "<koreaFighting@naver.com>,<kim@hanmail.com>,<kang@naver.com>,<yushin@daum.net>";

		String[] emails = text.split(",");
		// 방법1
		System.out.println("---------방법1---------");
		for(String mail : emails) {
			int index1 = mail.indexOf("<");
			int index2 = mail.indexOf(">");

			String id = text.substring(index1+1, index2);
			System.out.println("아이디: " + id);
		}

		// 방법2
		System.out.println("---------방법2---------");
		for(String mail : emails) {
			mail = mail.substring(1, mail.length()-1);
			System.out.println("아이디: " + mail);
		}

		// 방법3
		System.out.println("---------방법3---------");
		for(String mail : emails) {
			mail = mail.replace("<","").replace(">","");
			System.out.println("아이디: " + mail);
		}
	}
}
