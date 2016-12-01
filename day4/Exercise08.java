import java.util.*;

public class Exercise08 {
	public static void main(String[] args) {
		// 1. 두 주사위의 합이 7이 되면 무인도행.
		// 2. 무인도에 갇힌 경우 같은 숫자 조합일 때만 무인도에서 탈출
		// 3. 무인도에 갇힌 경우 3회 동안 굴렸다면 무인도에서 탈출
		// 4. 무인도에 갇히지 않은 경우에는 주사위의 합 만큼 칸을 이동

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int move = 0;
		int goal = 100;

			
		for(;;) {
			int island = 0; // 0이면 자유, 1이면 무인도
			int count = 3; // 다시 무인도에서 탈출 후 다시 0이여야 하므로 초기화 값
		
			System.out.println("-----------------------------");
			System.out.println("[1]주사위 굴리기      [0]종료");
			System.out.println("-----------------------------");
			System.out.print("선택하세요 >");
			int no = sc.nextInt();
			
			if ((no == 1) && (island == 0)) {			
				int first = random.nextInt(6)+1;
				int second = random.nextInt(6)+1;
				goal -= (first+second);
		
				if((first+second)==7) {
					island = 1;
					System.out.println("\n당신은 무인도에 갇혔습니다.");
					System.out.println("-----------------------------");
					System.out.println("[1]네       [0]아니오(종료)  ");
					System.out.println("-----------------------------");
					System.out.print("무인도를 탈출하시겠습니까? >");
					int no1 = sc.nextInt();
					
					if ((no1 == 1) && (island == 1)) {
						for (; count>=2; count--) {	
							int a = random.nextInt(6)+1;
							int b = random.nextInt(6)+1;

							if (a == b) {
								count = 0;
								no = 1;
								island = 0;
								System.out.println("\n무인도에서 탈출하였습니다!!!");
							} else {
								System.out.println("\n무인도에서 탈출하지 못하였습니다. (남은 대기 수 " + (count-1) + ")" );
								System.out.println("다시 주사위를 던지시겠습니까?");
								System.out.println("-----------------------------");
								System.out.println("[1]네        [0]아니오(종료) ");
								System.out.println("-----------------------------");
								System.out.print("선택하세요 >");
								int no2 = sc.nextInt();
									if ((no2 == 1)&&(island==1)) {
										int c = random.nextInt(6)+1;
										int d = random.nextInt(6)+1;

										if( c==d ) {
											count = 0;
											System.out.println("\n무인도에서 탈출하였습니다!!!");
										} else {
											if( count==2 ) {
												count=0;
												System.out.println("\n무인도 3회턴이 완료되어 무인도에서 탈출하였습니다!!!");
											}
										}
									} else if (count==2) {
										System.out.println("\n무인도에서 탈출하였습니다!!!");
									}	else if (no2 ==0) {
										System.out.println("프로그램을 종료합니다");
										break;
									}
								}
							}
						} else if (no1 == 0) {
							System.out.println("프로그램을 종료합니다");
							break;
						}
					} else if ( goal <= 0 ) { 
						System.out.println("목적지에 도착하였습니다!");
						System.out.println("----------------------------------");
						System.out.println("감사합니다. 프로그램을 종료합니다.");
						System.out.println("----------------------------------");
						break;
					} else if ( no == 0 ) {
						System.out.println("프로그램을 종료합니다");
						break;
					} else {				
					System.out.println("도착지까지 " + goal + "칸 남았습니다.\n");
					}
			} else if ( no == 0 ) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}	
	}
}