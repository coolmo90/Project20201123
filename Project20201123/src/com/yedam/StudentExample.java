package com.yedam;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setAdu("안동대학교");
		s1.setUnumber("20201123");
		s1.setKjm("김정모");
		s1.setMajor("멀티미디어");
		
		System.out.println(s1.getAdu());
		System.out.println(s1.getUnumber());
		System.out.println(s1.getKjm());
		System.out.println(s1.getMajor());
		
		Student s2 = new Student("한양대학교", "20101123");
	
		s2.setKjm("이규민");
		s2.setMajor("경영");
		System.out.println(s2.getAdu());
		System.out.println(s2.getUnumber());
		System.out.println(s2.getKjm());
		System.out.println(s2.getMajor());
		
		
		Student s3 = new Student("금오공대", "20001123","김정훈","신소재");
		System.out.println(s3.getAdu());
		System.out.println(s3.getUnumber());
		System.out.println(s3.getKjm());
		System.out.println(s3.getMajor());
	
		Student[] student = { s1, s2, s3};
	
	
	}
}
