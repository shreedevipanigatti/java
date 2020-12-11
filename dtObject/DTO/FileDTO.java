package com.xworkz.dtObject.DTO;

import java.util.Date;

 public class FileDTO {

		private String name;
		private double size;
		private String type;
		private String location;
		private Date createdDate;

		public FileDTO() {
			System.out.println("default const");
		}

		public FileDTO(String name, double size) {
			System.out.println("Created FileDTO");
			this.name = name;
			this.size = size;
		}

		public FileDTO(String name, double size, String type, String location, Date createdDate) {
			this.name = name;
			this.createdDate = createdDate;
			this.location = location;
			this.size = size;
			this.type = type;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSize(double size) {
			this.size = size;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}

		public String getName() {
			return name;
		}

		public double getSize() {
			return size;
		}

		public String getType() {
			return type;
		}

		public String getLocation() {
			return location;
		}

		public Date getCreatedDate() {
			return createdDate;
		}
 

 public static void main(String[] args) {
		FileDTO fileDTO=new FileDTO();
		System.out.println(fileDTO.getName());
		System.out.println(fileDTO.getSize());
		System.out.println(fileDTO.getType());
		//System.out.println(fileDTO.getCurrentDate());
		
		
		FileDTO fileDTO1=new FileDTO("Logo.jpg",234.11 );
		System.out.println(fileDTO1.getName());
		fileDTO1.setName("Family photo");
		System.out.println(fileDTO1.getName());
		System.out.println(fileDTO1.getSize());
		
		Date date=new Date();
		FileDTO fileDTO3=new FileDTO();
		System.out.println(fileDTO3.getName());
		System.out.println(fileDTO3.getType());
		System.out.println(fileDTO3.getLocation());
		System.out.println(fileDTO3.getSize());
		//System.out.println(fileDTO3.getCurrentDate());
		
		System.out.println("**************************************************");
		fileDTO3.setName("Report.doc");
		System.out.println(fileDTO3.getName());
		fileDTO3.setType("doc");
		System.out.println(fileDTO3.getType());
		fileDTO.setLocation("D://Project");
		System.out.println(fileDTO3.getLocation());
		
		

	}


}

