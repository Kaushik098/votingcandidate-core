package validator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import dao.UserRegisterDAO;
import model.Register;
import util.ConnectionUtil;

public class RegisterValidator {

	public void validate(Register register) throws SQLException{
		  	   
		  
		   Connection conn = ConnectionUtil.getConnection();

		   int count =0;
		   String usernameCheckCopy="", passwordCheckCopy="";
    // Validate 
			String adhaarCard_Numuber = register.getAdhaarCard_Number();
	        String mobileNumber = register.getMobile_Number();
	        String dob = register.getDate_of_birth();
	        
	        
	        String day = dob.substring(0, 2);
	        String month = dob.substring(3, 5);
	        String year = dob.substring(6);
	        int yearOfDOB = Integer.parseInt(year);
	        
	      //Checking username and password  
	        String usernameQuery = "SELECT COUNT(*) FROM uservote_db WHERE UserName = ?"; 
            PreparedStatement  preparestatement1 = conn.prepareStatement(usernameQuery);
            preparestatement1.setString(1, register.getUserName());
            ResultSet result1 = preparestatement1.executeQuery();
      
          
             while(result1.next())
             {
            	 usernameCheckCopy = result1.getString(1);
             }
          //  System.out.println(usernameCheckCopy);
            
            String passwordQuery = "SELECT COUNT(*) FROM uservote_db WHERE User_Password = ?"; 
            PreparedStatement  preparestatement2 = conn.prepareStatement(passwordQuery);
            
            preparestatement2.setString(1, register.getUser_Password());
            
            ResultSet result2 = preparestatement1.executeQuery();
	        
            while(result2.next()){
           	      passwordCheckCopy = result2.getString(1);
            }
            int val1 = Integer.parseInt(usernameCheckCopy);
            int val2 = Integer.parseInt(passwordCheckCopy);
            
            System.out.println(val1+" "+val2);
            
            if(val1 >= 1) {
            	System.out.println("Username already Exists, please change and try");
            	count++;
            }
            
            if(val2 >= 1){
            	System.out.println("Password already exists, please change and try");
            	count++;
            }
	        
	// Checking Adhaar Card Digits		
		
			if(adhaarCard_Numuber.length() != 12){
				   System.out.println("Enter Valid Adhaar Card Number");
		           count++;
			}
			
	// Checking year 
			 if( yearOfDOB >2000 )
			 {
				 System.out.println("Only above 18 age persons are eligible");
				 count++;
			 }
		
	// Checking Password 		
					if((!Pattern.matches("[a-zA-Z]{8,}+[0-9]{1,}", register.getUser_Password()))){
						  System.out.println("Please enter valid password");
						  count++;
					  }	
			
	// Checking Mobile Number
					
					if(mobileNumber.length() != 10){
						System.out.println("Please enter valid 10 digit mobile number");
						count++;
					}
		  
		 			
					System.out.println(count);
					
					if(count==0){ 	    
			   			System.out.println("Welcome");  
						UserRegisterDAO registerDAO = new UserRegisterDAO();
					    registerDAO.insertUserToDB(register);			   
		           }
					else{
						System.out.println("Enter Valid Details");
					}
			   
	}
}

