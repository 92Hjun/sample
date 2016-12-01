public class ContactApp {

	public static void main(String[] args) {
		
		Contact c1 = new Contact();
		Contact c2 = new Contact();

		c1.no = 25;
		c1.name = "±«¿≤";
		c1.phoneNum = "010-4864-8648";
		c1.email = "Mr.yuel@hanmail.net";

		c1.no = 29;
		c1.name = "±Ë¿ØΩ≈";
		c1.phoneNum = "010-6644-4865";
		c1.email = "usin22@naver.com";
		
		c1.call();
		c1.sendMessage();
		c1.sendMail();

		c2.call();
		c2.sendMessage();
		c2.sendMail();

		Contact[] contacts = new Contact[10];
		}
	}	
}