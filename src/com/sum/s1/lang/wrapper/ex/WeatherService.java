package com.sum.s1.lang.wrapper.ex;

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

	public void init() {
		// sb에 있는 것을 문자열 변수에 담아서 출력

		String result = sb.toString();
		System.out.println(result);
		// System.out.println(result);
		result = result.replace(",", "-");

		String[] st = result.split("-");

		WeatherDTO wd = new WeatherDTO();
		WeatherDTO[] w = new WeatherDTO[4];
		wd.setCity(st[0].trim());
		wd.setGion(Double.parseDouble(st[1].trim()));
		wd.setStatus(st[2].trim());
		wd.setHumidity(Integer.parseInt(st[3].trim()));

		for (int i = 0; i < st.length; i++) {
			w[i / 4] = new WeatherDTO();
			if (i % 4 == 0) {
				w[i / 4].setCity(st[i].trim());
				System.out.print(w[i / 4].getCity());
			} else if (i % 4 == 1) {
				w[i / 4].setGion(Double.parseDouble(st[i].trim()));
				System.out.print(w[i / 4].getGion());
			} else if (i % 4 == 2) {
				w[i / 4].setStatus(st[i].trim());
				System.out.print(w[i / 4].getStatus());
			} else if (i % 4 == 3) {
				w[i / 4].setHumidity(Integer.parseInt(st[i].trim()));
				System.out.println(w[i / 4].getHumidity());
			}
		}
	}
}