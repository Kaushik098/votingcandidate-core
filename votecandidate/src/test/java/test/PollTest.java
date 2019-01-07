package test;

import java.sql.SQLException;


import dao.PollDAO;
import model.Poll;


public class PollTest {
      
	public static void main(String args[]) throws SQLException{
    	    
    	  PollDAO pollEntries = new PollDAO();
    	  pollEntries.getPollEntries();
    	  
    	  //System.out.print(poll);
      }
}
