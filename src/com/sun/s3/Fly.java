package com.sun.s3;

public interface Fly extends Landing {

	// 상수 접근지정자는 public만 가능
	public final static int NUM = 1;
	String NAME = "abc";

	// 추상메서드
	// 접근지정자는 무조건 public그외 지정하는 추상메서드 abstract
	// public abstract void t1();
//	public int t2();
	// void t4();
	public abstract void flyAble();
}
