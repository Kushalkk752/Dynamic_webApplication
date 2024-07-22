package com.demo_project.model;

import java.sql.*;

public class DAOServiceImpl implements DAOService {

	private Connection con;
	private Statement st;
	private ResultSet res;

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/june25","root","test");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			res = st.executeQuery("select * from login where email = '"+email+"' and password = '"+password+"'");
			return res.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void addRegistration(String name, String email, String mobile) {
		try {
			st.executeUpdate("insert into registration values('"+name+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateRegistartion(String name, String email) {
		try {
			st.executeUpdate("update registration set name = '"+name+"' where email = '"+email+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteRegistration(String name) {
		try {
			st.executeUpdate("delete from registration where name = '"+name+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ResultSet getAllRegistrations() {
		try {
			res = st.executeQuery("select * from registration");
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
