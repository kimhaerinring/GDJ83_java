package com.sun.s4;

public class Car {
	// 접근지정자 [그외지정자] 데이터타입 변수명;
	public static String company;

	public int price;

	public static void info() {
		System.out.println(Car.company);
		System.out.println("static method");
	}

	public void intfo2() {
		Car.info();

	}
}
