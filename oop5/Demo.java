package kr.co.jhta;

import kr.co.l2.*; // Employee가 다른 패키지에 있는 클래스이기 때문에 불러와줌.
import kr.co.l2.sub.*; // *는 하위 폴더가 아닌 클래스만을 가져오므로 하위 클래스를 다시 import

public class Demo {
	public static void main(String[] args) {
		System.out.println("패키지 데모 애플리케이션");

		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee(); // 패키지가 다른 클래스이기 때문에 객체 생성 못함.
		System.out.println(e);

		Family f = new Family();
		System.out.println(f);
	}
}