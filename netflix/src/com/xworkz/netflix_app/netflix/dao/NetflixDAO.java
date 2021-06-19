package com.xworkz.netflix_app.netflix.dao;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.netflix_app.netflix.dto.NetflixDTO;

public interface NetflixDAO {

	public void save(NetflixDTO dto);

	public List<NetflixDTO> fetch() throws ClassNotFoundException, SQLException;

}
