package com.sum.s1.lang.wrapper.ex;

public class WeatherDTO {

	// DTO의 모든 멤버 변수는 private로 설정한다. 외부에서 접근이 불가능
	// Getters/Setters 필요
	// 생성자는 여러개 만들어도 상관없지만 기본생성자는 필수
	// 데이터
	private String city; // 서울 부산 등등
	private double gion; // 온도 36.5
	private String status; // 날씨 정보
	private int humidity; // 습도 30%

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
