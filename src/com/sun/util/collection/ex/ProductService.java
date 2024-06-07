package com.sun.util.collection.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {

	private StringBuffer sb;

	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000,아이폰,50,");
		sb.append("45000,캘럭시,100,");
		sb.append("30000, 노키아, 20");
	}
	// init 메서드 생성 위 애들을 파싱

	public ArrayList<ProductDTO> init() {
		String datas = sb.toString();
		StringTokenizer st = new StringTokenizer(datas, ",");
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();

		while (st.hasMoreElements()) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
			productDTO.setName(st.nextToken().trim());
			productDTO.setStock(Integer.parseInt(st.nextToken().trim()));
			ar.add(productDTO);

		}
		return ar;

	}

	// 기존의 가방에다가 새상품을 추가
	public void addProduct(ArrayList<ProductDTO> ar) {
		Scanner scanner = new Scanner(System.in);
		ProductDTO dto = new ProductDTO();
		System.out.println("가격을 입력하세요");
		dto.setPrice(scanner.nextInt());
		System.out.println("상품명을 입력하세요");
		dto.setName(scanner.next());
		System.out.println(" 재고를 입력하세요");
		dto.setStock(scanner.nextInt());
		ar.add(dto);
	}
	// 기존의 가방을 받아서 제품을 삭제 , 물건명을 입력받아서 삭제

	public int removeProduct(ArrayList<ProductDTO> ar) {
		Scanner scanner = new Scanner(System.in);
		ProductDTO dto = new ProductDTO();
		System.out.println("삭제 할 제품 명을 입력하세요");
		String name = scanner.next();
		int result = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 1;
				break;
			}

		}
		return result;
	}

}
