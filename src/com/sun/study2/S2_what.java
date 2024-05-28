package com.sun.study2;

import java.util.Scanner;

public class S2_what {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int[] num = null;
		String[] names = null;
		int[] kor = null;
		int[] math = null;
		int[] eng = null;
		int[] totals = null;
		double[] avgs = null;

		while (flag) {
			System.out.println("1.학생 정보 입력 2.학생 정보 출력  3. 학생 정보 검색 4. 성적순 출력 5. 프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생의 수를 입력하시오");
				int c = sc.nextInt();

				num = new int[c];
				names = new String[c];
				kor = new int[c];
				math = new int[c];
				eng = new int[c];
				totals = new int[c];
				avgs = new double[c];

				for (int i = 0; i < names.length; i++) {

					num[i] = i + 1;
					System.out.println("학생 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i] + "의 국어점수 입력");
					kor[i] = sc.nextInt();
					System.out.println(names[i] + "의 수학점수 입력");
					math[i] = sc.nextInt();
					System.out.println(names[i] + "의 영어점수 입력");
					eng[i] = sc.nextInt();
					totals[i] = math[i] + kor[i] + eng[i];
					System.out.println(totals[i] + "총점수");
					avgs[i] = totals[i] / 3.0;
					System.out.println(avgs[i] + "평균");
				}
				break;
			case 2:

				for (int i = 0; i < names.length; i++) {
					System.out.println("번호\t이름\t국어\t수학\t영어\t총점");
					System.out.println((num[i] + ".") + "\t" + names[i] + "\t" + kor[i] + "\t" + math[i] + "\t" + eng[i]
							+ "\t" + totals[i]);
				}
				break;
			case 3:
				System.out.println("학생번호를 입력하시오");
				int n = sc.nextInt();

				for (int i = 0; i < num.length; i++) {
					if (n == num[i]) {
						System.out.println("번호\t이름\t국어\t수학\t영어\t총점");
						System.out.println((num[i] + ".") + "\t" + names[i] + "\t" + kor[i] + "\t" + math[i] + "\t"
								+ eng[i] + "\t" + totals[i]);
					} else {
						System.out.println("잘못입력하셨습니다");
						break;
					}
				}
				break;
			case 4:
				System.out.println("학생 성적 순");
				for (int i = 0; i < avgs.length - 1; i++) {
					for (int j = i + 1; j < avgs.length; i++) {
						if (avgs[i] < avgs[j]) {
							names[i] = names[j];
							num[i] = num[j];
						}
					}
					// 정렬 알고리즘을 이용해서 성적순으로 나타내기
				}
				break;
			default:
				flag = !flag;
				System.out.println("프로그램 종료");
			}
		}
	}
}
