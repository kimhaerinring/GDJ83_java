package com.sum.s1.rang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "computer Science";
		String result = name.substring(3);
		result = name.substring(3, 5);
		System.out.println(result);

		System.out.println("파일명을 입력하세요 확장자 포함");
		name = "abc.ee.pdf"; // sc.next();

		// 확장자만 분리
		// jpg.png,gif ,jpeg,jiff

		int idx = name.lastIndexOf(".");
		result = name.substring(idx + 1);
		System.out.println(result);

		/*
		 * switch(result){ case "png": System.out.println("이미지 파일립니다."); break; case
		 * "jpg":
		 * 
		 * break; }
		 */
		// String[] files = ("jpg.png,gif ,jpeg,jiff");

	}

}
