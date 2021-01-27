package com.xworkz.licence.dao;

import com.xworkz.licence.constants.VehicleType;
import com.xworkz.licence.dto.LicenceDTO;

public interface LicenceDAO {
	public void save(LicenceDTO dto);

	boolean deleteByIdProofNo(String idProof);

	LicenceDTO findByIdProofNo(String idProofNo);

	boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type);

}
