package com.sun.s2;

public class MidStudent extends Student {
	private int history;

	public MidStudent() {
		// super();
	}

	public void midInfo() {
		super.info();
		System.out.println(this.history);
	}

	public int getHisory() {
		return history;
	}

	public void setHisory(int history) {
		this.history = history;
	}
}
