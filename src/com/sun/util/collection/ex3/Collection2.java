package com.sun.util.collection.ex3;

import java.util.List;
import java.util.Map;

public class Collection2 {
	public void useList(List<Integer> ar) {
//for (초기식;조건식;증감식){}
		// 향상된 for(꺼낼데이터 타입 변수명:collection의 참조 변수명){}
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		for (Integer n : ar) {
			System.out.println(n);
		}

	}

	public void useMap(Map<String, Integer> map) {
		map.get("");
	}
}
