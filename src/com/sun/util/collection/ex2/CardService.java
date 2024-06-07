package com.sun.util.collection.ex2;

import java.util.Scanner;

public class CardService {
//카드 정보 찾기
	public CardDTO findByName(Scanner scanner, CardDTO[] dto) {
		CardDTO carddto = null;
		System.out.println("이름을 입력하시오");
		String select = scanner.next();

		for (int i = 0; i < dto.length; i++) {
			if (select.equals(dto[i].getName())) {
				carddto = dto[i];
				break;
			}
		}
		return carddto;
	}

	// 명함 정보 추가
	public CardDTO[] addCard(Scanner scanner, CardDTO[] dto) {
		CardDTO carddto = new CardDTO();
		CardDTO[] nr;
		System.out.println("직급을 입력하세요");
		carddto.setRank(scanner.next());
		System.out.println("이름을 입력하세요");
		carddto.setName(scanner.next());
		System.out.println("전화번호을 입력하세요");
		carddto.setNumber(scanner.next());
		System.out.println("이메일을 입력하세요");
		carddto.setEmail(scanner.next());
		if (dto != null) {

			nr = new CardDTO[dto.length + 1];
			for (int i = 0; i < dto.length; i++) {
				nr[i] = dto[i];
			}
			nr[dto.length] = carddto;

		} else {
			nr = new CardDTO[1];
			nr[0] = carddto;
		}
		return nr;
	}

	// 기존 배열에서 하나를 삭제함
	// 이름을 입력 받아서 일치하는 날씨 정보 삭제
	public CardDTO[] removeCard(Scanner scanner, CardDTO[] dto) {
		CardDTO cardto = new CardDTO();
		System.out.println("삭제할 명함의 이름을 입력하세요");
		CardDTO[] nr = new CardDTO[dto.length - 1];
		String select = scanner.next();
		int j = 0;
		for (int i = 0; i < dto.length; i++) {
			if (!select.equals(dto[i].getName())) {
				if (j == dto.length && j == i) {
					System.out.println("찾으시는 이름이 없습니다.");
					return dto;
				}
				nr[j++] = dto[i];
			}
		}
		return nr;
	}
}
