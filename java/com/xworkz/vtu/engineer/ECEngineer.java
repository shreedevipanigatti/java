
	package com.xworkz.vtu.engineer;

	import com.xworkz.vtu.constants.Branch;

	public class ECEngineer extends Engineer{
	     public Branch branch=Branch.EC;
	     public void problemSolving() {
	 		System.out.println("problem solved by EC");
	 		System.out.println("branch is"+this.branch);
	 	}
	     
	     public final void electricWork() {
	    	 System.out.println("electric work method");
	     }
	     
	 	public Branch getBranch() {
	 		return branch;
	 	}
	 	
	 	public Branch getParentBranch() {
	 		return super.branch;
	 	}
	 	
	}
