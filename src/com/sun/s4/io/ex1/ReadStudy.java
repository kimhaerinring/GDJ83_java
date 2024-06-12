package com.sun.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadStudy {
	public void read() {
		// info.txt 파일 읽어오기
		// 1. 읽어서 파싱 후 출력
		File file = new File("C:\\study", "info.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
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
				for (String f : infos) {

					System.out.println(f.trim());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}

}
