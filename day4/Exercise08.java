import java.util.*;

public class Exercise08 {
	public static void main(String[] args) {
		// 1. �� �ֻ����� ���� 7�� �Ǹ� ���ε���.
		// 2. ���ε��� ���� ��� ���� ���� ������ ���� ���ε����� Ż��
		// 3. ���ε��� ���� ��� 3ȸ ���� ���ȴٸ� ���ε����� Ż��
		// 4. ���ε��� ������ ���� ��쿡�� �ֻ����� �� ��ŭ ĭ�� �̵�

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int move = 0;
		int goal = 100;

			
		for(;;) {
			int island = 0; // 0�̸� ����, 1�̸� ���ε�
			int count = 3; // �ٽ� ���ε����� Ż�� �� �ٽ� 0�̿��� �ϹǷ� �ʱ�ȭ ��
		
			System.out.println("-----------------------------");
			System.out.println("[1]�ֻ��� ������      [0]����");
			System.out.println("-----------------------------");
			System.out.print("�����ϼ��� >");
			int no = sc.nextInt();
			
			if ((no == 1) && (island == 0)) {			
				int first = random.nextInt(6)+1;
				int second = random.nextInt(6)+1;
				goal -= (first+second);
		
				if((first+second)==7) {
					island = 1;
					System.out.println("\n����� ���ε��� �������ϴ�.");
					System.out.println("-----------------------------");
					System.out.println("[1]��       [0]�ƴϿ�(����)  ");
					System.out.println("-----------------------------");
					System.out.print("���ε��� Ż���Ͻðڽ��ϱ�? >");
					int no1 = sc.nextInt();
					
					if ((no1 == 1) && (island == 1)) {
						for (; count>=2; count--) {	
							int a = random.nextInt(6)+1;
							int b = random.nextInt(6)+1;

							if (a == b) {
								count = 0;
								no = 1;
								island = 0;
								System.out.println("\n���ε����� Ż���Ͽ����ϴ�!!!");
							} else {
								System.out.println("\n���ε����� Ż������ ���Ͽ����ϴ�. (���� ��� �� " + (count-1) + ")" );
								System.out.println("�ٽ� �ֻ����� �����ðڽ��ϱ�?");
								System.out.println("-----------------------------");
								System.out.println("[1]��        [0]�ƴϿ�(����) ");
								System.out.println("-----------------------------");
								System.out.print("�����ϼ��� >");
								int no2 = sc.nextInt();
									if ((no2 == 1)&&(island==1)) {
										int c = random.nextInt(6)+1;
										int d = random.nextInt(6)+1;

										if( c==d ) {
											count = 0;
											System.out.println("\n���ε����� Ż���Ͽ����ϴ�!!!");
										} else {
											if( count==2 ) {
												count=0;
												System.out.println("\n���ε� 3ȸ���� �Ϸ�Ǿ� ���ε����� Ż���Ͽ����ϴ�!!!");
											}
										}
									} else if (count==2) {
										System.out.println("\n���ε����� Ż���Ͽ����ϴ�!!!");
									}	else if (no2 ==0) {
										System.out.println("���α׷��� �����մϴ�");
										break;
									}
								}
							}
						} else if (no1 == 0) {
							System.out.println("���α׷��� �����մϴ�");
							break;
						}
					} else if ( goal <= 0 ) { 
						System.out.println("�������� �����Ͽ����ϴ�!");
						System.out.println("----------------------------------");
						System.out.println("�����մϴ�. ���α׷��� �����մϴ�.");
						System.out.println("----------------------------------");
						break;
					} else if ( no == 0 ) {
						System.out.println("���α׷��� �����մϴ�");
						break;
					} else {				
					System.out.println("���������� " + goal + "ĭ ���ҽ��ϴ�.\n");
					}
			} else if ( no == 0 ) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		}	
	}
}