package com.xworkz.method;

import com.xworkz.method.theater.Customer;

	public class InstanceTester {
		
		public static void main(String[] args) {
			
			
			Customer customer=new Customer();
			String name=customer.getName();
			customer.setName("Shree");
			System.out.println(customer.getName());
		}

	}


