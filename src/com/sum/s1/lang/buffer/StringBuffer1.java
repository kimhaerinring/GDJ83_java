package com.sum.s1.lang.buffer;

public class StringBuffer1 {

	public static void main(String[] args) {

		// 문자열을 더하기 하고 싶을 때 쓰는 String buffer
		StringBuffer sb = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		sb2.append(false);
		// winter + iu 문자열은변경이 불가능하므로 새로운 객체가 만들어짐
		sb.append("winter");
		sb.append("iu");
		sb.append(10);
		String result = sb.toString();
		System.out.println(sb);
		System.out.println(result);
	}

}
