package com.xworkz.cartoon.cartoon.service;

import com.xworkz.cartoon.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.cartoon.dto.CartoonDTO;

public class CartoonServiceImpl implements CartoonService {
	private CartoonDAO carDAO ;
	
	public CartoonServiceImpl() {
		carDAO = new CartoonDAOImpl();
	}

	public void validateAndSave(CartoonDTO cartDTO) {
		if(cartDTO!=null) {
			carDAO.save(cartDTO);
		}
	}
	
	
	
	

	

}
