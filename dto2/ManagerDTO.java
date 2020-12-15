package com.xworkz.dto2;

public class ManagerDTO {

	private String name;
	private long contactNo;

	public ManagerDTO() {
		System.out.println("Manager default Const");
	}

	public ManagerDTO(String name, long contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public long getContactNo() {
		return contactNo;
	}

}
