public class ArrayDemo5 {
	public static void main(String[] args) {
		String[][] names = {{"홍길동", "김유신"}, {"강감찬", "이순신", "권률"},{"을지문덕"}};

		// 배열의 크기
		System.out.println("배열의 크기 : " + names.length); // 행의 길이가 출력. 배열의 번호 + 1
		// 0번째 배열의 크기
		System.out.println("0번째 배열의 크기: " + names[0].length); // 1행의 길이가 출력
		// 1번째 배열의 크기
		System.out.println("1번째 배열의 크기: " + names[1].length); // 2행의 길이가 출력
		// 2번째 배열의 크기
		System.out.println("2번째 배열의 크기: " + names[2].length); // 3행의 길이가 출력

		for (int i=0; i<names.length; i++) { // 행 실행
			
			for (int j=0; j<names[i].length; j++) { // 열 실행
				System.out.println(names[i][j]); 
			}
			System.out.println();
		}
	}	
}