package com.sun.s5.date;

public class Single {
	// singletone
	private static Single single;
	int num = 10;

	private Single() {

	}

	public static Single get() {
		if (single == null) {
			Single.single = new Single();
		}
		return Single.single;
	}
}
