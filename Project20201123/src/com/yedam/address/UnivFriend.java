package com.yedam.address;

public class UnivFriend extends Friend {
	private String univ;
	private String major;

	public UnivFriend(String name, String phone) {
		super(name, phone);
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	   public void showFriendInfo() {
	      // TODO Auto-generated method stub
	      super.showFriendInfo();  // 여기서 this = comFriend    겟네임 퍼블릭꺼 클래스달라도 가져옴
	                        //
	      System.out.println("이름:" + super.getName() 
	                          + ", 연락처" + super.getPhone() 
	                          +   ", 학교" + this.univ
	                          + ", 전공" + this.major);
	
	}
}
