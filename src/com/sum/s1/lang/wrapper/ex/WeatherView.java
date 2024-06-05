package com.sum.s1.lang.wrapper.ex;

public class WeatherView {

	// view 메서드명
	// 날씨들의 정보를 받아서 이쁘게 출력하는것

	public void view(String city) {
		System.out.println(city);
	}

	public void view(WeatherDTO weatherdto) {
		if (weatherdto != null) {

			System.out.println(weatherdto.getCity());
			System.out.println(weatherdto.getGion());
			System.out.println(weatherdto.getHumidity());
			System.out.println(weatherdto.getStatus());
		} else {
			System.out.println("검색 결과가 없습니다.");
		}

	}

	public void view(WeatherDTO[] dtos) {

		System.out.println("도시\t온도\t습도\t날씨");

		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i].getCity() + "\t" + dtos[i].getGion() + "\t" + dtos[i].getHumidity() + "\t"
					+ dtos[i].getStatus());

		}
	}
}