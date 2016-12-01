public class Employee {
	
	private String name;
	private String dept;
	private String level;
	private int salary;
	
	Employee() {}

	Employee(String name, String dept, String level, int salary) {
		this.name = name;
		this.dept = dept;
		this.level = name;
		this.salary= salary;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;		
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}