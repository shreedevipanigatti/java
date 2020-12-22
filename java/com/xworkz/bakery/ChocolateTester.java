package com.xworkz.bakery;

import com.xworkz.bakery.chocolate.Chocolate;
import com.xworkz.bakery.chocolate.DairyMilk;

package com.xworkz.bakery;


import com.xworkz.bakery.chocolate.Chocolate;
import com.xworkz.bakery.chocolate.DairyMilk;

public class ChocolateTester {

	public static void main(String[] args) {

		Chocolate chocolate = new Chocolate();
		chocolate.setChocolateName("MilkyBar");
		chocolate.setPrice(40);
		chocolate.setShape("RectAngle");

		System.out.println(chocolate.getChocolateName());
		System.out.println(chocolate.getPrice());
		System.out.println(chocolate.getShape());

		chocolate.taste();
		
		DairyMilk dairyMilk = new DairyMilk();

		dairyMilk.setChocolateName("DairyMilk");
		dairyMilk.setPrice(50);
		dairyMilk.setShape("Square");

		System.out.println(dairyMilk.getChocolateName());
		System.out.println(dairyMilk.getPrice());
		System.out.println(dairyMilk.getShape());

		dairyMilk.taste();
		System.out.println(dairyMilk.isDairy());
	}



	}

	

	
