public class EmployeeApp {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.no = 1;
		emp1.name = "ȫ�浿"; 
		emp1.phoneNum = "010 - 1234- 5678";
		emp1.department = "������";
		emp1.level = "����";
		emp1.salary = 100;

		int annualSalary = emp1.salary();
		
		System.out.println("��     �� : " + annualSalary);
		emp1.empInfo();
	}	
}