import java.util.*;

public class BaseballPaly1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// 임의의 숫자 3개를 저장할 배열
		int[] numbers = new int[3];
		int position = 0;
		for(;;) {
			int number = ran.nextInt(10)+1;
			boolean isExist = false;
			for (int i=0; i<position; i++){
				if (numbers[i] == number) {
					isExist = true;
				}
			}		
			if(!isExist) {
			numbers[position] = number;
			position++;
			}
			if (position == 3) {
			break;
			}
		}
		System.out.println(Arrays.toString(numbers));

		// 사용자가 입력한 답을 저장할 배열
		int[] answer = new int[3];
		boolean isSuccess = false;
		int answerCount = 0;
		
		for (int a=1; a<=10; a++) {

			int strike = 0; // 숫자와 자리수가 같은 때
			int ball = 0; // 숫자는 맞지만 자리수가 다를 때
			int out = 0;
			/*스토리
			숫자 3개를 입력 받고 if 이중문을 이용하여 스트라이크와 볼을 비교하여 1씩 증가.
			자리수가 같고 숫자가 같으면 strike를 증가시킨다.
			자리수가 다르고 숫자가 같으면 ball을 증가시킨다.
			자리수와 숫자가 다르면 아웃.
			*/

			System.out.println("---------------------------------");
			System.out.println("    임의의 수 3개를 입력하세요   ");
			System.out.println("---------------------------------");
			
			for(int i=0; i<3; i++) {
				System.out.print((i+1) + "번째 숫자를 입력하세요 >");
				answer[i] = sc.nextInt();
				if(answer[i]>10) {
					System.out.println("10보다 작은 수를 입력하세요");
					i--;
				}
			}
			for(int x=0; x<3; x++) {
				for(int y=0; y<3; y++) {
					if(answer[x] == numbers[y]) {
						if(x == y) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}			
			System.out.println("입력한 값은 (" + answer[0] + ","+ answer[1] + "," + answer[2] + ")");
			System.out.println("스트라이크 : " + strike);
			System.out.println("볼 : " + ball);
			if (strike == 3) {
				isSuccess = true;
				break;
			}
			answerCount++;
			System.out.println(10-answerCount + "회 남았습니다.");
		}

		if (isSuccess) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
}