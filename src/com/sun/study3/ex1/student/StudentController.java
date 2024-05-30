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
		StudentView studentView = new StudentView();

		while (flag) {
			System.out.println("1. 학생 정보입력 2. 전체 정보 출력 3.학생 정보 검색 4. 종료");
			int select = sc.nextInt();
			if (select == 1) {
				students = m.makestudent();

			} else if (select == 2) {
				studentView.view(students);

			} else if (select == 3) {
				Student student = m.findBynum(students);
				if (student != null) {
					studentView.view(student);
				} else {
					studentView.view("검색 결과가 없습니다.");
				}

			} else if (select == 4) {
				System.out.println("종료");
				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
