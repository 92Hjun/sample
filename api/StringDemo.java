public class StringDemo {
	
	public static void main(String[] args){

		/*
			String Ŭ����
				String Ŭ������ ���ڿ��� ǥ���Ѵ�.
				String���� �Һ����̴�. �ѹ� ������� ���Ŀ��� ������ �� ����.
				String�� ��ü�� �����ϴ� Ư���� ����� �����Ѵ�.
					String str = new String("abc"); // �����ڸ� �̿��� String ��ü ����
					String str = "abc"; 			// ���ڿ� ǥ������ �̿��� String��ü ����
					�Ʒ����� ������ ������ ���� ���̵� ��ü�� ������ �� �ִ� ������ Ŭ�����̴�.
				
				Employee emp = new Employee();
				emp.setNo(12);

				Radom ran = new Random();
				ran.nextInt();

				String str = new String("abc");
				str.toUpperCase(); ��
				"abc".toUpperCase(); �� ����.
		*/
		String str = "�ڹ� ���α׷��� ����";
		
		// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� : int length()
		int len = str.length();
		System.out.println("���ڿ��� ���� : " + len);
		// �ֹε������ ���� ���ڼ��� ������ �ʿ��� ���� ����� �� �ִ�.
		// Ʈ����, ���̽��� �� ���ڼ� ������ �� ���� ����� �� �ִ�.


		// ���ڿ��� ����ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�: boolean isEmpty();
		// ���ڿ��� ���̰� 0�̸� true�� ��ȯ�ϴ� �޼ҵ��̴�.
		boolean empty = str.isEmpty(); // ���� ���Ǵ� �޼ҵ�.
		System.out.println("�� ���ڿ��ΰ�? " + empty);
		// �ݵ�� �Է��ؾ��ϴ� �ʼ����� ���� �Է��ϴ� ���� ���ȴ�.



		
		
		// ���ڿ����� �ǹ̾��� ������ ������ ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String trim();
		String str2 = "     ȫ   �� ��     ";
		String str3 = str2.trim();
		System.out.println("str2:["+str2+"]");
		System.out.println("str3:["+str3+"]");

		
		// ���ڿ��� ������ ���� ������ ������ ���� 
		// ���ڿ����� ���θ� ��ȯ�ϴ� �޼ҵ� : boolean equals(Object str)
		String str4 = "����";
		String str5 = "����";
		boolean equal1 = str4.equals(str5);
		System.out.println("������ ���ڿ��ΰ�? " + equal1);
		
		String str6 = "apple";
		String str7 = "Apple";
		boolean equal2 = str6.equalsIgnoreCase(str7);
		System.out.println("��ҹ��� ���� ���� ������ �� ������ ���ڿ��ΰ�? " + equal2);
		
		
		// �ش� ���ڿ��� ������ ���ڿ��� �����ϰ� �ִ����� ���θ� ��ȯ�ϴ� �޼ҵ� : boolean contains(String s)
		String str8 = "�ڹ� ���α׷��� - �ڹ� ���� �� ����";
		boolean contains = str8.contains("�ڹ�");
		System.out.println("[�ڹ�]��� ���ڿ��� �����ϰ� �ִ°�? " + contains);

		
		// ���ڿ����� ������ ��ġ�� ����(char)�� ��ȯ�ϴ� �޼ҵ� : char charAt(int index)
		char ch = str8.charAt(1);
		System.out.println("1��° ���ڴ�? " + ch);


		// ���ڿ����� ������ ���ڿ��� ó������ �����ϴ� ��ġ�� ��ȯ�ϴ� �޼ҵ� : int indexOf(String str)
		// String str8 = "�ڹ� ���α׷���";
		int index = str8.indexOf("��");
		System.out.println("���ڿ����� [��]��� ���ڰ� ó������ �����ϴ� ��ġ��? : " + index);


		// ���ڿ��� ������ ������ ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String replace(String str, String str)
		String str9 = str8.replace("�ڹ�", "���̽�");
		System.out.println("str8 : [" + str8 + "]");	// str8�� ������ �� �����Ƿ�
		System.out.println("str9 : [" + str9 + "]");	// str8�� ������ str9�� ���� �����.


		// ���ڿ����� ������ ��ġ���� ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String str11 = str10.substring(5);
		System.out.println("5��°���� �߶� ���ڿ� : " + str11);


		// ���ڿ����� ������ ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int begin(inclusive), int end(exclusive))
		// ������ġ�� ���Եǰ�, ����ġ�� ���Ե��� �ʴ´�.
		// String str10 = "abcedfghijklmn";
		String sub2 = str10.substring(0, 4);
		System.out.println("0������ 4�� �ձ��� �߶�� ���ڿ� : " + sub2);

		String name = "ȫų��";
		String familyName = name.substring(0, 1);
		System.out.println("��: " + familyName);
		
		//----------------------------------------------------------------------------------------------//
		// ���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ� : String[] split(String delim)
		String text = "����,���,��õ,����,�λ�,����,���,�뱸";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[1]);


		// ���ڿ��� �ҹ��� �Ǵ� �빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		// String toUpperCase(), String toLowerCase()
		String str13 = "sony";
		String str14 = str13.toUpperCase();
		System.out.println("str13:["+str13+"]");
		System.out.println("str14:["+str14+"]");


		// ����, �Ǽ�, �Ҹ���, ��Ÿ ���� ������ ������ ���ڿ��� ��ȯ�� ��ȯ�Ѵ�.
		// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234; // ���� 1234��
		String str15 = String.valueOf(number); // ���ڿ� "1234"�� ��ȯ�� ��ȯ�Ѵ�.
		System.out.println(str15); // ���ڿ��� ��ȯ�� 1234�� ����Ѵ�.
		System.out.println("���� �ڸ���: " + str15.substring(str15.length()-1));

		String str16 = 1234+""; // ���ڿ��� �ڵ���ȯ


	
	}
}