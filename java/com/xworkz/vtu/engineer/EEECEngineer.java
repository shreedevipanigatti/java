package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class EEECEngineer extends ECEngineer {

	private Branch branch = Branch.EEE;

	public void problemSolving() {

		super.problemSolving();
		System.out.println("problem solved by EE");
		// System.out.println("branch is"+this.branch);
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {

		return super.branch;
	}
}
