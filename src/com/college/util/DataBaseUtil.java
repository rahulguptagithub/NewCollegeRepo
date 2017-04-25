package com.college.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseUtil {

	public static Connection getConnection(){  
		Connection con =null;
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/institute","root","ramesh");  
		}catch(Exception e){
			System.out.println(e);
		}
		return con;
	} 
	
}
