package com.sun.s2;

public class Member {
	private String name;
	private int age;

	// setter getter
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public int getAge() {

		return this.age;
	}

}
