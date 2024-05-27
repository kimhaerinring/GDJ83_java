package com.sun.study1;

public class Study6 {
	public static void main(String[]args) {
		int total =56;
		int avg = total/3;
		
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//평균이 60점 이상이면 D
		//그외 F
		//switch case 사용
		switch (avg/10) {
		case 10:
		case 9:
			System.out.println("a");
			int n =10;
			break;
			
		case 8:
			System.out.println("b");
			break;
		case 7:
			System.out.println("c");
			break;
		case 6:
			System.out.println("d");
			break;
			default:
				System.out.println("f");
			
		}
			

	}
}
