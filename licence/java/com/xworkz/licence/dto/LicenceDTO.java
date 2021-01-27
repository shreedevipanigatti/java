package com.xworkz.licence.dto;

import com.xworkz.licence.constants.IDProof;
import com.xworkz.licence.constants.VehicleType;

public class LicenceDTO extends CommonDTO {
	private IDProof idProof;
	private String idProofNo;
	private VehicleType type;
	private boolean disability;
	private boolean commercial;

	public LicenceDTO() {
		super();
		System.out.println("Invoked LicenceDTO Constructor ");
	}

	public LicenceDTO(IDProof idProof, String idProofNo, VehicleType type, boolean disability, boolean commercial) {
		super();
		this.idProof = idProof;
		this.idProofNo = idProofNo;
		this.type = type;
		this.disability = disability;
		this.commercial = commercial;
	}

	@Override
	public String toString() {
		return "LicenceDTO [idProof=" + idProof + ", idProofNo=" + idProofNo + ", type=" + type + ", disability="
				+ disability + ", commercial=" + commercial + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is null");
			return false;
		}
		if (obj instanceof LicenceDTO) {
			LicenceDTO converted = (LicenceDTO) obj;

			if (this.idProofNo != null && this.idProofNo.equals(converted.getIdProofNo())) {
				return true;
			}
		}
		return false;
	}

	public IDProof getIdProof() {
		return idProof;
	}

	public void setIdProof(IDProof idProof) {
		this.idProof = idProof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

}
