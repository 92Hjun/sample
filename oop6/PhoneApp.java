public class PhoneApp {
	public static void main(String[] args){
		
		SmartPhone p = new SmartPhone();

		p.telNumber = "010-1234-5678";
		p.call("010-2222-5555");
		p.message("010-2222-2222","���� ��ÿ� ������?");
		System.out.println();

		
		p.ip = "201.11.123.152";
		p.email = "hong@gmail.com";
		p.web("http://www.daum.net");
		p.sendEmail("lee@gmail.com","������","�ָ� �ڵ� �����Դϴ�.");
		System.out.println();

		FeaturePhone f = new FeaturePhone();
		f.telNumber = "010-1122-3344";
		f.call("010-1111-2522");
		f.message("010-1111-2522","7�ÿ� �������� �տ��� ����.");
		f.keypad();


	}
}