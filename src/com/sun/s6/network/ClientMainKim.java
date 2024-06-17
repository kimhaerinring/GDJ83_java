package com.sun.s6.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.sun.study3.ex1.student.Student;
import com.sun.study3.ex1.student.StudentService;
import com.sun.study3.ex1.student.StudentView;

public class ClientMainKim {
	public static void main(String[] args) {
		ArrayList<ClientDTO> sd = new ArrayList<ClientDTO>();
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		StudentService m = new StudentService();
		Student[] students = null;
		StudentView studentView = new StudentView();
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedReader br = null;
		InputStream is = null;
		InputStreamReader ir = null;
		try {
			socket = new Socket("192.168.7.108", 8282);
			System.out.println("서버와 연결성공");
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			// 내보내다 output o과1 로 내보내다
			os = socket.getOutputStream();
			// 문자로 변경
			ow = new OutputStreamWriter(os);
			// 키보드에 쓴걸 내보내려하는 거임 버퍼에 담긴거임
			while (flag) {
				System.out.println("1. 학생 정보 입력 2. 학생 정보 검색 3.종료");
				String str = sc.next();
				ow.write(str + "\r\n");
				ow.flush(); // 버퍼 비우기

				if (str.equals("1")) {
					System.out.println("번호 이름 키 성별");
					str = br.readLine();
					System.out.println(str);
					StringTokenizer st = new StringTokenizer(str, "-");

					while (st.hasMoreTokens()) {
						ClientDTO c = new ClientDTO();

						c.setNum(Integer.parseInt(st.nextToken().trim()));
						c.setName(st.nextToken().trim());
						c.setHeight(Double.parseDouble(st.nextToken().trim()));
						c.setGender(st.nextToken().trim());
						sd.add(c);
					}

					for (int i = 0; i < sd.size(); i++) {

						System.out.println("번호: " + sd.get(i).getNum() + "이름: " + sd.get(i).getName() + "키: "
								+ sd.get(i).getHeight() + "성별: " + sd.get(i).getGender());
//						System.out.println("이름" + sd.get(i).getName());
//						System.out.println("키" + sd.get(i).getHeight());
//						System.out.println("성별" + sd.get(i).getGender());
					}

				} else if (str.equals("2")) {
					System.out.println("번호 입력시 상세 정보 확인");
					System.out.println("서버로 보낼 메세지를 입력하세요");
					str = sc.next();

					ow.write(str + "\r\n");
					ow.flush(); // 버퍼 비우기

					str = br.readLine();
					System.out.println(str);
				} else if (str.equals("3")) {
					System.out.println("3번 클릭시 종료");

					System.out.println("종료");
					break;

				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
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
