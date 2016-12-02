public class Product {
	private int no;
	private String name;

	public Product() {}

	public Product (int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo () {
		return no;
	}
	public void setNo (int no){
		this.no = no;
	}

	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}

	// Object의 toString()을 재정의하기.
	
	public String toString() {
		return "Product[no="+no+"], name=["+name+"]";
	}
	
	// hashCode 메소드를 반환값을 Product클래스의 번호로 재정의
	public int hashCode () {
		return this.no;
	}
	// equals 메소드의 재정의
	public boolean equals(Object obj) {
		// 오브젝트 를 받아서 null이 들어가면 리턴값이 false로
		if (obj == null) {
			return false;
		}
		// 불러온 오브젝트와 자기자신(객체)가 같으면 리턴값이 true로
		if (this == obj) {
			return true;
		}
		// 자기 자신을 만든 설계도 정보와 불러온 오브젝트의 설계도가 같지않으면 false
		if (getClass() != obj.getClass()){
			return false;
		}
		// 오브젝트를 Product 타입으로 형변환한후 Product 타입의 other 변수에 담는다.
		Product other = (Product) obj;
		// 자신의 no와 Product의 no가 같지않으면 false
		if (no != other.no) {
			return false;
		}
		return true;
	}
}