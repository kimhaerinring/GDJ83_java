package com.sun.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		String name = "winter";
		int num = 2;
		ar.add(name); // 다형성 개념
		ar.add(num); // Integer 로 바뀜
		ar.add(3.12); // double
		ar.add('a'); //
		ar.add(false);
		ar.add(num);

		ar.add(1, "test "); // 숫자번째에 test를 끼워 넣음
		ar.set(0, 'c'); // 해딩 번호에 있는걸 수정해라

		ar.remove(0);

		ar.remove(2);

		ar.clear(); // 전체 삭제

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}
		LinkedList lk = new LinkedList();
		lk.add("ad");

	}

}
