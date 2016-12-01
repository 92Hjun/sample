public class BookApp {
	public static void main(String[] args) {

		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "이것이 자바다", "홍길동", "한빛미디어", 35000, "2010-10-10");
		bookCart[1] = new Book(2, "자바 인 액션", "김유신", "한빛미디어", 36000, "2016-05-10");
		bookCart[2] = new Book(3, "스프링 프레임워크", "강감찬", "한빛미디어", 27000, "2013-01-10");
		bookCart[3] = new Book(4, "스프링 시큐리티", "이순신", "한빛미디어", 26000, "2014-04-10");
		bookCart[4] = new Book(5, "자바 웹 프로그래밍", "권율", "한빛미디어", 33000, "2015-11-23");
		
		
		// 카트에 저장된 모든 책들의 제목을 표시하기
		System.out.println("----저장된 책들의 제목----");
		for ( Book num : bookCart ) {
			System.out.println(num.getTitle());
		}


		// 카트에 저장된 책들의 가격 총합을 표시하기
		System.out.println("----책들의 가격의 총합----");
		int total = 0;
		for ( Book num : bookCart ) {
			total += num.getPrice();
		}
		System.out.println(total);


		//카트에 저장된 책중에서 가장 비싼 가격의 책 제목과 가격을 표시하기
		System.out.println("----가장 비싼 가격의 책 제목과 가격----");
		int maxPrice = 0;
		String maxTitle = null;
		for ( Book num : bookCart ) {
			if( num.getPrice() > maxPrice ) {
				maxPrice = num.getPrice();
				maxTitle = num.getTitle();
			}		
		}
		System.out.printf("가장 비싼 책 : %s  가격 : %d\n", maxTitle, maxPrice);
	}
}