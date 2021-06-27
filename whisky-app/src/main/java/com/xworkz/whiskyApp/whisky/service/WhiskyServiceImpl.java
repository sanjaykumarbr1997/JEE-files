package com.xworkz.whiskyApp.whisky.service;

import com.xworkz.whiskyApp.whisky.dao.WhiskyDAO;
import com.xworkz.whiskyApp.whisky.dao.WhiskyDAOImpl;
import com.xworkz.whiskyApp.whisky.dto.WhiskyDTO;

public class WhiskyServiceImpl implements WhiskyService {
	
	private WhiskyDAO wDAO;
	public WhiskyServiceImpl() {
		
		wDAO = new WhiskyDAOImpl();

	}

	@Override
	public void validateAndSave(WhiskyDTO wDTO) {
		wDAO.save(wDTO);

	}

}
