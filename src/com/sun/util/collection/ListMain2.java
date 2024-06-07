package com.sun.util.collection;

import java.util.ArrayList;

public class ListMain2 {
	public static void main(String[] args) {
		// Generic : 타입에 제한
		// E : 변수

		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<Integer> ar2 = new ArrayList();
		ar2.add(10);
		ar.add("first");
//		ar.add(2);
//		ar.add('c');
//		ar.add(true);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}
		String name = (String) ar.get(0); // 형변환
		System.out.println(name);
	}
}
