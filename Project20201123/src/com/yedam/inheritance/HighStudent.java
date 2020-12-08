package com.yedam.inheritance;

public class HighStudent extends Student {//student 상속받는

		String grade;
		public void showGrade() {
			System.out.println(grade + "학년입니다.");
		}
}