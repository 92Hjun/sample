import java.util.*;

public class Exercise09 {
	public static void main(String[] args) {
		// 1. �� �ֻ����� ���� 7�� �Ǹ� ���ε���.
		// 2. ���ε��� ���� ��� ���� ���� ������ ���� ���ε����� Ż��
		// 3. ���ε��� ���� ��� 3ȸ ���� ���ȴٸ� ���ε����� Ż��
		// 4. ���ε��� ������ ���� ��쿡�� �ֻ����� �� ��ŭ ĭ�� �̵�

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int distance = 0;
		boolean island = false;  // false�̸� ����, true�̸� ���ε�
		int count = 3;
					
		for(;;) {
			System.out.println("-----------------------------");
			System.out.println("[1]�ֻ��� ������      [0]����");
			System.out.println("-----------------------------");

			System.out.print("�����ϼ��� >");
			int no = sc.nextInt();
			
			if ((no == 1)) {			
				int first = random.nextInt(6)+1;
				int second = random.nextInt(6)+1;
				System.out.printf("(%d, %d)\n", first, second);
		
				if (!island ) { // ���ε��� �������� ���� ���
					if (first+second==7) {
						island = true; // ���ε���
						count = 3; //���ε��� ������ ���� 3���� ��������
						System.out.println("@@@ ���ε��� ���� @@@");
					} else {
						distance += first + second; // �̵��Ÿ� ����
						System.out.println("�̵��Ÿ�: " + distance);
						if (distance > 100)  {
							System.out.println("### ������ ���� ###");
							break;
						} 
					}
				} else { // ���ε��� �����ִ� ���
					if (first == second) { // �ֻ��� ���ڰ� ���� ���
						island = false; // ���ε� Ż��
						System.out.println("### ���ε� Ż��###");
					} else { // �ֻ��� ���ڰ� �ٸ� ���
						count--;
						if(count == 0) {
							island = false;
							System.out.println("### 3ȸ�� ���� ���ε� Ż��");
						} else {
							System.out.println("Ż����� [" + count + "] ȸ ���ҽ��ϴ�.");
						}
					}
				}
			} else if (no==0) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		}		
	}
}