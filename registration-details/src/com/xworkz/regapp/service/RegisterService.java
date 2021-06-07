package com.xworkz.regapp.service;

import com.xworkz.regapp.dto.RegisterDTO;

public interface RegisterService {
	
	public void validateAndSave(RegisterDTO dto);

}
