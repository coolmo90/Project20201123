package com.yedam.interfaces;

public class Television implements RemoteControl {

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

}
