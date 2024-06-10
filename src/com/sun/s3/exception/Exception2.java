package com.sun.s3.exception;

public class Exception2 {
	public void hap(int n1, int n2) throws Exception {
		// 3살
		int h = n1 + n2;

		if (h > 99) {
			throw new MyException("새자리 수는 몰라요");
		}
	}
}
