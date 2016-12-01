import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateDemo {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 지정하세요(yyyy/MM/dd) >");
		String text = sc.next();

		String[] arr1 = text.split("/");
		int year = Integer.parseInt(arr1[0]);
		int month = Integer.parseInt(arr1[1]);
		int day = Integer.parseInt(arr1[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);	
		
		Date date = cal.getTime(); // 입력된 값을 받는 데이트 객체
		// 캘린더 객체 --> 데이트 객체 넘어감.

		String pattern = "yyyy년 MM월 dd일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		for(int i=1; i<11; i++) {
			cal.add(Calendar.DATE, 100);
			if(i==1) { cal.add(Calendar.DATE, -1); }
			// 100일이 추가되면 캘린더 객체의 100일도 추가
			date = cal.getTime(); 
			String text1 = sdf.format(date);

			// System.out.printf(i*100 +"일 뒤 : %tF%n", cal);
			System.out.println(i*100 +"일 뒤 : " + text1);
		}
	}
}
