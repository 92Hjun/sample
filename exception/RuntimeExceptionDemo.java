public class RuntimeExceptionDemo {
	public static void main (String[] args) {
		// NullPointerException
		//		���������� ��ü�� �ּҰ� ��� null�� ����Ǿ� �ִ� ���¿��� �Ӽ��̳� ����� ����� ��� �߻��Ѵ�.
		String str = "abc";
		System.out.println(str.length());
		
		String[] names = new String[3];
		names[0] = "ȫ�浿";
		names[1] = "������";
		
		for (String name : names) {
			/*
			if (name != null) {
				System.out.println(name + ", " + name.length());	
			}
			*/
			System.out.println(name == null ? "����" : name);
		}
		// IndexOutofBoundException 
		// �迭�̳� String���� �ε��� ������ ��� ���� ������� �� �߻��Ѵ�.
		String str2 = "abcddddddddd";
		if (str2.length() > 30) {
			System.out.println( str2.substring(1,30) + "...");
		} else {
			System.out.println(str2);
		}
	
		/*
		//ArithmeticException
		//���ڸ� 0���� ������ �߻��Ѵ�.
		System.out.println(23/0);
		*/

		// ClassCastException
		// Ŭ���� Ÿ�� ����ȯ �������� ������ �ִ� ��� �߻��Ѵ�.
		Phone p1 = new SmartPhone();
		FeaturePhone p2 = (FeaturePhone)p1;

		/*
			Exception in thread "main" java.lang.ClassCastException: 
			RuntimeExceptionDemo$SmartPhone cannot be cast to 
			RuntimeExceptionDemo$FeaturePhone
			at RuntimeExceptionDemo.main(RuntimeExceptionDemo.java:38)
		*/
		
	}

	public static class Phone{
	
	}

	public static class SmartPhone extends Phone {
		public void interner() {
			System.out.println("���ͳ�");
		}
	}
	
	public static class FeaturePhone extends Phone {
		public void flip() {
			System.out.print("�������");
		}
	}
}