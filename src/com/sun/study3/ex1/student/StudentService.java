package com.sun.study3.ex1.student;

import java.util.Scanner;

public class StudentService {

	public Student[] makestudent() {
		Scanner sc = new Scanner(System.in);
		// 같은 데이터 타입을 묶는것
		System.out.println("힉생의 수를 입력하세요");
		int count = sc.nextInt();
		// 학생들을 모을 배열 리턴
		// Student
		// 배열
		Student[] students = new Student[count];

		for (int i = 0; i < students.length; i++) {
			Student s = new Student();
			System.out.println(i + 1 + "번째 이름 입력");
			s.name = sc.next();
			System.out.println(s.name + "의 번호 입력");
			s.num = sc.nextInt();
			System.out.println(s.name + "의 국어입력");
			s.kor = sc.nextInt();
			System.out.println(s.name + "의 영어입력");
			s.eng = sc.nextInt();
			System.out.println(s.name + "의 수학입력");
			s.math = sc.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;
			students[i] = s;

		}
		return students;

	}

}
