package com.yedam.inheritance;

public class Child extends Parent {
	static String field2;
	
	public Child() {
			super(field2);
	}
	
	public Child(String field1, String field2) {
		super(field1); //부모클래스 의미 parent클래스의 생성자를 호출
		this.field2 = field2;
	}
	public void method2() {
		super.method1();
		System.out.println("method2() 호출.");
	}
}
