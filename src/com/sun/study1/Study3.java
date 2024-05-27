package com.sun.study1;

public class Study3 {
	public static void main(String[] args) {
		// 연산자
		// + 산술 연산자
		// +연결 연산자 : 문자열 + PRIMITIVE => 문자열
		System.out.println("1" + 1);
		System.out.println(1 + 'a' + "1");

		// 물건을 고르고,물건의 총 합계, 돈을 내고,
		int total = 25760;
		int don = 50000;
		// 잔돈 계산
		int jandon = don - total;
		// 만원갯수를 담을 변수

		int man = 0;
		int chon = 0;
		int b = 0;
		int s = 0;
		man = jandon / 10000;
		chon = (jandon - (man * 10000)) / 1000;
		b = (jandon - (man * 10000) - (chon * 1000)) / 100;
		s=(jandon - (man * 10000) - (chon * 1000)-(b*100)) / 10;
		
		System.out.println("잔돈:" + jandon);
		System.out.println("만원:" + man);
		System.out.println("천원:" + chon);
		System.out.println("벡원:" + b);
		System.out.println("십원:" + s);
	}

}
