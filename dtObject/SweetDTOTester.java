package com.xworkz.dtObject;


import java.util.Arrays;

import com.xworkz.DTO.sweet.Shape;
import com.xworkz.DTO.sweet.SweetDTO;

public class SweetDTOTester {

	public static void main(String[] args) {

		SweetDTO sweetDTO = new SweetDTO();
		System.out.println(sweetDTO.getName());
		System.out.println(sweetDTO.getPopularState());
		System.out.println(sweetDTO.getPrice());
		System.out.println(" ");

		String[] color = new String[2];
		color[0] = "Chocolate";
		color[1] = "Brown";

		SweetDTO sweetDTO2 = new SweetDTO("DharwadPeda", "Karnataka", color, Shape.ROUND);
		System.out.println(sweetDTO2.getName());
		System.out.println(sweetDTO2.getPopularState());
		System.out.println(Arrays.toString(color));
		System.out.println(sweetDTO2.getShape());
		sweetDTO2.setPrice(250`);
		System.out.println(sweetDTO2.getPrice());
	}

}
