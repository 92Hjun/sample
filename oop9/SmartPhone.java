public class SmartPhone extends Phone {
	
	private String ip;

	public SmartPhone() { 
		super(); // 않 넣어줘도 들어가 있음.
		System.out.println("SmartPhone() is running");
	}


	public SmartPhone(String tel, String company, String ip) {
		super(); // Phone() 디폴트 생성자로 감.
		// super(tel, company) 는 변수가 있는 추가 생성자로 감.
		this.ip = ip;
		System.out.println("SmartPhone(String, String, String) is running");
	}


	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

}


