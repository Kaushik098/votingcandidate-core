package test;

import java.sql.SQLException;

import dao.CastVoteDAO;

public class CastTest {

	 public static void main(String args[]) throws SQLException{
		  
		 int voteID = 1800;
		 
		 CastVoteDAO vote = new CastVoteDAO();
		 vote.addVoteCount(voteID);
		 
	//	 System.out.print(vote+" row affected");
		 
		 System.out.println("Thanks for Voting");
	 }
}
