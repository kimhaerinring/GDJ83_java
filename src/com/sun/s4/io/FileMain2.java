package com.sun.s4.io;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		// study2 폴더를 삭제
		File file = new File("C:\\Study2");
		File[] list = file.listFiles();
		for (File f : list) {
			f.delete();
		}
		file.delete();
	}

}