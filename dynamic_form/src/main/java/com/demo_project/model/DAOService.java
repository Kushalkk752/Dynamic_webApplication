package com.demo_project.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyLogin(String email, String password);
	public void addRegistration(String name, String email, String mobile);
	public void updateRegistartion(String name, String email);
	public void deleteRegistration(String name);
	public ResultSet getAllRegistrations();
}
