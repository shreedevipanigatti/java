package com.xworkz.sports;

    import com.xworkz.sports.computer.Computer;
	import com.xworkz.sports.computer.Desktop;
	import com.xworkz.sports.computer.Laptop;
	import com.xworkz.sports.constants.DevicesAttached;

	public class ComputerTester {

		public static void main(String[] args) {
			Computer computer=new Desktop();
			
			Desktop processor=(Desktop)computer;
			
			processor.display();
			processor.setCompanyName("DELL");
			System.out.println(processor.getCompanyName());
			processor.setDeviceAttached(DevicesAttached.MOUSE);
			System.out.println(processor.getDeviceAttached());
			processor.setTheme("Dark");
			System.out.println(processor.getColor());
			processor.setSize("Medium");
			System.out.println(processor.getSize());
			processor.turnOn();
			
			
			
			Computer computer1=new Laptop();
			
			Laptop laptop=(Laptop)computer1;
			
			laptop.connectsToPhone();
			System.out.println(laptop.getCompanyName());
			laptop.setProcessor("RYZEN");
			System.out.println(laptop.getProcessor());
		}

	}


