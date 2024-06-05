package com.sum.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		// 901223-1234567
		String jumin = sc.next();
		String ex = jumin.substring(7, 8);
		jumin = jumin.substring(0, 6) + jumin.substring(7, 14);
		int num = Integer.parseInt(ex);
		// 1.성별을 검증
		// System.out.println(ex);

		if (num % 2 == 0) {
			System.out.println("여자입니다.");

		} else {
			System.out.println("남자입니다.");
		}
		// 2. 나이를 계산 2024-출생년
		String age = jumin.substring(0, 2);
		// System.out.println(age);
		int num1 = Integer.parseInt(age);
		if (num == 1 || num == 2) {
			int a = num1 + 1900;
			System.out.println("1900년대 사람");
			int result = 2024 - a;
			System.out.println(result + "살입니다.");
		} else if (num == 3 || num == 4) {
			int b = num1 + 2000;
			System.out.println("2000년대 사람");
			int result = 2024 - b;
			System.out.println(result + "살입니다.");
		}
		// 3.주민번호 유효성 검증
		// 9 5 1 2 2 6 - 1 2 3 4 5 6 7(검증용 숫자)
		// *2*3*4*5*6*7 *8 *9*2*3*4*5
		// 18+15+4+10+12+42+8+18+6+12+20+30
		// 총합122
		// 총합을 11로 나눈 나머리를 구합니다.
		// 122%11 -->1
		// 나머지를 11로 뺀 결과값을 검증용 숫자와 같은지 비교
		// 11-1=>10
		// 11로 뺀 결과 값이 2자리수 라면
		// 뺀 결과 값을 10으로 나눈 나머지를 검증용 숫자와 같은지 비교
		// 10%10=>0
		// String jumin 입력받은 주민번호 int num = Integer.parseInt(jumin); 스트링 타입을 숫자로 변경하는 방법
		int[] ch = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < 12; i++) {
			int io = Integer.parseInt(jumin.substring(i, (i + 1)));
			sum += ch[i] * io;
			// System.out.println(io + "*" + ch[i] + "=" + sum);
		}
		int total = 11 - sum % 11;

		if (total == 10)
			total = 0;
		if (total == 11)
			total = 1;
		System.out.println(total);
		if (total == Integer.parseInt(jumin.substring(12))) {
			System.out.println("정확한 주민번호입니다.");
		} else {
			System.out.println("잘못된 주민번호입니다.");

		}
	}
}
