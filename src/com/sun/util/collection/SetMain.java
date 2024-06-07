package com.sun.util.collection;

import java.util.HashSet;

import com.sun.util.collection.ex.ProductDTO;

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("apple");
		hs.add("second ");

		System.out.println(hs);

		HashSet<ProductDTO> hs2 = new HashSet<ProductDTO>();
		ProductDTO productDTO = new ProductDTO();
		ProductDTO productDTO2 = new ProductDTO();
		productDTO = productDTO2;
		hs2.add(productDTO);
		hs2.add(productDTO2);
	}
}
