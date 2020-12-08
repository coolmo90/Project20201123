package com.yedam.interfaces;

interface Run {
	public void run();
}

class AutoRun implements Runnable {

	@Override
	public void run() {
		System.out.println("자동실행.");

	}

}

class NewRun implements Runnable {

	@Override
	public void run() {
		System.out.println("새로운실행.");

	}

}

public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();
		runnable = new NewRun();
		runnable.run();

		runnable = new Runnable() {
			// 인터페이스
			@Override
			public void run() {
				System.out.println("익명 실행.");

			}

		};
		runnable.run();

		runnable = () -> System.out.println("또 다른 익명 실행.");

		runnable.run();
	}
}
