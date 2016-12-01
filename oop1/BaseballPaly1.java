import java.util.*;

public class BaseballPaly1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// ������ ���� 3���� ������ �迭
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

		// ����ڰ� �Է��� ���� ������ �迭
		int[] answer = new int[3];
		boolean isSuccess = false;
		int answerCount = 0;
		
		for (int a=1; a<=10; a++) {

			int strike = 0; // ���ڿ� �ڸ����� ���� ��
			int ball = 0; // ���ڴ� ������ �ڸ����� �ٸ� ��
			int out = 0;
			/*���丮
			���� 3���� �Է� �ް� if ���߹��� �̿��Ͽ� ��Ʈ����ũ�� ���� ���Ͽ� 1�� ����.
			�ڸ����� ���� ���ڰ� ������ strike�� ������Ų��.
			�ڸ����� �ٸ��� ���ڰ� ������ ball�� ������Ų��.
			�ڸ����� ���ڰ� �ٸ��� �ƿ�.
			*/

			System.out.println("---------------------------------");
			System.out.println("    ������ �� 3���� �Է��ϼ���   ");
			System.out.println("---------------------------------");
			
			for(int i=0; i<3; i++) {
				System.out.print((i+1) + "��° ���ڸ� �Է��ϼ��� >");
				answer[i] = sc.nextInt();
				if(answer[i]>10) {
					System.out.println("10���� ���� ���� �Է��ϼ���");
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
			System.out.println("�Է��� ���� (" + answer[0] + ","+ answer[1] + "," + answer[2] + ")");
			System.out.println("��Ʈ����ũ : " + strike);
			System.out.println("�� : " + ball);
			if (strike == 3) {
				isSuccess = true;
				break;
			}
			answerCount++;
			System.out.println(10-answerCount + "ȸ ���ҽ��ϴ�.");
		}

		if (isSuccess) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}