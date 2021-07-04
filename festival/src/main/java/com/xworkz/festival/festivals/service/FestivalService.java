package com.xworkz.festival.festivals.service;

import java.util.List;

import com.xworkz.festival.festivals.dto.FestivalDTO;

public interface FestivalService {
	public void validateAndSave(FestivalDTO fDTO);

	public List<FestivalDTO> getAllDetails();

}
