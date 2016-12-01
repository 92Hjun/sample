import java.util.*;

public class Quiz3 {
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
		//System.out.println(Arrays.toString(numbers));

		// 사용자가 입력한 답을 저장할 배열
		int[] answer = new int[3];

		boolean isSuccess = false;
		
		for (int a=1; a<=10; a++) {

			int strike = 0; // 숫자와 자리수가 같은 때
			int ball = 0; // 숫자는 맞지만 자리수가 다를 때
			
			/*스토리
			숫자 3개를 입력 받고 if 이중문을 이용하여 스트라이크와 볼을 비교하여 1씩 증가.
			자리수가 같고 숫자가 같으면 strike를 증가시킨다.
			자리수가 다르고 숫자가 같으면 ball을 증가시킨다.
			자리수와 숫자가 다르면 아웃.
			*/
			System.out.println("숫자를 3개를 입력해주세요");
			
			if (strike == 3 {
				isSuccess = true;
				break;
			}
		}

		if (isSuccess) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
	}
}