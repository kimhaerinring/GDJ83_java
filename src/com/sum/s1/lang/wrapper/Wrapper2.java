package com.sum.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// 비번 길이는 최소 6글자 이상
		// 대소문자, 숫자 1개이상 isDigit()
		Scanner sc = new Scanner(System.in);
		System.out.println("pw를 입력");
		String pw = sc.next();
		String result = "최소 1 이상의 대문자가 있어야함";
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) {
				upper = true;
			} else if (Character.isLowerCase(ch)) {
				lower = true;
			} else if (Character.isDigit(ch)) {
				digit = true;
			} else {

			}

		}
		if (upper && lower && digit) {
			System.out.println("통과");
		} else {
			System.out.println("fail");

		}

	}

}
