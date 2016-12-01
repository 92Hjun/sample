import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateDemo {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��¥�� �����ϼ���(yyyy/MM/dd) >");
		String text = sc.next();

		String[] arr1 = text.split("/");
		int year = Integer.parseInt(arr1[0]);
		int month = Integer.parseInt(arr1[1]);
		int day = Integer.parseInt(arr1[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);	
		
		Date date = cal.getTime(); // �Էµ� ���� �޴� ����Ʈ ��ü
		// Ķ���� ��ü --> ����Ʈ ��ü �Ѿ.

		String pattern = "yyyy�� MM�� dd��";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		for(int i=1; i<11; i++) {
			cal.add(Calendar.DATE, 100);
			if(i==1) { cal.add(Calendar.DATE, -1); }
			// 100���� �߰��Ǹ� Ķ���� ��ü�� 100�ϵ� �߰�
			date = cal.getTime(); 
			String text1 = sdf.format(date);

			// System.out.printf(i*100 +"�� �� : %tF%n", cal);
			System.out.println(i*100 +"�� �� : " + text1);
		}
	}
}
