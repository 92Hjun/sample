public class SmartPhone extends Phone {
	
	private String ip;

	public SmartPhone() {}

	public SmartPhone(String telNumber, String company, String ip) { 
		super(telNumber, company);
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void displayInfo() {
		// System.out.println("전화번호: " + getTelNumber());
		// System.out.println("통 신 사: " + getCompany());
		super.displayInfo();
		System.out.println("아 이 파: " + ip);
	}
}