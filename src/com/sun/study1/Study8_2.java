package com.sun.study1;

import java.util.Scanner;

public class Study8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tan = 3;
		for (int i = 0; i < tan; i++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			System.out.println(select);
			int count = 0;
			String sound = "";
			if (select == 1) {
				count = 30;
				sound = "탕";
			} else {
				count = 10;
				sound = "타타탕";
			}
			// for 문

			for (int j = 0; j < count; j++) {
				System.out.println(sound);
			}
		}

	}

}
