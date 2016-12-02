import java.util.*;

public class ArrayListDemo4 {
		
	public static void main (String[] args) {
		
		// 과목명을 저장하는 ArrayList만들기
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("자바");
		subjects.add("자바스크립트");
		subjects.add("SQL");
		subjects.add("하둡");
		
		// 1번째 방법	subjects.remove("SQL"); 지정한 객체와 일치하는 객체를 찾아서 지우기.
		// 2번째 방법
		subjects.remove(2);	// 저장한 index에 저장된 객체를 지우기.
		
		for (String a : subjects) {
			System.out.println(a);
		}
		
	}
}