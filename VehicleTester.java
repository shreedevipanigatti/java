package com.xworkz.copies.constructor;
import com.xworkz.copies.constructor.Vehicle;
public class VehicleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Vehicle vehicle;
		
  Vehicle vehicle1=new Vehicle(1983,"Kenichi Ayukawa",24565);
		
  int mfgDate=vehicle1.getMfgDate();
	String company=vehicle1.getCompany();
	int num=vehicle1.getChasisNo();
	System.out.println(mfgDate);
	System.out.println(company);
	System.out.println(num);
	
	String colour="white";
	vehicle1.setColour(colour);
	
	String owner="Kenichi Ayukawa";
	vehicle1.setOwnerName(owner);

}
}