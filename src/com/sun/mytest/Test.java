package com.sun.mytest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요");

		String str = sc.nextLine(); // 입력을 String으로 가져온다
		System.out.println("입력한 문자열 : " + str);
		System.out.println("정수를 입력하세요 : ");
		int in = sc.nextInt();
		System.out.println("입력한 정수 : " + in);

		System.out.println("실수를 입력하세요 : ");
		double doublevalue = sc.nextDouble();
		System.out.println("입력한 실수 : " + doublevalue);
	}
}
