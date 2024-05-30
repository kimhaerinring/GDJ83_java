package com.sun.study3.ex4;

public class Car {
	String color;
	String brand;
	String company;
	int price = 1000;

//생성자 (Counstructor)

	{
		// 인스턴스 초기화 블럭
		price = 200;
	}

	// 객체 생성시 딱 한번 호출되는 특수한 메서드
	// 클래스내에 생성자가 없으면 컴파일러가 기본 생성자를 만들어줌
//접근시정자 클래스명과 동일한 이름([매개변수선언]){}
	public Car() {
		// 기본 생성자
		System.out.println("자동차가만들어 집니다");
		this.color = "Black";
		this.brand = "k3";
		this.company = "kia";
		this.price = 2500;
	}

	public Car(int price) {

	}

	// 참조변수 )this=>자기 자신의 객체의 주소를 담고있다.
	// 객체 생성시 값이 대입되는 변수
	// 각각의 객체 내에서만 사용가능
	// this는 생략 가능
	public void info() {
		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(company);
		System.out.println(price);

	}

}
