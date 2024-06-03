package com.sum.s1.rang;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// import 생략:
		// 1. 같은 패키지내의 클래스를 사용할 떄
		// 2. Java.lang 내의 클래스를 사용 할 때

		Object obj = new Object();
		Object obj2 = new Object();
		String n = "winter";
		String n2 = "winter";

		// 참조 변수명.멤버변수들
		char ch = n.charAt(0); // int index 문자배열
		System.out.println(ch);

		System.out.println(obj.toString());
		System.out.println(n.toString());
		int l = n.length();
		System.out.println(l);

		System.out.println("문자열 입력");

		n = sc.next();

		for (int i = 0; i < n.length(); i++) {
			ch = n.charAt(i);
			System.out.println(ch);
		}
		System.out.println(n.length() * 1000 + "원입니다.");
	}
}
