package com.sun.s4.io.ex1;

import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) throws Exception {
		ReadStudy st = new ReadStudy();
		ArrayList<MenuDTO> md = st.read();
		for (int i = 0; i < md.size(); i++) {
			md.get(i);
			System.out.println(md.get(i).getMenuName());
			System.out.println(md.get(i).getPrice());
			System.out.println(md.get(i).getKcal());
		}

	}

}
