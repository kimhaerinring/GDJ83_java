package com.sum.s1.rang;

public class S3Main {
	public static void main(String[] args) {
		String name = "finalf.pdf";
		boolean flag = true;
		int result = 0;
		while (flag) {

			result = name.indexOf("f", result);
			if (result == -1) {
				break;
			}
			System.out.println(result);
			result++;
		}
		System.out.println("종료");
	}
}
