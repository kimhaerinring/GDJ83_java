package com.sun.util.collection.ex2;

import java.util.Scanner;

public class CardController {
	private CardDTO[] dto;
	private CardService cardservice;
	private CardView cardview;
	private Scanner scanner;

	public CardController() {
		cardservice = new CardService();
		cardview = new CardView();
		this.scanner = new Scanner(System.in);
	}

	public void start() {
		boolean flag = true;

		while (flag) {
			System.out.println("1.명함 정보 전체 출력 2.명함 이름 정보 검색 3.명함 정보 추가 4.명함 정보 삭제 5.종료");
			int select = scanner.nextInt();
			if (select == 1) {
				System.out.println("명함 정보");
				cardview.view(dto);

			} else if (select == 2) {
				System.out.println("정보 검색");
				CardDTO carddto = cardservice.findByName(this.scanner, this.dto);
				cardview.view(carddto);

			} else if (select == 3) {
				System.out.println("명함 정보 추가");
				dto = cardservice.addCard(scanner, dto);
			} else if (select == 4) {
				System.out.println("명함 정보 삭제");
				dto = cardservice.removeCard(scanner, dto);
			} else if (select == 5) {
				System.out.println("시스템 종료");
				break;
			}
		}
	}
}
