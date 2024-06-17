package com.sun.s6.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedReader br = null;
		InputStream is = null;
		InputStreamReader ir = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 8282); // exception 발생 안할경우
			System.out.println(" 서버와 연결성공");
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			// 내보내다 output o과1 로 내보내다
			os = socket.getOutputStream();
			// 문자로 변경
			ow = new OutputStreamWriter(os);
			// 키보드에 쓴걸 내보내려하는 거임 버퍼에 담긴거임
			while (true) {

				System.out.println("서버로 보낼 메세지를 입력하세요");
				String str = sc.next();

				ow.write(str + "\r\n");
				ow.flush(); // 버퍼 비우기

				if (str.equals("exit")) {
					break;
				}

				str = br.readLine();

				if (str.equals("exit")) {
					break;
				}
				System.out.println(str);
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				ow.close();
				ow = new OutputStreamWriter(os);
				socket.close();
				sc.close();

				br.close();
				ir.close();
				is.close();
				socket.close();
				sc.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

}
