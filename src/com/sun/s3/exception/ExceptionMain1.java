package com.sun.s3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			int num = 10;
			System.out.println("숫자입력");
			int num2 = scanner.nextInt();
			System.out.println(num / num2);

			// throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("숫자 이외에는 입력하지 마세요");
		} catch (Exception e) {

		} catch (Throwable e) {

		}
		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(0);
		} catch (ArithmeticException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("프로그램이 종료");
	}

}
