package com.xworkz.dto2;

import com.xworkz.dto2.ManagerDTO;
import com.xworkz.dto2.CarShowRoom;

public class ShowRoomTester {

	public static void main(String[] args) {
		CarShowRoom carShowRoom=new CarShowRoom();
		carShowRoom.addManager("Priya", 7056786525l);
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.displayManager();
		
		ManagerDTO dto=new ManagerDTO("Nanda", 720432);
		carShowRoom.addManager(dto);
		carShowRoom.displayManager();
		carShowRoom.updateManager(9657790403l);
		carShowRoom.updateManager("Prabha");
		carShowRoom.displayManager();
	}

}
