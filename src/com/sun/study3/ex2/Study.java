package com.sun.study3.ex2;

public class Study {

	public int[] remove(int[] ar) {
		int[] ar3 = new int[ar.length - 1];
		for (int i = 0; i < ar3.length; i++) {
			ar3[i] = ar[i];
		}
		return ar3;
	}

	public int[] add(int[] ar) {
		System.out.println(ar.length);
		// ar = new int[4];

		int[] ar2 = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}

		return ar2;
	}
}
