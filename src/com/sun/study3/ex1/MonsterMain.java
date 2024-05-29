package com.sun.study3.ex1;

public class MonsterMain {
	public static void main(String[] args) {

		Monster m = new Monster();
		m.hp = 100;
		m.level = 25;
		m.exp = 30;
		m.name = "지애";
		m.people = "monkey";

		Ax ax = new Ax();
		ax.name = "주사기";
		ax.damage = 5;
		ax.upNum = 10;
		ax.broken = 40;

		m.ax = ax;

		System.out.println("이름:\t" + m.name);
		System.out.println("종족:\t" + m.people);
		System.out.println("HP:" + m.hp);
		System.out.println("level:\t" + m.level);
		System.out.println("exp:\t" + m.exp);

		System.out.println("무기 이름:\t" + m.ax.name);
		System.out.println("공격력:\t" + m.ax.damage);
		System.out.println("강화수치\t" + m.ax.upNum);
		System.out.println("내구도\t" + m.ax.broken);
		ax = new Ax();
		ax.name = "황금도끼";
		System.out.println("무기 이름:\t" + m.ax.name);

		Monster m2 = new Monster();
		m2.ax = ax;

	}
}
