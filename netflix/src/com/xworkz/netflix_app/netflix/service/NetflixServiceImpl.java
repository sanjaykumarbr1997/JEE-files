package com.xworkz.netflix_app.netflix.service;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.netflix_app.netflix.dao.NetflixDAO;
import com.xworkz.netflix_app.netflix.dao.NetflixDAOImpl;
import com.xworkz.netflix_app.netflix.dto.NetflixDTO;


public class NetflixServiceImpl implements NetflixService {
	
	private NetflixDAO nDAO;

	public NetflixServiceImpl() {
		nDAO = new NetflixDAOImpl();
	}
	

	@Override
	public void validateAndSave(NetflixDTO dto) {
		if(dto!=null) {
			nDAO.save(dto);
		}
		else {
			System.out.println("dto cant be null");
		}

	}


	@Override
	public List<NetflixDTO> validateAndFetch() throws ClassNotFoundException, SQLException {
		
		return nDAO.fetch();
	}

}
