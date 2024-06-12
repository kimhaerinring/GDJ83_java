package com.sun.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// bit(byte)--> 문자->문자열
		// 파일의 정보를 담고있는 객체가 필요
		File file = new File("C:\\study");

		System.out.println(file.exists());// 파일이 있습니까?
		System.out.println(file.isDirectory()); // 폴더 입니까?
		System.out.println(file.isFile()); // 파일 입니까
		System.out.println(file.getName()); // 이름
		System.out.println(file.length()); // 용량

		// file = new File("C:\\study", "test.txt");
		// System.out.println(file);
		file = new File(file, "sub"); // 폴더, 파일

		System.out.println(file.exists());
		System.out.println(file.isDirectory()); // 폴더 입니까?
		System.out.println(file.isFile()); // 파일 입니까
		if (!file.exists()) {
			file.mkdir(); // make directory 파일을 만들어라
		}

		file = new File("C:\\study\\sub2\\student");
		file.mkdirs();

		file = new File("C:\\study\\test.txt");
		file.delete();

		file = new File("C:\\study\\sub2");
		file.delete();
//파일 목록
		file = new File("C:\\study");
		String[] list = file.list();
		System.out.println(list);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);

			File[] ar = file.listFiles();
			for (File f : ar) {
				if (f.isDirectory()) {
					System.out.println("폴더");
				}
				if (f.isFile()) {
					System.out.println("파일");
				}
			}

		}

	}

}
