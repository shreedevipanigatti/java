
package com.xworkz.vtu.engineer;

	import com.xworkz.vtu.constants.Branch;

	public class ITCSEngineer extends Engineer {
		public Branch branch = Branch.TC;
		public final Branch branchE=Branch.EEE;

		public void problemSolving() {
			System.out.println("Problem solved by TC engineer");
			System.out.println(this.branch);
		}

	}
