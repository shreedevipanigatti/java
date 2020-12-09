package com.xworkz.dtObject;
	
import com.xworkz.dtObject.DTO.CustomerDTO;

	public class DTOTester {

		public static void main(String[] args) {
			
			CustomerDTO customerDTO=new CustomerDTO();
			customerDTO.setName("Shree");
			customerDTO.setCustomerId(1345);
			customerDTO.setContactNo(76543235690L);
			customerDTO.setEmail("shree@gmail.com");
			
			System.out.println(customerDTO.getName());
			System.out.println(customerDTO.getCustomerId());
			System.out.println(customerDTO.getContactNo());
			System.out.println(customerDTO.getEmail());
			System.out.println(" ");
			
			CustomerDTO customerDTO2=new CustomerDTO();
			customerDTO2.setName("Sahana");
			customerDTO2.setCustomerId(4567);
			customerDTO2.setContactNo(76789543L);
			customerDTO2.setEmail("sahana@gmail.com");
			
			System.out.println(customerDTO2.getName());
			System.out.println(customerDTO2.getCustomerId());
			System.out.println(customerDTO2.getContactNo());
			System.out.println(customerDTO2.getEmail());
			System.out.println(" ");
			
			CustomerDTO customerDTO3=new CustomerDTO();
			customerDTO3.setName("Sushma");
			customerDTO3.setCustomerId(3765);
			customerDTO3.setContactNo(78901467456L);
			customerDTO3.setEmail("sushma@gmail.com");
			
			System.out.println(customerDTO3.getName());
			System.out.println(customerDTO3.getCustomerId());
			System.out.println(customerDTO3.getContactNo());
			System.out.println(customerDTO3.getEmail());
		}

	}


