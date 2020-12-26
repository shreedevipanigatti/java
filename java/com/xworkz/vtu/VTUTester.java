package com.xworkz.vtu;


	import com.xworkz.vtu.constants.Branch;
	import com.xworkz.vtu.engineer.CSEngineer;
	import com.xworkz.vtu.engineer.Engineer;
	//import com.xworkz.vtu.engineer.TCEngineer;

//	@SuppressWarnings("unused")
	public class VTUTester {
		
		

		public static void main(String[] args) {

			
			Engineer engineer = new Engineer();
			System.out.println(engineer.USN);
			System.out.println(engineer.branch);
			engineer.problemSolving();

			CSEngineer csEnginner = new CSEngineer();
			System.out.println(csEnginner.USN);
			System.out.println(csEnginner.getBranch());
			System.out.println(csEnginner.getParentBranch());
			csEnginner.problemSolving();

			Engineer engineer2 = new CSEngineer();
			System.out.println(engineer2.branch);
			CSEngineer csEnginner2 = (CSEngineer) engineer2;
			System.out.println(csEnginner.branch);
			engineer2.problemSolving();
			csEnginner.problemSolving();
			//TCEngineer tcEngineer = new TCEngineer();
			//System.out.println(tcEngineer.branch);
			//tcEngineer.problemSolving();
			//System.out.println(tcEngineer.branchE);
		//	tcEngineer.branchE = Branch.BIOTECH;
			//System.out.println(tcEngineer.branchE);

		}

	
}
