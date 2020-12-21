package com.xworkz.dto2;

import com.xworkz.dto2.ManagerDTO;

import java.util.Arrays;

import com.xworkz.dto2.Constants.Variants;
import com.xworkz.dto2.CarDTO;

public class CarShowRoom {

	private static final boolean False = false;
	private String name;
	private String location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;
	private CarDTO refOfCarDTO;

	public CarShowRoom() {
		System.out.println("CarShowRoom default constructor");
	}

	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.setLocation(location);
	}

	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("manager added, data is valid");
		} else {
			System.out.println("provide proper details,data is invalid");
		}
	}

	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
			System.out.println("manager added");
		} else {
			System.out.println("manager not added, data is invalid");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("manager is not there :: null");
		}
	}

	public void removeManager() {
		this.managerDTO = null;
	}

	public void updateManager(long contactNo) {
		if (contactNo > 0 && this.managerDTO != null) {
			this.managerDTO.setContactNo(contactNo);
			System.out.println("details are valid, updated contact number");
		} else {
			System.out.println("cannot update contact number,data is invalid");
		}

	}

	public void updateManager(String name) {
		if (name != null && this.managerDTO != null) {
			this.managerDTO.setName(name);
			System.out.println("details are valid, updated name");
		} else {
			System.out.println("cannot update name,data is invalid");
		}
	}

	public void addCar(CarDTO dto) {
		if (dto != null && this.currentIndex < 5) {
			System.out.println("we can add car");
			System.out.println("current index is " + this.currentIndex);
			this.cars[this.currentIndex] = dto;
			this.currentIndex++;
		} else {
			if (dto == null) {
				System.out.println("we cannot add an empty or null ");
			}
			if (dto != null) {
				System.out.println("cannot add more car, total  " + this.currentIndex);
			}
			System.out.println("current index : " + this.currentIndex);
		}
		System.out.println("car not added, data is invalid");
	}

	public void displayCars() {
		for (int i = 0; i < this.cars.length; i++) {
			CarDTO dto = this.cars[i];
			// System.out.println(dto);
			System.out.println(dto.getModel());
			System.out.println(dto.getPrice());
			System.out.println(dto.getVariant());
		}

	}

	public void updateCarVariant(Variants newVariant, int indexToUpdate) {
		if (newVariant != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("car is found at index " + indexToUpdate);
			System.out.println("updating variant " + newVariant);
			CarDTO cardto = this.cars[indexToUpdate];
			cardto.setVariant(newVariant);

		}
	}

	public void displayCarAtIndex(int indexToDisplay) {
		if (indexToDisplay >= 0 && indexToDisplay < 5) {
			System.out.println("Car At Index: " + indexToDisplay);
			CarDTO ref = this.cars[indexToDisplay];
			System.out.println(ref.getModel());
			System.out.println(ref.getPrice());
			System.out.println(ref.getVariant());
		}
	}

	public void displayCarByModel(String model) {
		if (model != null) {
			System.out.println("Searching for: " + model);
			boolean CarFound = false;
			for (int index = 0; index < this.cars.length; index++) {
				CarDTO refCarDTO = this.cars[index];
				// CarDTO refOfCarDTO;
				String localModel = refOfCarDTO.getModel();
				if (localModel.equals(model)) {
					System.out.println("Car is found");
					CarFound = true;

					// CarDTO refOfCarDTO1=this.cars[];
					System.out.println(refOfCarDTO.getModel());
					// System.out.println(refOfCarDTO1.getPrice());
					// System.out.println(refOfCarDTO1.getVariant());
				}
			}
		}
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
