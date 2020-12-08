package com.yedam.interfaces;

public class Audio implements RemoteControl {
	// 구현
	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}

}
