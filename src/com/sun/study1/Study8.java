package com.sun.study1;

import java.util.Scanner;

public class Study8 {
	public static void main(String[] args) {
		// 이중 for

		// FPS(배그,서든,배필,)
		// 총알(30발,탄장 3개)
		// 점사 3번, 단발1번
		// 1. 단발 2. 점사
		// 탕*30
		// 탕탕탕*10
		Scanner sc = new Scanner(System.in);
		int t = 1;
		String tang = "탕";
		String tt ="탕탕탕";
		for (int u = 1; u < 4; u++) {
			int num = sc.nextInt();
			if (num == 1) {
				for (int i = 1; i < 31; i++) {
					System.out.println(tang);
				}
			}
			if (num == 2) {
				for (int y = 1; y < 11; y++) {
					System.out.println(tt);
				}
			}
		}
	}

}
