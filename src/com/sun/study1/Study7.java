package com.sun.study1;

import java.util.Scanner;

public class Study7 {
	public static void main(String[]args) {
		//반복문 - for,while
		//for (초기식;조건식;증감식){}
		//while (조건식){}
		//do{}while(조건식)
		//break, continue
		//3과목의 점수를 입력받아서 합계구하기
		Scanner sc = new Scanner(System.in);
		//입력 받아서 합계
		int sum=0;
		for(int b= 0;b<3;b++) {
			int num = sc.nextInt();
			sum=sum+num;
			System.out.println(sum);
		
			//'a' ->'z'출럭
			int c = 97;
			for(int i =0;i<25;i++) {
				System.out.println((char)c);
			}
		}
		System.out.print("abc");
		System.out.println("");
		System.out.print("def");
		System.out.println("123");
	}
}
