package com.sun.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {

		// 문자열--->문자--->0110101
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String fileName = sc.next();
		File file = new File("C:\\Study", fileName);
		FileWriter fw = null;

		try {
			fw = new FileWriter(file, true);

			// e,E가 입력되면 종료
			while (true) {
				System.out.println("내용을 입력하세요");
				String s = sc.next();

				if (s.equals("e") || s.equals("E")) {
					System.out.println("종료합니다");
					break;
				} else {
					fw.write(s + "\r\n");
					fw.flush();
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");

	}

}
