package com.sun.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReadStudy {
	public ArrayList<MenuDTO> read() throws Exception {
		// info.txt 파일 읽어오기
		// 1. 읽어서 파싱 후 출력 DTO들을 만든 후에
		File file = new File("C:\\study", "info.txt");
		FileReader fr = null;
		BufferedReader br = null;

		fr = new FileReader(file);
		br = new BufferedReader(fr);
		ArrayList<MenuDTO> md = new ArrayList<MenuDTO>();
		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			// System.out.println(s);

			String info = s;
			info = info.replace(",", "-");
			StringTokenizer st = new StringTokenizer(info, "-");
			String[] infos = info.split("-");

			MenuDTO dtos = new MenuDTO();
			dtos.setMenuName(infos[0].trim());
			dtos.setPrice(Integer.parseInt(infos[1].trim()));
			dtos.setKcal(Integer.parseInt(infos[2].trim()));

			md.add(dtos);

		}
		System.out.println("종료");
		br.close();
		fr.close();
		return md;

	}

}
