package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
	 Audio audio = new Audio();
	 Television tv = new Television();
	 
//	 audio.turnOn();
//	 audio.turnOff();
//	 
//	 tv.turnOn();
//	 tv.turnOff();
	 
	 RemoteControl rc = audio;
	 rc.trunOn();
	 rc.trunOff();
	 
	 rc = tv;
	 rc.trunOn();
	 rc.trunOff();
	}
}
