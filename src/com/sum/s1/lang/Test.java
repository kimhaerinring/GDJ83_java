package com.sum.s1.lang;

public class Test {
	int age = 10;
	double num = 3.1;

	public boolean equals(Object obj) {
		Test t = (Test) obj;
		if (this.age == t.age && this.num == t.num) {
			return true;
		} else {
			return false;
		}

	}
}
