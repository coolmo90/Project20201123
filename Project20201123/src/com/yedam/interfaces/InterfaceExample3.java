package com.yedam.interfaces;

interface MyFunctionalInterface {
	public void run(int radius);
}

public class InterfaceExample3 {
	public static void main(String[] args) {
		// 람다식 표현으로
		MyFunctionalInterface mfi = null;
		// 1.화면출력 (원의 넓이를 구하는 기능 구현)
		mfi = (radius) -> {
				double result = Math.PI * radius * radius;
				System.out.println("원의 넓이는 : " + result);
		};
		mfi.run(5);
		// 2.화면출력 (밑변으로 가지는 삼각형의 넓이 구하는 기능 구현)
		mfi = (radius) -> {
			double result = 1.73 / 4 * radius * radius;
			System.out.println("삼각형의 넓이는 : " + result);
		}; 
		mfi.run(5);
		
		// 3.화면출력 (정사각형의 넓이를 구하는 기능 구현)
	}
}
