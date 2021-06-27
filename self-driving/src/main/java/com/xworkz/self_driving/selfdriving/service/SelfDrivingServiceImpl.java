package com.xworkz.self_driving.selfdriving.service;

import com.xworkz.self_driving.selfdriving.dao.SelfDrivingDAO;
import com.xworkz.self_driving.selfdriving.dao.SelfDrivingDAOImpl;
import com.xworkz.self_driving.selfdriving.dto.SelfDrivingDTO;

public class SelfDrivingServiceImpl implements SelfDrivingService {
	private SelfDrivingDAO sDAO;
	
	public SelfDrivingServiceImpl() {
		sDAO = new SelfDrivingDAOImpl();
	}

	public void validateAndSave(SelfDrivingDTO sDTO) {
		sDAO.save(sDTO);
	}

}
