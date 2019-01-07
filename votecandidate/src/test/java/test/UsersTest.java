package test;

import java.sql.SQLException;


import dao.UsersListDAO;
import model.Users;

public class UsersTest {

	 public static void main(String args[]) throws SQLException{
		   		  
		  UsersListDAO userEntries = new UsersListDAO();
		  userEntries.getUserEntries();  
		  
		 
		//  System.out.print(getUserEntries);  
	 }
}
