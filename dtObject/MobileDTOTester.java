package com.xworkz.dtObject;

import com.xworkz.dtObject.DTO.MobileDTO;

public class MobileDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileDTO mobileDto = new MobileDTO("OPPO");
		System.out.println(mobileDto.getName());
		mobileDto.setName("VIVO");
		System.out.println(mobileDto.getName());

		MobileDTO mobileDto1 = new MobileDTO("Gold", "16GB", 2000, 20000);
		System.out.println(mobileDto1.getColor());
		System.out.println(mobileDto1.getBatteryCapacity());
		System.out.println(mobileDto1.getStorage());
		System.out.println(mobileDto1.getPrice());

	}

}
