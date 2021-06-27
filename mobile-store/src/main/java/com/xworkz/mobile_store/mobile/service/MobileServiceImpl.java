package com.xworkz.mobile_store.mobile.service;

import com.xworkz.mobile_store.mobile.dao.MobileDAO;
import com.xworkz.mobile_store.mobile.dao.MobileDAOImpl;
import com.xworkz.mobile_store.mobile.dto.MobileDTO;

public class MobileServiceImpl implements MobileService {
	private MobileDAO mbDAO;
	
	public MobileServiceImpl() {
		mbDAO= new MobileDAOImpl();
	}

	@Override
	public void validateAndSave(MobileDTO mDTO) {
		if(mDTO!=null) {
			mbDAO.save(mDTO);
		}

	}

}
