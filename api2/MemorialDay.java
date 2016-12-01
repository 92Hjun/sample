import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MemorialDay {
	public static void main(String[] args) throws ParseException {

		// cmd로 날짜를 지정해 줄 수 있다.
		System.out.println("args[0] : " + args[0]);
		System.out.println("args[1] : " + args[1]);

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date day = sdf.parse(args[0]);
		long time = day.getTime();
		
		// 밀리세컨드 단위기 때문에 1000을 곱해준다.
		long period = (long) Integer.parseInt(args[1]) * (60*60*24*1000) - 1;

		// 반환된 밀리세컨드 단위를 setTime()으로 넣어 준다.
		day.setTime(time + period);

		System.out.println("[" + args[1] +"]째 되는 날 :" + sdf.format(day));

	}
}
