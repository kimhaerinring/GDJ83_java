package com.sum.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {

	private WeatherDTO[] dtos;
	private WeatherService weatherService;
	private WeatherView weatherView;
	private Scanner scanner;

	public WeatherController() { // 기본생성자
		weatherService = new WeatherService();
		weatherView = new WeatherView();
		dtos = weatherService.init();
		this.scanner = new Scanner(System.in);
	}

	// start
	// dtos의 초기화는 생성자Weathercontroller의 생성자 내에서 초기화
	// 1.날씨 전체 정보 출력
	// 2. 종료
	public void start() { // 메서드 선언

		boolean flag = true;

		while (flag) {
			System.out.println("1. 날씨 전체 정보 출력  2.날씨 정보 검색  3. 날씨 정보 추가 4. 날씨 정보 삭제 5..종료");
			int select = scanner.nextInt();
			if (select == 1) {
				weatherView.view(dtos);

			} else if (select == 2) {
				System.out.println("날씨 정보 검색");
				WeatherDTO weatherdto = weatherService.findByCity(this.scanner, this.dtos);
				weatherView.view(weatherdto);
			} else if (select == 3) {
				System.out.println("날씨 정보 추가하기");
				dtos = weatherService.addWeather(scanner, dtos);
			} else if (select == 4) {
				System.out.println("날씨 정보 삭제");

			} else if (select == 5) {
				System.out.println("종료");
				break;
			}
		}
//추가코드
	}
}
