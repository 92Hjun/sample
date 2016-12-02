import java.util.*;

public class LibraryApp {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();

		while (true) { // 무한루프
			System.out.println("----------------------------------------------");
			System.out.println("1. 등록 2. 번호검색 3. 제목검색 4. 장르검색 0.종료");
			System.out.println("----------------------------------------------");

			System.out.println("선택>");
			int menu = Integer.parseInt(sc.nextLine());

			try {
				if (menu == 1) {
					Book b = new Book();
					System.out.println("번호를 입력하세요.");
					b.setNo(Integer.parseInt(sc.nextLine()));
					
					System.out.println("제목을 입력하세요.");
					b.setTitle(sc.nextLine());
					
					System.out.println("저자를 입력하세요.");
					b.setAuthor(sc.nextLine());
					
					System.out.println("출판사를 입력하세요.");
					b.setPublisher(sc.nextLine());
					
					System.out.println("가격을 입력하세요.");
					b.setPrice(Integer.parseInt(sc.nextLine()));
					
					System.out.println("장르를 입력하세요.");
					b.setGenre(sc.nextLine());
					
					lib.addBook(b);
				} else if (menu == 2) {
					System.out.println("번호를 입력하세요.");
					lib.findBooksByNo(sc.nextInt());
					
				} else if (menu == 3) {
					System.out.println("제목을 입력하세요.");
					lib.findBooksByTitle(sc.nextLine());
				} else if (menu == 4) {
					System.out.println("장르를 입력하세요.");
					lib.findBooksByGenre(sc.nextLine());
				} else if (menu == 0) {
					break;
				} else {
					System.out.println("올바른 메뉴를 선택해주세요.");
				}
			} catch (LibraryException e) {
				System.out.println("도서 관리 프로그램 오류");
				System.out.println("오류 메세지: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("알려지지않은 오류가 발생하였습니다.");
				System.out.println("오류메세지: " + e.getMessage());
			}
		}
	}
}