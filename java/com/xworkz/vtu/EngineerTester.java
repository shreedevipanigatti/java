package com.xworkz.vtu;

import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.ECEngineer;
import com.xworkz.vtu.engineer.EEECEngineer;
import com.xworkz.vtu.engineer.Engineer;
//import com.xworkz.vtu.engineer.ISEngineer;
import com.xworkz.vtu.engineer.ITCSEngineer;

public class EngineerTester {

	public static void main(String[] args) {
		/**
		 * creating object of Engineer class and retrieving all the variables and
		 * methods using ref
		 */

		Engineer engineer = new Engineer();
		System.out.println(engineer.USN);
		// System.out.println("parent branch"+engineer.getBranch());
		engineer.problemSolving();

		
		CSEngineer csEngineer = new CSEngineer();
		System.out.println(csEngineer.USN);
		System.out.println(csEngineer.getBranch());
		System.out.println("parent branch " + csEngineer.getParentBranch());
		csEngineer.problemSolving();

		Engineer engineer2 = new CSEngineer();
		engineer2.problemSolving();
		// System.out.println(engineer2.getBranch());


		// Engineer engineer3=new ISEngineer();
		// engineer3.problemSolving();
		// System.out.println(engineer3.getBranch());

		// ISEngineer isEngineer=new ISEngineer();
		// isEngineer.collectInfo();

		
		Engineer engineer4 = new ITCSEngineer();
		engineer4.problemSolving();
		// System.out.println(engineer4.getBranch());

		ECEngineer engineer5 = new ECEngineer();
		engineer5.problemSolving();
		System.out.println(engineer5.getParentBranch());
		engineer5.electricWork();

		EEECEngineer eeecEngineer = new EEECEngineer();
		eeecEngineer.problemSolving();
		System.out.println(eeecEngineer.getBranch());
		System.out.println(eeecEngineer.getParentBranch());
		eeecEngineer.electricWork();

	}

}
