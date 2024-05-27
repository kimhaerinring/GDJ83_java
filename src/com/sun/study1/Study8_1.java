package com.sun.study1;

import java.util.Scanner;

public class Study8_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tan = 3;
		for (int i = 0; i < tan; i++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			System.out.println(select);
			if (select == 1) {
				for (int j = 0; j < 30; j++) {
					System.out.println(j + 1 + "번 탕");
				}
			} else {
				for (int j = 0; j < 10; j++) {
					System.out.println(j + 1 + "번탕");
				}
			}
		}
	}
}