package com.xworkz.festival.festivals.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.festival.festivals.dto.FestivalDTO;
import com.xworkz.singleton.HibernateUtil;

public class FestivalDAOImpl implements FestivalDAO {

	public void save(FestivalDTO fDTO) {
		Session session = null;
		Transaction transaction = null;
		
		try {
			session= HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(fDTO);
			session.getTransaction().commit();
		}catch (HibernateException e) {
			if(session.beginTransaction()!=null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
			
		}
		
		
	}

	public List<FestivalDTO> getAllDetails() {
		Session session =null;
		Transaction transaction = null;
		try {
			return HibernateUtil.getSessionFactory().openSession().getNamedQuery("getAllDetails").list();
		}catch (HibernateException e) {
			if(session.beginTransaction()!=null) {
				session.getTransaction().rollback();
			}
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
		return null;
	}

}
