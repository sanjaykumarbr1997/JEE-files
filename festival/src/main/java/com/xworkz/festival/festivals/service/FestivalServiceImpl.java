package com.xworkz.festival.festivals.service;

import java.util.List;

import com.xworkz.festival.festivals.dao.FestivalDAO;
import com.xworkz.festival.festivals.dao.FestivalDAOImpl;
import com.xworkz.festival.festivals.dto.FestivalDTO;

public class FestivalServiceImpl implements FestivalService {
	
	private FestivalDAO fDAO;

	public FestivalServiceImpl() {
		fDAO = new FestivalDAOImpl();
	}

	public void validateAndSave(FestivalDTO fDTO) {
		if(fDTO!=null) {
			fDAO.save(fDTO);
		}
		
	}

	public List<FestivalDTO> getAllDetails() {
		return fDAO.getAllDetails();
	}

}
