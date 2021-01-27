package com.xworkz.licence.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.licence.constants.VehicleType;
import com.xworkz.licence.dto.LicenceDTO;

public class LicenceDAOImpl implements LicenceDAO {
	private List<LicenceDTO> database;

	public LicenceDAOImpl() {
		this.database = new ArrayList<LicenceDTO>();
	}

	@Override
	public void save(LicenceDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenceDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo:" + idProofNo);
		for (LicenceDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();
			if (idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProof:" + idProof);
		System.out.println("type:" + type);
		LicenceDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update , license is found");
			dtoFromDB.setType(type);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;
	}

	@Override
	public boolean deleteByIdProofNo(String idProof) {
		LicenceDTO id = this.findByIdProofNo(idProof);
		if (id != null) {
			database.remove(idProof);
			System.out.println("removed");
			return true;
		} else {
			System.out.println("not removed");
			return false;
		}

	}

}
