package com.sun.util.collection.ex2;

public class CardDTO {
//명함관리 프로그램
	private String name; // 이름
	private String Rank;// 직급
	private String number; // 폰 번호
	private String email; // 이메일

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
