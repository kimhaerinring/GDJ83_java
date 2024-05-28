package com.sun.study1;

import java.util.Scanner;

public class Study9 {
	public static void main(String[] args) {
		// 로그인 검증
		// id=1234, pw=5678
		// 로그인 시도 전에 1.로그인2.종료
		// 사용자의 id와 pw를 입력 받아서 로그인시도를 N번시도
		// 틀리면 로그인 실패 출력, 로그인 성공하면 성공을 출력하고 반복문 종료

		// 반목문 종료 후 종료를 선택했다면 프로그램이 종료
		// 로그인이 성공 후 반복문이 종료 되었다면 게임을 시작하자

		// MMORPG :
		// 시작헤벨은 1로 시작해서 15가 만랩
		// GOLD: 0으로 시작
		// 1->2 : 3마리 사냥
		// 2->3 : 6마리 사냥
		// 3->4 : 9 마리 사냥...
		// 14->15 : 42마리 사냥
		// 5레벨 달성시 1000G 지급
		// 10레벨 달성시 2000G 지급
		// 15레벨 달성시 3000G 지급
		// 현재 레벨 현재 GOLD 출력하고 종료
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean flag = true;
	
			while (flag) {
				System.out.println("1. 로그인 2.종료");
				int select = sc.nextInt();
				
				if(select==1) {
					System.out.println("id 입력하시오");
					int select2 = sc.nextInt();
					System.out.println("pw입력하시오");
					int select3 = sc.nextInt();
					if (select2== id&&select3==pw) {
						System.out.println("로그인 성공");
						break;
					} else {
						System.out.println("로그인 실패");
					}
			}else {
				flag=false;
				System.out.println("게임 종료");
				break;
			}
			
			}//while 문 끝		
			if(flag==true) {
			System.out.println("게임시작");
			for(int i=1;i<15;i++) {
				if(i%5==0) {
					System.out.println("<"+i+" 레벨입니다. >"+( i*200)+" @@@@@@@골드 획득@@@@@@@");
				}else {
					System.out.println("<"+i+"레벨입니다>");
				}
				for(int m=0;m<i*3;m++) {
					System.out.println((m+1)+"마리 잡았습니다.");
					if(m==41) {
						System.out.println("<15레벨입니다.>"+"3000@@@@@골드 획득@@@@@");
						System.out.println("Level :15  Gold : 6000G" +"게임 끝");
						flag=false;
						 
					}
				}
						}
				}
				
				
			}
			
			
	}

	
