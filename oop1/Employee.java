public class Employee {

	// 인적 정보를 저장하고 그 정보를 출력하는 기능이 구현된 설계도

	// 속성
		// 사원번호, 이름, 전화번호, 소속부서, 직위, 급여

		int no;
		int salary;
		String name;
		String phoneNum;
		String department;
		String level;
			
	//기능
		//연봉을 계산해서 반환하는 메소드
		// 사원의 모든 정보를 출력하는 메소드
		public int salary() {
			return salary * 12;
		}
		public void empInfo() {
			System.out.println("#############사원 정보############# ");
			System.out.println("사원 번호 : " + no );
			System.out.println("이     름 : " + name );
			System.out.println("전화 번호 : " + phoneNum );
			System.out.println("소속 부서 : " + department );
			System.out.println("직     위 : " + level );
			System.out.println("연     봉 : " + salary() + "만원 입니다.");
			System.out.println("###################################");
		}
}