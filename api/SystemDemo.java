import java.util.*;

public class SystemDemo {

	public static void main(String[] args) {
		
		// 현재 시간정보 알아내기
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// 현재 시스템의 사용자 홈 디렉토리 조회하기
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		// 프로그램 종료하기
		// System.exit(0);

		// 배열 복사하기
		String[] src = {"이순신", "강감찬", "김유신", "홍길동", "일지매", "임꺽정"};

		String[] dest = new String[10];
		System.arraycopy(src, 3, dest, 1, 2);
		System.out.println(Arrays.toString(dest));
		
		/*
			System.arraycopy(src, srcPosition, dest, destPosition, length)
			src : 원본 배열
			srcPosition : 원본 배열에서 복사할 항목의 시작 위치
			dest : 새 배열
			destPosition : 새 배열에서 복사할 항목을 붙여넣을 시작 위치
			length : 원본 배열에서 복사할 항목의 갯수

		*/
	}
}