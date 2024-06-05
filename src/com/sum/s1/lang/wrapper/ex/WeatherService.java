package com.sum.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherService {
	// Business Layer
	// 해야되는 일들을 작업하는 곳
	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer(); // stringbuffer객체 생성됨
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.3 - 흐림 - 90");
		this.sb.append("-제주 , 4.3 - 눈 - 30");
		this.sb.append("-광주 , 10.3 - 태풍 - 80");

	}

	public WeatherDTO[] init() {
		// sb에 있는 것을 문자열 변수에 담아서 출력

		String info = sb.toString();
		System.out.println(info);
		// System.out.println(result);
		info = info.replace(",", "-");
		WeatherDTO[] dtos = this.getWeathers(info);
		return dtos;

	}

	private WeatherDTO[] getWeathers(String info) {
		String[] infos = info.split("-");
		for (int i = 0; i < infos.length; i++) {
			infos[i] = infos[i].trim();
		}
		int count = infos.length / 4;
		WeatherDTO[] dtoss = new WeatherDTO[count];
		int j = 0;
		for (int i = 0; i < infos.length; i = i + 4) {
			WeatherDTO dtos = new WeatherDTO();
			dtos.setCity(infos[i]);
			dtos.setGion(Double.parseDouble(infos[i + 1]));
			dtos.setHumidity(Integer.parseInt(infos[i + 3]));
			dtos.setStatus(infos[i + 2]);

			dtoss[j] = dtos;
			j++;
		}
		return dtoss;
	}

	// 날씨 정보를 도시명으로 검색 서울을 입력하면 서울정보를 출력
	// 검색해서 해당 날씨 정보를 리턴 출력은 뷰에서
	// findByCity 메서드명
	public WeatherDTO findByCity(Scanner scanner, WeatherDTO[] dtos) {
		WeatherDTO weatherdto = null;

		System.out.println("도시명 입력");
		String select = scanner.next();

		for (int i = 0; i < dtos.length; i++) {
			if (select.equals(dtos[i].getCity())) {
				weatherdto = dtos[i];
				break;
			}

		}
		return weatherdto;

	}

	// 날씨 정보 추가
	// addWeather
	// 도시명, 기온,습도 상태를 입력받아서 기존의 날씨 정보에 추가

	public WeatherDTO[] addWeather(Scanner scanner, WeatherDTO[] dtos) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시 명을 입력하세요");
		weatherDTO.setCity(scanner.next());
		System.out.println("기온을 입력하세요");
		weatherDTO.setGion(scanner.nextDouble());
		System.out.println("습도를 입력하세요");
		weatherDTO.setHumidity(scanner.nextInt());
		System.out.println("상태을 입력하세요");
		weatherDTO.setStatus(scanner.next());

		WeatherDTO[] newAr = new WeatherDTO[dtos.length + 1];
		for (int i = 0; i < dtos.length; i++) {
			newAr[i] = dtos[i];

		}
		newAr[dtos.length] = weatherDTO;
		return newAr;
	}

}
