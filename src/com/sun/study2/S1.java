package com.sun.study2;

public class S1 {
	public static void main(String[] args) {
		// 배열- 하나의 변수로 어러개의 데이터를 다룰 때 사용
		// let ar =[1,2,3,'a',true]
		// 같은 데이터 타입만 모을 수 있다.
		// 배열 선언
		// 모을려고 하는 데이터 타입명[ ] 변수명=new 모을려고 하는 데이터 타입명[갯수]
		int num = 0;
		double n2 = 0.0;
		String name = null;

		int[] a = new int[3];
		int[] ar = { 1, 2, 3 };

		String[] names = new String[2];

		System.out.println(a);
		System.out.println(names);
		System.out.println(a[0]);
		System.out.println(names[0]);
		a[0] = 50;
		a = ar;
		System.out.println(a[0]);
	}

}
