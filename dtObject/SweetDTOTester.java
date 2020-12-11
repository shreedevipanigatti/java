package com.xworkz.dtObject;

import com.xworkz.dtObject.DTO.SweetDTO;

public class SweetDTOTester {

	public static void main(String[] args) {
		SweetDTO sweetDto = new SweetDTO("Dharawad Peda", 250);
		System.out.println(sweetDto.getName());
		System.out.println(sweetDto.getPrice());
		//sweetDto.setPrice(550);
		//System.out.println("updated price  " + sweetDto.getPrice());

		String[] color = new String[2];
		color[0] = "brown";
		color[1] = "chakolet";

		SweetDTO sweetDto2 = new SweetDTO("Karnataka", "1KG", color);
		System.out.println(sweetDto2.getPopularState());
		System.out.println(sweetDto2.getQuantity());
		System.out.println(sweetDto2.getColor());

		System.out.println(sweetDto2.getShape());

	}
}
