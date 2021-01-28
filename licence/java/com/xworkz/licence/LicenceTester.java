package com.xworkz.licence;

import java.util.Date;

import com.xworkz.licence.constants.BloodGroup;
import com.xworkz.licence.constants.Gender;
import com.xworkz.licence.constants.IDProof;
import com.xworkz.licence.constants.VehicleType;
import com.xworkz.licence.dao.LicenceDAOImpl;
import com.xworkz.licence.dto.AddressDTO;
import com.xworkz.licence.dto.CommonDTO;
import com.xworkz.licence.dto.LicenceDTO;

public class LicenceTester {

	public static void main(String[] args) {
		AddressDTO dto = new AddressDTO("shree", "NA", 810, "Shree Guru", "Hubli", "KA", 581118);
		System.out.println(dto);

		Date date = new Date();
		CommonDTO commonDTO = new CommonDTO("madhu", 22, date, 8197425810l, BloodGroup.O_POSITIVE, Gender.FEMALE);
		System.out.println(commonDTO);

		LicenceDTO licenseDTO = new LicenceDTO();
		licenseDTO.setIdProof(IDProof.ADHARCARD);
		licenseDTO.setIdProofNo("636 1076 3210");
		licenseDTO.setType(VehicleType.TWO_WHEELER);
		licenseDTO.setDisability(false);
		licenseDTO.setCommercial(false);
		System.out.println(licenseDTO);

		LicenceDAOImpl dao = new LicenceDAOImpl();
		dao.save(licenseDTO);
		System.out.println(" ");

		LicenceDTO id = dao.findByIdProofNo("636 1076 3210");
		System.out.println(id);
		System.out.println(" ");

		boolean update = dao.updateVehicleTypeByIdProofNo("636 1076 3210", VehicleType.THREE_WHEELER);
		System.out.println(update);
		System.out.println(" ");

		boolean delete = dao.deleteByIdProofNo("636 1076 3210");
		System.out.println(delete);
	}

}
