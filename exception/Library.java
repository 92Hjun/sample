public class Library {
		
		private Book[] db = new Book[100];
		
		private int position = 0;
		
		public void addBook(Book newbook) throws LibraryException {
			for (Book book : db){
				if (book != null){
					if (book.getNo() == newbook.getNo()) {
						throw new LibraryException("������ å��ȣ�� �����մϴ�.");
					}
				}
			} 
			db[position] = newbook;
			position++;
		}

		public void findBooksByNo(int no) throws LibraryException {
			boolean isExist = false;
			
			for (Book book : db) {
				if (book.getNo() == no) {
					System.out.printf("å ��ȣ: %d, å ����: %s, å ����: %s, å ���ǻ�: %s, å ����: %d, å �帣: %s\n", 
						book.getNo(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getPrice(),book.getGenre());
					isExist = true;
				} 
			}
			if (!isExist) {
				throw new LibraryException("������ å��ȣ�� �������� �ʽ��ϴ�.");
			}
		}

		public void findBooksByTitle(String title) throws LibraryException {
			boolean isExist = false;
			for (Book book : db) {
				boolean contains = book.getTitle().contains(title);
				if (contains) {
					System.out.printf("å ��ȣ: %d, å ����: %s, å ����: %s, å ���ǻ�: %s, å ����: %d, å �帣: %s\n", 
						book.getNo(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getPrice(),book.getGenre());
					isExist = true;
				}
			}
			if (!isExist) {
				throw new LibraryException("������ å������ �������� �ʽ��ϴ�.");
			}
		}
		
		public void findBooksByGenre(String genre) throws LibraryException {
			boolean isExist = false;
			for (Book book : db) {
				boolean equal = book.getGenre().equals(genre);
				if (equal) {
					System.out.printf("å ��ȣ: %d, å ����: %s, å ����: %s, å ���ǻ�: %s, å ����: %d, å �帣: %s\n", 
						book.getNo(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getPrice(),book.getGenre());
					isExist = true;
				}
			}
			if (!isExist) {
				throw new LibraryException("������ �帣�� �������� �ʽ��ϴ�.");
			}
		}
}
