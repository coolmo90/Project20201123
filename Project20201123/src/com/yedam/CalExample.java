package com.yedam;

public class CalExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		// c1= 값을담는 변수이름 //인스턴스(새로운객체만들겠다)
		c1.setColor("white"); // 메소드- 반드시 인스턴스(실체)가하나만들어지고 그때 쓸수있는 메소드
// 		c1.plus(3,5); 		 
//		static 이 붙으면 인스턴스안만들고 클래스명에다가 바로 붙혀서 쓸수이음

		int result = Calculator.plus(3, 5);
		System.out.println(Calculator.pi);
		result = Calculator.minus(10, 5);
		System.out.println(result);		
		
		CalExample ce1 = new CalExample();
		result = ce1.sum(3,5);
	}

	public static int sum(int a, int b) {
		return a + b ;
	}
	
}
