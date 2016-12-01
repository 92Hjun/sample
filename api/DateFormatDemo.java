import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormatDemo {

	public static void main(String[] args) {
		
		Date now = new Date(); // Date 타입만 가능
		
		// String pattern = "yyyy.MM.dd hh:mm:ss"; 
		// M이 하나일 경우 한자리
		// M이 두 자리일 경우 두 자리
		// String pattern = "yy년 M월 d일 E요일";
		String pattern = "a H시 m분 s초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		String text = sdf.format(now);
		System.out.println(text);
		
	}
}
