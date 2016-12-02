import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException; // 먼저 import를 해준다.
import java.io.IOException;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
		// FileNotFoundException을 던지는 생성자
		BufferedReader reader = new BufferedReader(new FileReader("ㅁㅁㅁㅁ.txt"));

		// IOException을 던지는 메소드
		String text = reader.readLine();
		System.out.println("파일 내용: " + text);

		} catch (FileNotFoundException fnfe) {
			System.out.println("예외 발생!!!!!");
			System.out.println("예외객체: " + fnfe);
			fnfe.printStackTrace(); // 오류를 추적할 수 있는 정보를 화면에 출력하는 메소드

			// 예외 처리 코드 작성
			// 1. 사용자 친화적인 에러 메세지를 표시한다.
			System.out.println("파일을 찾을 수 없습니다. 경로 및 파일 이름을 확인하세요");

		} catch (IOException ioe) { // catch를 중복해서 예외 처리를 할 수 있다.
			
			// IOException은 파일은 있지만 읽어올 때 오류가 발생하는 경우 생긴다.
			System.out.println("파일을 읽어오는 도중 오류가 발생하였습니다");
			System.out.println("접속 상태를 확인하세요");
		}
	} // catch는 사용자가 어떠한 오류가 나는지 알려주는 사용자 친화적인 메세지를 알려준다.
}
