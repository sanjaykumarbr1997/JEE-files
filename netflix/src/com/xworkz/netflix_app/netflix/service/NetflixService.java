package com.xworkz.netflix_app.netflix.service;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.netflix_app.netflix.dto.NetflixDTO;



public interface NetflixService {

	public void validateAndSave(NetflixDTO dto);
	public List<NetflixDTO> validateAndFetch() ;

}
