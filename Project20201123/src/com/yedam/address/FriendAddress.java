package com.yedam.address;

import java.util.Scanner;

public class FriendAddress {
	// 주소록 생성 프로그램
	public static void main(String[] args) {
		Friend[] friends = new Friend[100]; // null-> [100] 100개공간 생성
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.전화번호검색");
			System.out.println("--------------------------------");
			System.out.println("선택 > ");

			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.print("친구이름:");

				String name = scn.nextLine();
				System.out.print("전화번호:");
				String phone = scn.nextLine();
				Friend frnd = new Friend(name, phone); // 인스턴스 생성
				// frnd 변수
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break; // 한건 입력하고 빠져나와야함 아니면 계속돔
					}
				}

			} else if (selectNo == 2) {
				System.out.print("친구이름:");
				String name = scn.nextLine();
				System.out.print("전화번호:");
				String phone = scn.nextLine();
				System.out.print("학교이름:");
				String univ = scn.nextLine();
				System.out.print("전공정보:");
				String major = scn.nextLine();
				UnivFriend frnd = new UnivFriend(name, phone);
				frnd.setUniv(univ);
				frnd.setMajor(major);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}

			} else if (selectNo == 3) {
				System.out.print("친구이름:");
				String name = scn.nextLine();
				System.out.print("전화번호:");
				String phone = scn.nextLine();
				System.out.print("회사이름:");
				String univ = scn.nextLine();
				System.out.print("전공정보:");
				String major = scn.nextLine();
				CompFriend frnd = new CompFriend(name, phone);
				frnd.setCompany(univ);
				frnd.setDepartment(major);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;
					}
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						friends[i].showFriendInfo();

					}
				}
			} else if (selectNo == 5) {

			} else if (selectNo == 6) {
				break;

			}

		}
		System.out.println("프로그램 종료.");
	} // 메인메소드의 끝부분 end of main()
} // end of class.
// 	//1.친구등록 
//	public static void addFriend() {
//    System.out.println("친구이름:");
//    String name = scn.nextLine();
//    System.out.println("전화번호:");
//    String phone = scn.nextLine();
//    Friend frnd = new Friend(name, phone);
//    for (int i = 0; i < friends.length; i++) {
//       if (friends[i] == null) {
//          friends[i] = frnd;
//          break;
//	
//          //2.학교친구
//	public static void addUnivFriend() {
//	}
//	//3.회사친구
//	public static void addComFriend() {
//	}
//	//4.리스트
//	public static void showFriendList() {
//	}
//	//6.한건조회
//	public static void searchFriend() {
//	}