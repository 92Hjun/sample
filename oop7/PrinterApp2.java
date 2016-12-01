public class PrinterApp2 {

	public static void main(String[] args) {
		
		Printer p1 = new Printer();
		Printer p2 = new ColorPrinter();
		Printer p3 = new PhotoPrinter();
		
		/*
		아래의 수행문은 모두 print(String text)를 호출한다.
		하지만, 실행 결과는 각각 다르게 발현된다.

		prit(String text)를 실행했지만,
		실제로 생성한 객체에 Printer의 print(String text) 메소드를
		재정의한 메소드가 존재하면, Printer의 print(String text) 메소드 대신
		재정의된 그 메소드가 실행된다.

		따라서, print(String text)라는 일관된 이름(사용법으로)으로
		실제 생성된 객체의 재정의된 기능을 수행시킬 수 있다.
		*/
		p1.print("공지 사항...");
		p2.print("매출 현황...");
		p3.print("여행 사진...");
		
	}
}