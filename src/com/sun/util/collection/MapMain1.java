package com.sun.util.collection;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("k1", 1);
		map.put("k2", 2);

		System.out.println(map.get("k1"));
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("k1"));
		System.out.println(map.containsValue(1));
		System.out.println(map.size());
		System.out.println(map);

		// map.remove("k2", 2);
		map.clear();
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);

		}
	}
}
