package com.xworkz.bakery;

import com.xworkz.bakery.cake.Cake;
import com.xworkz.bakery.cake.HoneyCake;

public class TasteTester {

	public static void main(String[] args) {

		Cake cake = new Cake();
		cake.setFlavour("Chocolate");
		cake.setShape("Round");
		cake.setSize(1.0);

		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());

		cake.taste();

		HoneyCake honeyCake = new HoneyCake();

		honeyCake.setFlavour("Honey");
		honeyCake.setShape("Square");
		honeyCake.setSize(2.50);

		System.out.println(honeyCake.getFlavour());
		System.out.println(honeyCake.getShape());
		System.out.println(honeyCake.getSize());

		honeyCake.taste();
		System.out.println(honeyCake.isHoney());
	}

}

