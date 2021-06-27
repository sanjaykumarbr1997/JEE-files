package com.xworkz.whiskyApp.whisky.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.singleton.HibernateUtil;
import com.xworkz.whiskyApp.whisky.dto.WhiskyDTO;

public class WhiskyDAOImpl implements WhiskyDAO {

	@Override
	public void save(WhiskyDTO wDTO) {
		Session session= null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(wDTO);
			transaction.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
			if(HibernateUtil.getSessionFactory()!=null) {
				HibernateUtil.getSessionFactory().close();
			}
		}

	}

}
