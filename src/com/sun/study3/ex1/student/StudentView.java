package com.sun.study3.ex1.student;

public class StudentView {

	public void view3(String str) {
		System.out.println(str);
	}

	public void view2(Student student) {
		System.out.println(student.name);
		System.out.println(student.avg);
	}

	public void view(Student[] students) {
		// 학생들의 모든 정보 출력
		for (int i = 0; i < students.length; i++) {
			System.out.println("학생 번호:" + students[i].num);
			System.out.println("학생 이름:" + students[i].name);
			System.out.println("국어 점수:" + students[i].kor);
			System.out.println("영어 점수:" + students[i].eng);
			System.out.println("수학 점수:" + students[i].math);
			System.out.println("총 점:" + students[i].total);
			System.out.println("평균:" + students[i].avg);

		}

	}
}
