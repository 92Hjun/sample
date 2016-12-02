import java.util.*;

public class LibraryApp {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();

		while (true) { // ���ѷ���
			System.out.println("----------------------------------------------");
			System.out.println("1. ��� 2. ��ȣ�˻� 3. ����˻� 4. �帣�˻� 0.����");
			System.out.println("----------------------------------------------");

			System.out.println("����>");
			int menu = Integer.parseInt(sc.nextLine());

			try {
				if (menu == 1) {
					Book b = new Book();
					System.out.println("��ȣ�� �Է��ϼ���.");
					b.setNo(Integer.parseInt(sc.nextLine()));
					
					System.out.println("������ �Է��ϼ���.");
					b.setTitle(sc.nextLine());
					
					System.out.println("���ڸ� �Է��ϼ���.");
					b.setAuthor(sc.nextLine());
					
					System.out.println("���ǻ縦 �Է��ϼ���.");
					b.setPublisher(sc.nextLine());
					
					System.out.println("������ �Է��ϼ���.");
					b.setPrice(Integer.parseInt(sc.nextLine()));
					
					System.out.println("�帣�� �Է��ϼ���.");
					b.setGenre(sc.nextLine());
					
					lib.addBook(b);
				} else if (menu == 2) {
					System.out.println("��ȣ�� �Է��ϼ���.");
					lib.findBooksByNo(sc.nextInt());
					
				} else if (menu == 3) {
					System.out.println("������ �Է��ϼ���.");
					lib.findBooksByTitle(sc.nextLine());
				} else if (menu == 4) {
					System.out.println("�帣�� �Է��ϼ���.");
					lib.findBooksByGenre(sc.nextLine());
				} else if (menu == 0) {
					break;
				} else {
					System.out.println("�ùٸ� �޴��� �������ּ���.");
				}
			} catch (LibraryException e) {
				System.out.println("���� ���� ���α׷� ����");
				System.out.println("���� �޼���: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("�˷��������� ������ �߻��Ͽ����ϴ�.");
				System.out.println("�����޼���: " + e.getMessage());
			}
		}
	}
}