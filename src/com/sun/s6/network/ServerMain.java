package com.sun.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		// Network
		// ip:port => Socket
		// network 통신은 Socket끼리 1:1 통신
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		Scanner scanner = new Scanner(System.in);
		try {
			ss = new ServerSocket(8282); // 서버를 열어주는 역할 socket
			// 서버를 열고 client 접속을 기다리는 중
			System.out.println("서버 실행 후 클라이언트를 기다림");
			sc = ss.accept(); // 접속한 정보를 토대로 Socket을 리턴해줌 종이컵 만들어서 서버로 줌
			System.out.println("client 와 연결 성공");

			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			// 입력 받는거임
			while (true) {
				String msg = br.readLine();
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				if (msg.equals("exit")) {
					break;
				}

				System.out.println(msg);

				// 다시 메세지 보내기
				System.out.println("클라이언트에게 보낼 메세지 입력하세요");
				msg = scanner.next();
				ow.write(msg + "\r\n");
				ow.flush(); // 버퍼 비우기
				if (msg.equals("exit")) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();

				ow.close();
				sc.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
