public class Contact {
	
	private String name;
	private Tel[] tels = new Tel[50];
	private Address address;

	int position = 0;

	public Contact() {}

	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}	

	public String getName( ) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Tel[] getTels() {
		return tels;
	}
	
	public void setTels(Tel[] tels) {
		this.tels = tels;
	}
	
	public void addTels(Tel tel) {
		// tels배열의 적절한 위치에 담기
		// 첫번째는 0번째 배열에 담고 계속~
		tels[position++] = tel;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void getAddressInfo() {
		System.out.println("주    소:" + address.getSido() + " " + address.getGugun() + 
							" " + address.getDetail());
	}
}