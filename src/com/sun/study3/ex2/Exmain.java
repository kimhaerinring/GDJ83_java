package com.sun.study3.ex2;

public class Exmain {

	public static void main(String[] args) {
		Study study = new Study();
		int[] ar = { 1, 2, 3, };
		ar = study.add(ar); // 매개변수로 보내는 값 ->인자값
		System.out.println(ar.length);
		ar = study.remove(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			System.out.println();
		}
	}

}
