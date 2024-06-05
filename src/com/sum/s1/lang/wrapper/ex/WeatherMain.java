package com.sum.s1.lang.wrapper.ex;

public class WeatherMain {
//프로그램 실행,테스트 목적
	public static void main(String[] args) {
		// DTO(data transfer object)
		// VO (Value Object)
		// 3WeatherDTO[] dtos = new WeatherService().init();
		WeatherView wv = new WeatherView();
		WeatherController wc = new WeatherController();

		// wv.view(dtos); // 참조변수명.메서드명
		wc.start();

	}

}
