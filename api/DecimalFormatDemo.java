import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		
		int number = 123456789;
		
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String text = df.format(number);
		System.out.println(text);


		double rate = 123456789.345;
		
		// 소수점 2자리까지 표현, 3자리는 반올림된다.
		// String pattern2 = "#,###.##";
		
		// #은 빈자리를 채우지 않는다.
		String pattern2 = "#,###.####"; 
		
		// 0은 빈자리를 채운다.
		// String pattern2 = "0,000.0000";
		// 0은 #보다 정밀도가 높다.
		// 몇 번째 자리에서 끝났는지 표시해주기 때문이다.
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);
		System.out.println(text2);
	}
}

/* 
	기념일 계산기 100일, 1주년, 1000일
	임의의 날짜를 만들고
	Calrendar API를 뒤져서 찾아내라
*/