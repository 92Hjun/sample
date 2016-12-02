public class Library {
		
		private Book[] db = new Book[100];
		
		private int position = 0;
		
		public void addBook(Book newbook) throws LibraryException {
			for (Book book : db){
				if (book != null){
					if (book.getNo() == newbook.getNo()) {
						throw new LibraryException("동일한 책번호가 존재합니다.");
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
					System.out.printf("책 번호: %d, 책 제목: %s, 책 저자: %s, 책 출판사: %s, 책 가격: %d, 책 장르: %s\n", 
						book.getNo(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getPrice(),book.getGenre());
					isExist = true;
				} 
			}
			if (!isExist) {
				throw new LibraryException("동일한 책번호가 존재하지 않습니다.");
			}
		}

		public void findBooksByTitle(String title) throws LibraryException {
			boolean isExist = false;
			for (Book book : db) {
				boolean contains = book.getTitle().contains(title);
				if (contains) {
					System.out.printf("책 번호: %d, 책 제목: %s, 책 저자: %s, 책 출판사: %s, 책 가격: %d, 책 장르: %s\n", 
						book.getNo(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getPrice(),book.getGenre());
					isExist = true;
				}
			}
			if (!isExist) {
				throw new LibraryException("동일한 책제목이 존재하지 않습니다.");
			}
		}
		
		public void findBooksByGenre(String genre) throws LibraryException {
			boolean isExist = false;
			for (Book book : db) {
				boolean equal = book.getGenre().equals(genre);
				if (equal) {
					System.out.printf("책 번호: %d, 책 제목: %s, 책 저자: %s, 책 출판사: %s, 책 가격: %d, 책 장르: %s\n", 
						book.getNo(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getPrice(),book.getGenre());
					isExist = true;
				}
			}
			if (!isExist) {
				throw new LibraryException("동일한 장르가 존재하지 않습니다.");
			}
		}
}
