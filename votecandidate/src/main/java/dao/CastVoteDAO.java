package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.ConnectionUtil;

public class CastVoteDAO {

	public int addVoteCount(int voteID) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = ConnectionUtil.getConnection();
		
		String value = "SELECT CandidatePollCount FROM PollCount WHERE CandidateID ="+ voteID;
		PreparedStatement prepare = conn.prepareStatement(value);
		ResultSet resultset = prepare.executeQuery();
		
		int count=0;
		if(resultset.next())
			count = Integer.parseInt(String.valueOf(resultset.getString(1)));  
		
		count++;
		
		System.out.println(count);
		
		String value2 = "UPDATE PollCount SET CandidatePollCount ="+count +" WHERE CandidateID ="+ voteID;
	    PreparedStatement prepare2 = conn.prepareStatement(value2);
	    int result = prepare2.executeUpdate();
	    
	  //  System.out.println(result+ "row affected");
	    
	    return result;
	}

}
