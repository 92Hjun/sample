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

	// Object�� toString()�� �������ϱ�.
	
	public String toString() {
		return "Product[no="+no+"], name=["+name+"]";
	}
	
	// hashCode �޼ҵ带 ��ȯ���� ProductŬ������ ��ȣ�� ������
	public int hashCode () {
		return this.no;
	}
	// equals �޼ҵ��� ������
	public boolean equals(Object obj) {
		// ������Ʈ �� �޾Ƽ� null�� ���� ���ϰ��� false��
		if (obj == null) {
			return false;
		}
		// �ҷ��� ������Ʈ�� �ڱ��ڽ�(��ü)�� ������ ���ϰ��� true��
		if (this == obj) {
			return true;
		}
		// �ڱ� �ڽ��� ���� ���赵 ������ �ҷ��� ������Ʈ�� ���赵�� ���������� false
		if (getClass() != obj.getClass()){
			return false;
		}
		// ������Ʈ�� Product Ÿ������ ����ȯ���� Product Ÿ���� other ������ ��´�.
		Product other = (Product) obj;
		// �ڽ��� no�� Product�� no�� ���������� false
		if (no != other.no) {
			return false;
		}
		return true;
	}
}