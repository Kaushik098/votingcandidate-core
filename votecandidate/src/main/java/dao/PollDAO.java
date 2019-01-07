package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Poll;
import util.ConnectionUtil;

public class PollDAO {

	public void getPollEntries() throws SQLException{
		  
		Connection conn = ConnectionUtil.getConnection();
		Poll poll = new Poll();
		
		String data = "SELECT * FROM PollCount";
		PreparedStatement prepare = conn.prepareStatement(data);		
		ResultSet resultset = prepare.executeQuery();
		
       while(resultset.next())	
		    System.out.println(resultset.getString(1)+ " "+resultset.getString(2)+" "+ resultset.getString(3)+" "+resultset.getString(4) );
		
//		String pollCount = "SELECT CandidateId, CandidateName, CandidatePollCount, CandidatePosition FROM PollCount";
//		Statement statement = conn.createStatement();
//		ResultSet resultset = statement.executeQuery(pollCount);
//
//		while(resultset.next())
//			 System.out.println(resultset.getString(1)+ " "+resultset.getString(2)+" "+ resultset.getString(3)+" "+resultset.getString(4) );
       
	}
}
		



