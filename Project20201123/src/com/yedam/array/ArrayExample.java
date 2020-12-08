package com.yedam.array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {

		int num[] = new int[3];
		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력하세요:");
	

		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i] > num[j] )  {
					
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				} else {
					
					break;
			}
		}
	
	}
		for (int sort : num) {
			System.out.println(sort + " ");
		}
	}
}		
		

//정수 3개를 입력받아 오름차순으로 정렬하는 프로그램 작성
//첫번째 입력 34
//두번째 입력 29
//세번쨰 입력 67