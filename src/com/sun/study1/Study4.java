package com.sun.study1;

import java.util.Scanner;

public class Study4 {
	public static void main(String[] args) {
		// 키보드와 연결 준비
		// 한번만 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요"); // 0 이상의 정수를 입력 받음

		int num = sc.nextInt();

		int result = num;
		System.out.println(num);
		System.out.println(result);
		// 0->0
		// 1 -> 1
		// 2->2
		// 3->3
		// 4->10
		// 5-> 11
		//6->12
		// 7->13
		// 8->20
		// 9->21
		// 10->22
		//11->23

		System.out.println("프로그램을 종료합니다");
	}
}
