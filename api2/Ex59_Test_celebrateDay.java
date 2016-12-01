import java.util.*;
import java.io.*;

class Ex59_Test_celebrateDay
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = getReader();

		System.out.print("둘이 만난날(ex> 2012-08-01) : ");
		String inputDate = reader.readLine();	// 입력일 얻기
		
		String[] dateArr = inputDate.split("-"); //년,월,일 분할
		int year = Integer.parseInt(dateArr[0]); // 입력 년도
		int month = Integer.parseInt(dateArr[1]); // 입력 월
		int day = Integer.parseInt(dateArr[2]); // 입력 일

		Calendar today = Calendar.getInstance();	//오늘
		Calendar ca = Calendar.getInstance();		//입력일

		//입력일로 세팅
		ca.set(year,month-1,day);

		// 기념일로부터 오늘까지
		long span = today.getTime().getTime() - ca.getTime().getTime();
		System.out.printf("오늘은 둘이 만난 지 %d일 째 되는 날입니다.%n"
						,span/1000/60/60/24+1);//만난 날 포함
		
		// 기념일부터 1일.
		ca.add(Calendar.DATE, 99);	//  100일째 날
		System.out.printf(" 100일 : %tF%n",ca);
		ca.add(Calendar.DATE, 100);	//  200일째 날
		System.out.printf(" 200일 : %tF%n",ca);		
		ca.add(Calendar.DATE, 100);	//  300일째 날
		System.out.printf(" 300일 : %tF%n",ca);
		ca.add(Calendar.DATE, 200);	//  500일째 날
		System.out.printf(" 500일 : %tF%n",ca);
		ca.add(Calendar.DATE, 500);	// 1000일째 날
		System.out.printf("1000일 : %tF%n",ca);
	}//end main

	public static BufferedReader getReader() {
		BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		return reader;
	}
}