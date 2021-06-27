package com.xworkz.self_driving.selfdriving.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.self_driving.selfdriving.dto.SelfDrivingDTO;
import com.xworkz.singleton.HibernateUtil;

public class SelfDrivingDAOImpl implements SelfDrivingDAO {

	public void save(SelfDrivingDTO sDTO) {
		Session session = null;
		Transaction transaction = null;
		
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(sDTO);
			transaction.commit();
			
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
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
