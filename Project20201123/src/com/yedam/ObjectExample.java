package com.yedam;
// import java.lang.System; 안해도쓸수있
import java.util.Scanner;

public class ObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello");
//		Scanner scn;
		Object o1 = new Object(); //오브젝트 인스턴스 생성
		//boolean sameOrDiff = o1.equals(new Object());
		boolean sameOrDiff = o1.equals("Hello");
		// equals = o1값이랑 새로만들어진 값이랑 비교하겠다
		System.out.println(sameOrDiff);
		System.out.println(o1.toString());
	}
}
