package com.sun.study2;

import java.util.Scanner;

public class S2_2_2 {
	public static void main(String[] args) {

		// 학생 수를 입력 받아서 학생 수 만큼 이름을 입력받아서 출력하자
		// a:80,b;90
		// 이름 앞에 숫자 출력시키기
		// 1. 학생 정보입력 2. 학생 정보 출력 3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int c = sc.nextInt();
		int[] num = new int[c];
		String[] names = new String[c];
		int[] kor = new int[c];
		int[] math = new int[c];
		int[] totals = new int[c];
		double[] avgs = new double[c];

		System.out.println("1.학생 정보 입력 2.학생 정보 출력 3. 프로그램 종료");
		while (flag) {
			int select = sc.nextInt();

			if (select == 1) {
				// 학생정보 입력
				System.out.println("학생의 수를 입력하시오");
				int s = sc.nextInt();
				for (int i = 0; i < names.length; i++) {

					num[i] = i + 1;
					System.out.println("학생 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i] + "의 국어점수 입력");
					kor[i] = sc.nextInt();
					System.out.println(names[i] + "의 수학점수 입력");
					math[i] = sc.nextInt();
					totals[i] = math[i] + kor[i];
					System.out.println(totals[i] + "총점수");
					avgs[i] = totals[i] / 2.0;
					System.out.println(avgs[i] + "평균");

				}
			} else if (select == 2) {
				// 학생정보 출력
				System.out.println("번호\t이름\t국어\t수학\t총점");

				for (int i = 0; i < names.length; i++) {
					System.out.println(
							(num[i] + ".") + "\t" + names[i] + "\t" + kor[i] + "\t" + math[i] + "\t" + totals[i]);
				}
			} else {
				System.out.println("프로그램 종료");
				break;

			}
		}
	}
}