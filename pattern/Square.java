package com.xworkz.pattern;

public class Square {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.println("*");
				} else {
					System.out.println(" ");
				}
			}
			System.out.println();

		}
	}

}
