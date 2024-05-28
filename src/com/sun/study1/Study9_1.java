package com.sun.study1;

import java.util.Scanner;

public class Study9_1 {
	public static void main(String[] args) {
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
			
		
					}
			if(flag) {
				System.out.println("게임시작");
				int level =1;
				for(level=1;level<15;level++) {
					System.out.println("현재 레벨 :"+level);
				}
				System.out.println("최종레벨: "+level);
			}
			
			
			
			
			}

}


