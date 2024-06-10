package com.sun.util.collection.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection1 {
	public List<Integer> makeList() {
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);

		return ar;
	}

	public Map<String, Integer> makeMap() {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		return m;
	}
}
