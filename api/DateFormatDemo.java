import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormatDemo {

	public static void main(String[] args) {
		
		Date now = new Date(); // Date Ÿ�Ը� ����
		
		// String pattern = "yyyy.MM.dd hh:mm:ss"; 
		// M�� �ϳ��� ��� ���ڸ�
		// M�� �� �ڸ��� ��� �� �ڸ�
		// String pattern = "yy�� M�� d�� E����";
		String pattern = "a H�� m�� s��";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		String text = sdf.format(now);
		System.out.println(text);
		
	}
}
