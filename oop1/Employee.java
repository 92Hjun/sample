public class Employee {

	// ���� ������ �����ϰ� �� ������ ����ϴ� ����� ������ ���赵

	// �Ӽ�
		// �����ȣ, �̸�, ��ȭ��ȣ, �ҼӺμ�, ����, �޿�

		int no;
		int salary;
		String name;
		String phoneNum;
		String department;
		String level;
			
	//���
		//������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
		// ����� ��� ������ ����ϴ� �޼ҵ�
		public int salary() {
			return salary * 12;
		}
		public void empInfo() {
			System.out.println("#############��� ����############# ");
			System.out.println("��� ��ȣ : " + no );
			System.out.println("��     �� : " + name );
			System.out.println("��ȭ ��ȣ : " + phoneNum );
			System.out.println("�Ҽ� �μ� : " + department );
			System.out.println("��     �� : " + level );
			System.out.println("��     �� : " + salary() + "���� �Դϴ�.");
			System.out.println("###################################");
		}
}