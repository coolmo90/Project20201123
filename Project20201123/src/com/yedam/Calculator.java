package com.yedam;

public class Calculator {
	private String color;
	static double pi = 3.14;
	public void setColor(String color) {
		this.color = color;
	}

	public static int plus(int a, int b) { // int 타입의 plus 메소드
		return a + b;
	}	
	public static int minus(int a, int b) {
		return a - b;
	}
	

}
