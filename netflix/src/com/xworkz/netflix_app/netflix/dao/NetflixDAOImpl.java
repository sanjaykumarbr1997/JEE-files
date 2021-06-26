package com.xworkz.netflix_app.netflix.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.xworkz.netflix_app.netflix.dto.NetflixDTO;
import com.xworkz.singleton.HibernateUtil;

public class NetflixDAOImpl implements NetflixDAO  {

	
	public void save(NetflixDTO dto) {
		Session session =null;
		
		Transaction transaction =null;
		try {	
		session = HibernateUtil.getSessionFactory().openSession();
		transaction= session.beginTransaction();
		session.save(dto);
		transaction.commit();
		
		}catch (HibernateException e) {
			if(transaction!=null) {
			transaction.rollback();
			}
		}
		finally{
			if(session!=null) {
			session.close();
			}	
		}	
	}
	@Override
	public List<NetflixDTO> fetch() {
		Session session =null;
		String hql = "select dto from NetflixDTO dto";
		
		try {
			return HibernateUtil.getSessionFactory().openSession().createQuery(hql).list();
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
		
		
		
		
		return null;
	
	}
}
