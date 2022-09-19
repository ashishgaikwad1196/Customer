package com.newjdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
			
			PreparedStatement pst=con.prepareStatement("insert into employee (username,passworad) values (?,?) ");
			
			pst.setString(1, "admin");
			pst.setString(2, "admins");
			
			int i= pst.executeUpdate();
			
			System.out.println(" record inserted"+i);
			
			con.close();
			pst.close();
			
		}
		catch (Exception e) {
			e.getMessage();
		}
	}

}
