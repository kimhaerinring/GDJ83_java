package com.sun.study2;

import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {

		// 학생 수를 입력 받아서 학생 수 만큼 이름을 입력받아서 출력하자
		// a:80,b;90
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 수를 입력하시오");
		int c = sc.nextInt();

		String[] names = new String[c];
		int[] kor = new int[c];
		int[] math = new int[c];
		for (int i = 0; i < names.length; i++) {
			System.out.println("학생 이름 입력");
			names[i] = sc.next();
			System.out.println(names[i] + "의 국어점수 입력");
			kor[i] = sc.nextInt();
			System.out.println(names[i] + "의 수학점수 입력");
			math[i] = sc.nextInt();
		}

		System.out.println("이름\t국어\t수학");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t" + kor[i] + "\t" + math[i] + "\t");
		}
	}

}
