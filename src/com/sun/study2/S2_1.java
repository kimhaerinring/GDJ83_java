package com.sun.study2;

import java.util.Scanner;

public class S2_1 {
	public static void main(String[] args) {

		int[] ar = new int[5];
		Scanner sc = new Scanner(System.in);

		// 각 인덱스 번호에 칸에 값을 키보드로 입력받아서 저장하기

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + 1 + "번쩨 값 입력");
			ar[i] = sc.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}

		System.out.println("배열의 크기를 입력 ");
		int l = sc.nextInt();
		int[] nums = new int[l];

	}

}
