package pro1;

public class Quiz6 {
	
	public static void main(String[] args) {
		
		Employee[] employee = new Employee[4];
		String text = "홍길동,영업팀,과장,200&김유신,판매부,부장,300&강감찬,인사부,대리,150&이순신,총무부,차장,250";
	
		int arrayPosition = 0;
	
		String[] arr1 = text.split("&");
		for ( String num : arr1 ) {
			String[] arr2 = num.split(",");
			System.out.println(arr2[1]);
		}		
	}
}