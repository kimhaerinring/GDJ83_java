package com.sun.study3.ex1.student;

import java.util.Scanner;

public class StudentController {
	public void start() {
		System.out.println("student");

		// 1. 학생 정보입력 2. 전체 정보출력 3.학생검색 4. 종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		StudentService m = new StudentService();
		Student[] students = null;

		while (flag) {
			System.out.println("1. 학생 정보입력 2. 전체 정보출력 3.학생검색 4. 종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("힉생정보 입력 코드 작성해");
				students = m.makestudent();

			} else if (select == 2) {
				System.out.println("전체 정보 출력 코드 작성해");
				for (int i = 0; i < students.length; i++) {
					Student s = students[i];
					System.out.println(s.name);
					System.out.println(students[i].avg);
					System.out.println(students[i].total);
				}
			} else if (select == 3) {
				System.out.println("학생 검색 코드 작성해");

			} else if (select == 4) {
				System.out.println("종료");
				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
