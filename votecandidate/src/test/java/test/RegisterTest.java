package test;

import java.sql.SQLException;

import dao.UserRegisterDAO;
import model.Register;
import validator.RegisterValidator;

public class RegisterTest {

	 public static void main(String args[]) throws SQLException{
		  
		    Register register = new Register();
		 
		    register.setAdhaarCard_Name("Mohit");
			register.setAdhaarCard_Number("101010102022");
			register.setDate_of_birth("10/10/2000");
			register.setUserName("Mohit");
			register.setUser_Password("abcdefgh006");
			register.setRetype_Password("abcdefgh006");
			register.setMobile_Number("9900022990");
			register.setAddress("SAP COLONY");
			register.setGender("Male");
			register.setEntryFind(0);
			
			//System.out.print(register);
		    RegisterValidator validateUser = new RegisterValidator();
		    validateUser.validate(register);
			 
		    
		  }
			
		  
	 }

