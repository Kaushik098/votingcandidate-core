package test;

import java.sql.SQLException;


import dao.CandidateAddDAO;
import model.AddCandidate;

public class CandidateAddTest {

	public static void main(String args[]) throws SQLException{
		 
		AddCandidate add  = new AddCandidate();
		
		add.setCandidateId(1814);
		add.setCandidateName("Rohit Sharma");
		add.setCandidatePosition("Cricketer");
		add.setCandidatePollCount(0);
		
		CandidateAddDAO candidate = new CandidateAddDAO();
		candidate.addCandidate(add);
		
	}
}
