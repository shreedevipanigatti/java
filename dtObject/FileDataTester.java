package com.xworkz.dtObject;

import com.xworkz.dtObject.DTO.FileDTO;
import java.sql.Date;


public class FileDataTester {


public static void main(String[] args) {
	FileDTO fileDTO=new FileDTO();
	System.out.println(fileDTO.getName());
	System.out.println(fileDTO.getSize());
	System.out.println(fileDTO.getType());
	System.out.println(fileDTO.getCurrentDate());
	
	
	FileDTO fileDTO1=new FileDTO("Logo.jpg",234.11 );
	System.out.println(fileDTO1.getName());
	fileDTO1.setName("Family photo");
	System.out.println(fileDTO1.getName());
	System.out.println(fileDTO1.getSize());
	
	Date date=new Date();
	FileDTO fileDTO3=new FileDTO("Resume.pdf", "D://Documents", "PDF", 68.4, date);
	System.out.println(fileDTO3.getName());
	System.out.println(fileDTO3.getType());
	System.out.println(fileDTO3.getLocation());
	System.out.println(fileDTO3.getSize());
	System.out.println(fileDTO3.getCurrentDate());
	
	System.out.println("**************************************************");
	fileDTO3.setName("Report.doc");
	System.out.println(fileDTO3.getName());
	fileDTO3.setType("doc");
	System.out.println(fileDTO3.getType());
	fileDTO.setLocation("D://Project");
	System.out.println(fileDTO3.getLocation());
	
}
}
