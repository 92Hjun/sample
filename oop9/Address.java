public class Address {
	
	private String zipcode;
	private String sido;
	private String gugun;
	private String detail;
	private boolean isExist;

	public Address() {}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}

	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void info() {
		System.out.println("аж    ╪р: " + sido + " " + gugun + " " + detail);
	}
}