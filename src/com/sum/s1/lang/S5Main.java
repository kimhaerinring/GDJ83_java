package com.sum.s1.lang;

public class S5Main {

	public static void main(String[] args) {
		String name = "    winte r";
		System.out.println(name);
		System.out.println(name.length());
		name = name.strip(); // 앞 뒤 빈칸 제거
		System.out.println(name);
		System.out.println(name.length());
		name = name.replace(" ", "");
		System.out.println(name);
		System.out.println(name.length());
		name = "winter -24*서울";
		// 파싱(parsing)
		name = name.replace("*", "-");
		System.out.println(name);
		String[] datas = name.split("-");
		for (int i = 0; i < datas.length; i++) {

			System.out.println(datas[i]);
		}

		String s = String.valueOf(10.2);
		System.out.println(10.2 + "");
	}

}
