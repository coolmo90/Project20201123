package com.yedam;

public class Student {

//학교,학번,이름,전공
	private String adu;
	private String unumber;
	private String kjm;
	private String major;

	
	
	public Student(String adu, String unumber, String kjm, String major) {
		
		this.adu = adu;
		this.unumber = unumber;
		this.kjm = kjm;
		this.major = major;
	}
		
	public Student() {

	}
	
	public Student(String adu) {
			this.adu = adu;
			
	}
		public Student(String adu, String unumber) {
			this.adu = adu;
			this.unumber = unumber;
		}
	

		
		
		public String getAdu() {
		return adu;
	}

	public void setAdu(String adu) {
		this.adu = adu;
	}

	public String getUnumber() {
		return unumber;
	}

	public void setUnumber(String unumber) {
		this.unumber = unumber;
	}

	public String getKjm() {
		return kjm;
	}

	public void setKjm(String kjm) {
		this.kjm = kjm;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
