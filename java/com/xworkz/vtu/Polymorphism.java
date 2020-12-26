package com.xworkz.vtu;

	import com.xworkz.vtu.engineer.CSEngineer;
	import com.xworkz.vtu.engineer.Engineer;
	//import com.xworkz.vtu.engineer.TCEngineer;

	public class Polymorphism {

		public static void main(String[] args) {
				Engineer engineer=new CSEngineer();
				//Engineer engineer1=new TCEngineer();
				
				engineer.problemSolving();
			//	engineer1.problemSolving();

		}

	}
