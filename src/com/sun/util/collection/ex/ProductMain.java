package com.sun.util.collection.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {

		// 데이터 핸들링
		// 숫자형 문자형 논리형
		// 신규 통장 개설 - 계좌번호 , 예금주, 은행명, 비밀번호, 잔고.통장 상품명
		// 객체= 알바 클레스= 알바가해야하일 정의
		ProductService productService = new ProductService();

		ArrayList<ProductDTO> ar = productService.init();
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getPrice());
			System.out.println(ar.get(i).getStock());
		}
	}

}
