package com.xworkz.festival.festivals.dao;

import java.util.List;

import com.xworkz.festival.festivals.dto.FestivalDTO;

public interface FestivalDAO {

	void save(FestivalDTO fDTO);

	List<FestivalDTO> getAllDetails();

}
