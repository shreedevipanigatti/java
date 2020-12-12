package com.xworkz.dtObject.DTO;


import com.xworkz.dtObject.DTO.hospital.Hospital;
import com.xworkz.dtObject.AppointmentDTO;

public class HospitalTester {

	public static void main(String[] args) {
		Hospital hospital=new Hospital("SDM","Dhawad");
		
		hospital.appointment("Shruthi", 9840056791l, 87, "EyeCheckup", "Dr.Priya");
		
		AppointmentDTO appointment=hospital.getAppointmentDTO();
		System.out.println("patient name " +appointment.getPatientName());
		System.out.println("mobile number "+appointment.getMobileNumber());
		System.out.println("doctor name "+appointment.getDoctorName());
		

	}

}
