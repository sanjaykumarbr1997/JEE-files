package com.xworkz.regapp.service;

import com.xworkz.regapp.dao.RegisterDAO;
import com.xworkz.regapp.dao.RegisterDAOImpl;
import com.xworkz.regapp.dto.RegisterDTO;

public class RegisterServiceImpl implements RegisterService{
	
	private RegisterDAO rgDAO;
	
	public RegisterServiceImpl() {
		rgDAO = new RegisterDAOImpl();
		
	}

	@Override
	public void validateAndSave(RegisterDTO dto) {
		
		if(dto!= null) {
			
			{
				if(dto.getEmail()!= null) {
					
					rgDAO.save(dto);
				}
				else {
					System.out.println("invalid email");
				}
			}
		}
		else {
			System.out.println("Cant be null");
		}
	}

}
