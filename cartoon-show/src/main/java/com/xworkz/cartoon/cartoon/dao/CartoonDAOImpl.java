package com.xworkz.cartoon.cartoon.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.cartoon.cartoon.dto.CartoonDTO;
import com.xworkz.singleton.HibernateUtil;

public class CartoonDAOImpl implements CartoonDAO {

	public void save(CartoonDTO cartDTO) {
		Session session = null;
		Transaction transaction=null;
		
		
		try {
		session =HibernateUtil.getSessionFactory().openSession();
		transaction=session.beginTransaction();
		session.save(cartDTO);
		transaction.commit();
		}
		catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}
	
	
	
	

}
