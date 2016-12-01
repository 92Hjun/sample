public class EmployeeApp {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.no = 1;
		emp1.name = "홍길동"; 
		emp1.phoneNum = "010 - 1234- 5678";
		emp1.department = "영업부";
		emp1.level = "과장";
		emp1.salary = 100;

		int annualSalary = emp1.salary();
		
		System.out.println("연     봉 : " + annualSalary);
		emp1.empInfo();
	}	
}