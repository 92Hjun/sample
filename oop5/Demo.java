package kr.co.jhta;

import kr.co.l2.*; // Employee�� �ٸ� ��Ű���� �ִ� Ŭ�����̱� ������ �ҷ�����.
import kr.co.l2.sub.*; // *�� ���� ������ �ƴ� Ŭ�������� �������Ƿ� ���� Ŭ������ �ٽ� import

public class Demo {
	public static void main(String[] args) {
		System.out.println("��Ű�� ���� ���ø����̼�");

		Person p = new Person();
		p.setName("ȫ�浿");
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee(); // ��Ű���� �ٸ� Ŭ�����̱� ������ ��ü ���� ����.
		System.out.println(e);

		Family f = new Family();
		System.out.println(f);
	}
}