package com.ydm.CalendarExample;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		showCal(2020, 10); // 2020년 10월 달력보곱
		//https://hyeonstorage.tistory.com/205
	}

	public static void showCal(int year, int month) {
//		
		String[] strWeek = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		System.out.println("\t"+"\t" + year + "년도 " + month + "월");

		for (String week : strWeek) {
			System.out.print(week + "\t");
		}

//		System.out.println("\t [" + year + "년 " + month + "월]");
//		// 요일 정보 출력
//		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
//		for (int i = 0; i < days.length; i++) {
//			System.out.printf("%4s", days[i]);
//		}
//		System.out.println(); // https://gusfree.tistory.com/233

//		int tMonth = month - 1; // 입력월과 Calendar월 매칭.
//		Calendar cal = Calendar.getInstance();
//		cal.set(year, tMonth, 1);
//		int lDate = cal.getActualMaximum(Calendar.DATE);
//		int fDay = cal.get(Calendar.DAY_OF_WEEK);

//		// 1일의 위치지정
//		for (int i = 1; i < fDay; i++) {
//			System.out.println();
//		
//		       

	}
}

//		System.out.println("년도:" + cal.get(Calendar.YEAR));
//		System.out.println("월:" + cal.get(Calendar.MONTH));
//		System.out.println("일:" + cal.get(Calendar.DATE));
//		System.out.println("요일:" + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("막날:" + cal.getActualMaximum(Calendar.DATE));

// System.out.printf("%3d" , 1);
//		System.out.printf("%3d" , 2);
//		System.out.printf("%3d" , 3);
//		System.out.printf("%3d" , 4);
//		System.out.printf("%3d" , 5);
//		System.out.printf("%3d" , 6);
//		System.out.printf("%3d" , 7);
//		System.out.println();
//		System.out.printf("%3d" , 8);
//		System.out.printf("%3d" , 9);
//		System.out.printf("%4d" , 10);
//		System.out.printf("%3d" , 11);
//		System.out.printf("%3d" , 12);
//		System.out.printf("%3d" , 13);
//		System.out.printf("%3d" , 14);
//		System.out.println();
//		System.out.printf("%4d" , 15);
//		System.out.printf("%3d" , 16);
//		System.out.printf("%3d" , 17);
//		System.out.printf("%3d" , 18);
//		System.out.printf("%3d" , 19);
//		System.out.printf("%3d" , 20);
//		System.out.printf("%3d" , 21);
//		System.out.println();
//		System.out.printf("%4d" , 22);
//		System.out.printf("%3d" , 23);
//		System.out.printf("%3d" , 24);
//		System.out.printf("%3d" , 25);
//		System.out.printf("%3d" , 26);
//		System.out.printf("%3d" , 27);
//		System.out.printf("%3d" , 28);
//		System.out.println();
//		System.out.printf("%4d" , 29);
//		System.out.printf("%3d" , 30);
