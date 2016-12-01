public class Quiz6 {

	public static void main(String[] args) {
		
		/* 
			1.�̸�, �μ�, ����, �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
			(�ʵ� ����, �⺻ ������, getter/setter)

				2. ^�� �������� ���ڿ��� �߶� �迭�� ���

					3.�迭�� ��������� �ϳ��� ������ ��ǥ�� �߶� �迭�� ���
						
						4.Employee ��ü�� ���� ��������� �� �����͸� Employee ��ü�� �����ϱ�

							5.Employee ��ü�� employee �迭�� �����ϱ�
								
								6.Employee �迭�� ����� ���� ����ϱ�
		*/
		
		Employee[] employee = new Employee[4];
		String text = "ȫ�浿,������,����,200&������,������,����,300&������,�ѹ���,�븮,150&�̼���,�ѹ���,����,250";
		String[] arr1 = text.split("&");
		int index = 0;

		for ( String item : arr1 ) {
			String[] arr2 = item.split(",");
			
			Employee emp = new Employee();

			emp.setName(arr2[0]);
			emp.setDept(arr2[1]);
			emp.setLevel(arr2[2]);
			int salary = Integer.parseInt(arr2[3]);
			emp.setSalary(salary);
			
			employee[index++] = emp;
		}

		for ( Employee e : employee ) {
			System.out.println();
			System.out.println("�̸� :" + e.getName());
			System.out.println("�μ� :" + e.getDept());
			System.out.println("���� :" + e.getLevel());
			System.out.println("�޿� :" + e.getSalary());
			System.out.println();
		}
	}
}