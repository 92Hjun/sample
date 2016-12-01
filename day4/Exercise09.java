import java.util.*;

public class Exercise09 {
	public static void main(String[] args) {
		// 1. 두 주사위의 합이 7이 되면 무인도행.
		// 2. 무인도에 갇힌 경우 같은 숫자 조합일 때만 무인도에서 탈출
		// 3. 무인도에 갇힌 경우 3회 동안 굴렸다면 무인도에서 탈출
		// 4. 무인도에 갇히지 않은 경우에는 주사위의 합 만큼 칸을 이동

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int distance = 0;
		boolean island = false;  // false이면 자유, true이면 무인도
		int count = 3;
					
		for(;;) {
			System.out.println("-----------------------------");
			System.out.println("[1]주사위 굴리기      [0]종료");
			System.out.println("-----------------------------");

			System.out.print("선택하세요 >");
			int no = sc.nextInt();
			
			if ((no == 1)) {			
				int first = random.nextInt(6)+1;
				int second = random.nextInt(6)+1;
				System.out.printf("(%d, %d)\n", first, second);
		
				if (!island ) { // 무인도에 같혀있지 않은 경우
					if (first+second==7) {
						island = true; // 무인도행
						count = 3; //무인도에 갇히자 마자 3으로 설정해줌
						System.out.println("@@@ 무인도로 가기 @@@");
					} else {
						distance += first + second; // 이동거리 증가
						System.out.println("이동거리: " + distance);
						if (distance > 100)  {
							System.out.println("### 목적지 도착 ###");
							break;
						} 
					}
				} else { // 무인도에 갇혀있는 경우
					if (first == second) { // 주사위 숫자가 같은 경우
						island = false; // 무인도 탈출
						System.out.println("### 무인도 탈출###");
					} else { // 주사위 숫자가 다른 경우
						count--;
						if(count == 0) {
							island = false;
							System.out.println("### 3회를 쉬어 무인도 탈출");
						} else {
							System.out.println("탈출까지 [" + count + "] 회 남았습니다.");
						}
					}
				}
			} else if (no==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}		
	}
}