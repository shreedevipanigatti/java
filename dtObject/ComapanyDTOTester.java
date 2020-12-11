package com.xworkz.dtObject;
import com.xworkz.dtObject.DTO.ComapanyDTO;


public class ComapanyDTOTester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComapanyDTO company=new ComapanyDTO();
		System.out.println(company.getName());
		System.out.println(company.getLocation());
		System.out.println("***************************");
		ComapanyDTO company2=new ComapanyDTO();
		System.out.println(company2.getCompanyId());
		System.out.println(company2.getName());
		System.out.println(company2.getLocation());
		System.out.println(company2.getType());
		System.out.println(company2.getWebSite());
		company2.setName("Wipro");
		System.out.println(company2.getName());
	}

}


