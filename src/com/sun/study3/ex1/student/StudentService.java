package com.sun.study3.ex1.student;

import java.util.Scanner;

public class StudentService {

	public Scanner makestudent() {
		Scanner sc = new Scanner(System.in);
		// 같은 데이터 타입을 묶는것
		System.out.println("힉생의 수를 입력하세요");
		int count = sc.nextInt();
		// 학생들을 모을 배열 리턴
		return sc;

	}

}
