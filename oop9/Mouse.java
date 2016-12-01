// 인터페이스 : 명세 = 규약 = 표준 = 스펙 , 추상화 되있으므로 객체 생성 불가
// 모든 마우스 객체가 반드시 구현해야하는 기능을 정의한 것
// 기능에 대한 정의만 존재함.
public interface Mouse {

	void wheel(); // = public abtract void wheel(); 과 같음.

	void click();

	void move();
	
}