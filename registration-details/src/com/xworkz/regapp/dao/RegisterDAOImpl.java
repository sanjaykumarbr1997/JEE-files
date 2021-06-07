package com.xworkz.regapp.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.xworkz.regapp.dto.RegisterDTO;

public class RegisterDAOImpl implements RegisterDAO   {

	@Override
	public void save(RegisterDTO dto) {
		Connection connection =null;
		PreparedStatement preparedStatement = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/fbn","root","dontknow");
			preparedStatement =connection.prepareStatement("insert into user_details values(?,?,?,?) ");
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, dto.getName());
			preparedStatement.setString(3,dto.getEmail());
			preparedStatement.setString(4,dto.getAge());	
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
