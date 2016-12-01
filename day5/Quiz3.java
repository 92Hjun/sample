import java.util.*;

public class Quiz3 {
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
		//System.out.println(Arrays.toString(numbers));

		// ����ڰ� �Է��� ���� ������ �迭
		int[] answer = new int[3];

		boolean isSuccess = false;
		
		for (int a=1; a<=10; a++) {

			int strike = 0; // ���ڿ� �ڸ����� ���� ��
			int ball = 0; // ���ڴ� ������ �ڸ����� �ٸ� ��
			
			/*���丮
			���� 3���� �Է� �ް� if ���߹��� �̿��Ͽ� ��Ʈ����ũ�� ���� ���Ͽ� 1�� ����.
			�ڸ����� ���� ���ڰ� ������ strike�� ������Ų��.
			�ڸ����� �ٸ��� ���ڰ� ������ ball�� ������Ų��.
			�ڸ����� ���ڰ� �ٸ��� �ƿ�.
			*/
			System.out.println("���ڸ� 3���� �Է����ּ���");
			
			if (strike == 3 {
				isSuccess = true;
				break;
			}
		}

		if (isSuccess) {
			System.out.println("����");
		} else {
			System.out.println("����");
	}
}