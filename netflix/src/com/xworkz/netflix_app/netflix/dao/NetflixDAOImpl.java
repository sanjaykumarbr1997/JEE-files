package com.xworkz.netflix_app.netflix.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.netflix_app.netflix.dto.NetflixDTO;
import com.xworkz.singleton.HibernateUtil;


public class NetflixDAOImpl implements NetflixDAO  {


	SessionFactory sessionFactory=null;
	Session session =null;
	public void save(NetflixDTO dto) {
		
		Transaction transaction =null;
		try {	
		sessionFactory=HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
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
			sessionFactory.close();
			}	
		}	
	}
	@Override
	public List<NetflixDTO> fetch() throws ClassNotFoundException, SQLException{
		List<NetflixDTO> ntfDTOs= new ArrayList<>();
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbn","root","dontknow");
			statement = connection.createStatement();
			ResultSet resultSet =statement.executeQuery("select*from fbn.netflix_table");
			
			while(resultSet.next()) {
				
				NetflixDTO nfxDTO = new NetflixDTO();
				
				nfxDTO.setId(resultSet.getInt("netflix_id"));
				nfxDTO.setName(resultSet.getString("netflix_name"));
				nfxDTO.setType(resultSet.getString("netflix_type"));
				nfxDTO.setRatings(resultSet.getString("netflix_ratings"));
				nfxDTO.setReleaseYear(resultSet.getString("netflix_releaseYear"));
				ntfDTOs.add(nfxDTO);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			statement.close();
			connection.close();
			}
			
		return ntfDTOs;
	
	}
}
