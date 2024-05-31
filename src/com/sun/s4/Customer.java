package com.sun.s4;

public class Customer {
	int don;
	int point;

	// 매개 변수를 하나만 선언
	public void buy(Ele t) {
		// 가진 돈에서 물건의 가격 뺌
		// 가진 포인트에 물건의 포인트를 더해 줌
		this.don = this.don - t.price;
		this.point = this.point + t.point;
		System.out.println(don);
		System.out.println(point);

	}
}
