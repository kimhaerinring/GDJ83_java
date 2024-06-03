package com.sum.s1.rang;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println(flag);

		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2);

		t1.age = 19;
		flag = t1.equals(t2);
		System.out.println(flag);

		String name = "sun";
		System.out.println("이릅입력");
		String name2 = sc.next();
		String name3 = "sun";
		System.out.println("name==name3 :" + name == name2);
		System.out.println("name == name3 :" + name == name3);
		System.out.println("name.equals(name2): " + name.equals(name2));

		System.out.println("1" + 1 + 1 + 1 + 3 + '1');

	}

}
