package dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatement;

import model.AddCandidate;
import util.ConnectionUtil;

public class CandidateAddDAO {

	public void addCandidate(AddCandidate add) throws SQLException{
		
		Connection conn = ConnectionUtil.getConnection();
		
	//	System.out.print(add.getCandidateId());
		
		String query = "INSERT INTO PollCount (CandidateId,CandidateName, CandidatePollCount, CandidatePosition) VALUES(?,?,?,?)";		
		PreparedStatement prepare = (PreparedStatement) conn.prepareStatement(query);
		
		prepare.setInt(1, add.getCandidateId());
		prepare.setString(2, add.getCandidateName());
		prepare.setInt(3, add.getCandidatePollCount());
		prepare.setString(4, add.getCandidatePosition());
		
		int result = prepare.executeUpdate();
		
		
		System.out.println(result+ "Added");
		
	}
	
}
