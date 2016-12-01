import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MemorialDay {
	public static void main(String[] args) throws ParseException {

		// cmd�� ��¥�� ������ �� �� �ִ�.
		System.out.println("args[0] : " + args[0]);
		System.out.println("args[1] : " + args[1]);

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date day = sdf.parse(args[0]);
		long time = day.getTime();
		
		// �и������� ������ ������ 1000�� �����ش�.
		long period = (long) Integer.parseInt(args[1]) * (60*60*24*1000) - 1;

		// ��ȯ�� �и������� ������ setTime()���� �־� �ش�.
		day.setTime(time + period);

		System.out.println("[" + args[1] +"]° �Ǵ� �� :" + sdf.format(day));

	}
}
