package com.sun.util.collection.ex2;

public class CardView {
	// 명합의 정보를 받아서 출력하는 것
	public void view(String name) {
		System.out.println(name);
	}

	public void view(CardDTO carddto) {
		if (carddto != null) {
			System.out.println(carddto.getName());
			System.out.println(carddto.getRank());
			System.out.println(carddto.getNumber());
			System.out.println(carddto.getEmail());
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void view(CardDTO[] carddto) {
		System.out.println();
		for (int i = 0; i < carddto.length; i++) {
			System.out.println("직급: " + carddto[i].getRank());
			System.out.println("이름: " + carddto[i].getName());
			System.out.println("휴대폰 번호: " + carddto[i].getNumber());
			System.out.println("이메일: " + carddto[i].getEmail());
		}
	}
}