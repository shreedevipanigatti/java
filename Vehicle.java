package com.xworkz.copies.constructor;

 public class Vehicle 
 {
private int mfgDate;
private String company;
private int chasisNo;
private String ownerName;
private String colour;


public Vehicle(int mfgDate,String company,int chasisNo) {
	this.mfgDate=mfgDate;
	this.company=company;
	this.chasisNo=chasisNo;
}


public int getMfgDate() {
	return mfgDate;
}


public String getCompany() {
	return company;
}


public int getChasisNo() {
	return chasisNo;
}


public void setColour(String colour) {
	this.colour = colour;
	System.out.println("vehicle colour is: "+colour);
}


public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
	System.out.println("company owner is: "+ownerName);
}



}


