package com.xworkz.mobile_store.mobile.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.mobile_store.mobile.dto.MobileDTO;
import com.xworkz.singleton.HibernateUtil;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public void save(MobileDTO mDTO) {
		Session session = null;
		Transaction transaction = null;
		
		try {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction= session.beginTransaction();
		session.save(mDTO);
		transaction.commit();
		}catch (HibernateException e) {
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
