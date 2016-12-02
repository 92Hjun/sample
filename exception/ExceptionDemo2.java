import java.io.*;

public class ExceptionDemo2 {

	// reading()은 자신이 사용하는 실행문에서 발생하는 예외를 처리하지 않고
	// 대신 발생이 예상되는 예외를 throws 통해 다시 던져버린다.
	public static void reading() throws FileNotFoundException, IOException{

		// reading()을 실행하는 곳에서 예외를 처리하라고 다시 던진다는 것을 의미.
		// FileNotException을 던지는 생성자
		BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));

		// IOException을 던지는 메소드
		String text = reader.readLine();
		System.out.println("파일 내용: " + text);
	}

	// main()메소드는 reading()메소드가 던지는 예외에 대한 처리를 구현하고 있다.
	// reading()메소드는 자신을 사용하는 main()에게 예외처리의 책임을 떠넘겼다.
	public static void main(String[] args) {
		try {
			ExceptionDemo2.reading();
			// reading()을 사용하는 곳에서 예외 처리를 해주어야 한다.

		} catch (FileNotFoundException e1) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e2) {
			System.out.println("파일을 읽는 중 오류가 발생했습니다.");
		}
	}
}