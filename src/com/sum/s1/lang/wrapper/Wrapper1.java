package com.sum.s1.lang.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		// 클래스
		// int long...
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println("");
		System.out.println(Double.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);

		Integer i = new Integer("0");

		int num = 10;
		i = new Integer(num);

		// 문자열을 숫자타입으로 변경
		int n = Integer.parseInt("10");
		Double.parseDouble("3.12");
		System.out.println(n);

		// wrapper
		num = 10;
		// auto boxing
		// 같은 타입으로 만들어준다
		Integer n1 = num;
		// auto unboxing
		num = n1;

		Double d1 = 3.12;

		n1 = (int) 3.12;
		System.out.println(n1);

	}

}
