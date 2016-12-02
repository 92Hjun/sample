import java.util.*;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		/* 오토박싱
		Integer a = new Integer(10);
		Integer a = (10);
		ArrayList에는 객체만 담을수 있기때문에 
		Integer를 이용하여 정수를 객체로 변환하여 담는다
		이때 위에 있는 오토박싱을 사용하면 numbers.add(new Integer(10));
		라고 적지않고 numbers.add(12); 라고 해도 가능하다.
		*/

		// 기본자료형 값을 저장하는 ArrayList만들기
		// 기본자료형 타입에 대응되는 Wrapper클래스 타입을 ArrayList의 타입으로 지정한다.
		// ArrayList<Integer>, ArrayList<Double>, ...
		
		// 정수를 여러개 저장하는 ArrayList 만들기
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// ArrayList 에 있는 add 메소드를 통해서 값을 저장한다.
		numbers.add(new Integer(12));
		numbers.add(23);	// numbers.add(new Integer(23)); // 오토박싱
		numbers.add(16);	// numbers.add(new Integer(16)); // 오토박싱
		numbers.add(5);		// numbers.add(new Integer(5));  // 오토박싱
			
		/*
			Integer 를 이용하여 객체로 변환된 정수 값을 int 타입으로 변환하려면
			Integer n1 = numbers.get(0);
			int x = n1.intValue();으로 해야하는데
			오토 언박싱을하면 int n1 = numbers.get(0)을 하여도 자동으로
			int 타입으로 변환하여 담긴다.
		*/

		// ArrayList 에 있는 get 메소드를 통해서 값을 출력한다.
		int n1 = numbers.get(0);		// int n1 <- x.intValue() <- Integer x = numbers.get(0)
		int n2 = numbers.get(1);		// int n2 = numbers.get(1).intValue();
		Integer n3 = numbers.get(2);
		Integer n4 = numbers.get(3);

		System.out.println(n1 + "," + n2 + "," + n3 + "," + n4);
		/* 12,23,16,5 */
		
		for (int a : numbers) {
			System.out.println(a);
		}
		/*
			12
			23
			16
			5
		*/


	}
}