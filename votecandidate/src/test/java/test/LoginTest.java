package test;

import java.sql.SQLException;


import dao.LoginDAO;
import model.Login;

public class LoginTest {
          
	  public static void main(String args[]) throws SQLException{
		  
		 Login login = new Login();
		 
		 login.setUsername("Manik");
		 login.setPassword("Manik001");
		 login.setAdhaarCardNumber("23412353255");
		 
		 LoginDAO loginUser = new LoginDAO();
		 loginUser.checkUser(login);
		  
	  }
}
