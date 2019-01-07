package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Login;
import util.ConnectionUtil;

public class LoginDAO {

	public void checkUser(Login login) throws SQLException {
		// TODO Auto-generated method stub
		 Connection conn = ConnectionUtil.getConnection();
 
		 String usernameCheck = "SELECT UserName FROM uservote_db WHERE AdhaarCard_Number ="+ login.getAdhaarCardNumber();
		 PreparedStatement prepare1 = conn.prepareStatement(usernameCheck);
		 ResultSet resultset1 = prepare1.executeQuery();
		 
//		if(resultset1.next())
//			 System.out.print(resultset1.getString(1));
		 
		String usernameCopy = "" , passwordCopy = "";
		if(resultset1.next()) 
		        usernameCopy = String.valueOf(resultset1.getString(1));
		
        String passwordCheck = "SELECT User_Password FROM uservote_db WHERE AdhaarCard_Number ="+ login.getAdhaarCardNumber();		
		PreparedStatement prepare2 = conn.prepareStatement(passwordCheck);
		ResultSet resultset2 = prepare2.executeQuery();
		
		if(resultset2.next())
              passwordCopy = String.valueOf(resultset2.getString(1));
		
		//System.out.print(usernameCopy+" "+passwordCopy);
		
		if(usernameCopy.equals(login.getUsername()) && passwordCopy.equals(login.getPassword()))
				        System.out.print("Welcome "+ usernameCopy+", please cast your vote ");
		
					
	} 

}
