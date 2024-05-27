package com.sun.study1;

public class Study2 {
	public static void main(String[] args) {

		int age = 30;
		System.out.println(age);
		// Reference type (객체)
		String name = "haerin";
		age = 1;
		name = "1";

		// 형변환 (cascading)
		// primitive 타입끼리만 가능(boolean 제외

		// 형태의 변환(type의 변환)
		// 강체 형변환(명시적 형변환)
		long num1 = 30L;
		int num2 = (int) num1;

		float f1 = 1.2F;
		// 자동형변환(묵시적 형변환)
		double d1 = f1;

		// 자동 형변환
		// byte -> short, char ->int ->long ->float ->double
		//수 표현의 개수(비트 조합)
		
		int total = 100;
		double  avg=total/3;
		
		avg =33.22;
		total =(int)avg*10;
		System.out.println(avg);
		System.out.println(total);
		
		//over flow 
		
		byte b =127;
		byte b2 = 1;
		b =(byte)(b+b2);
		System.out.println(b);
		

		// 연산자는 같은 타입끼ㅣ만 연산이 가능
		// 산술연산자 :+-*/%
		System.out.println();
		
		
		}
	}