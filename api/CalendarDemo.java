import java.util.Date;
import java.util.Calendar;

public class CalendarDemo {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		long nowTime = now.getTimeInMillis();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;		// MONTH는 0부터 시작
		int day = now.get(Calendar.DAY_OF_MONTH);

		System.out.printf("%d년 %d월 %d일\n", year, month, day);

		Calendar birth = Calendar.getInstance();
		birth.set(1992, 2, 5);						
		long birthTime = birth.getTimeInMillis();	// .getTimeInMillis
		// System.out.println(birth);

		// 특정한 날짜에 대한 날짜 정보를 얻음 
		long lifeTime = (nowTime - birthTime)/1000;
		System.out.println("초: "+lifeTime);
		System.out.println("분: "+lifeTime/60);
		System.out.println("시간: "+lifeTime/(60*60));
		System.out.println("일: "+lifeTime/(60*60*24));
		System.out.println("년: "+(double)lifeTime/(60*60*24*365));

		Date date = birth.getTime();
		System.out.println(date);
	}
}