package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Users;
import util.ConnectionUtil;

public class UsersListDAO {

	public void getUserEntries() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = ConnectionUtil.getConnection();
		Users user = new Users();
		
		String data = "SELECT * FROM uservote_db";
		PreparedStatement prepare = conn.prepareStatement(data);
		ResultSet resultset = prepare.executeQuery();
		
     while(resultset.next())	
	    System.out.println(resultset.getString(1)+ " "+resultset.getString(2)+" "+ resultset.getString(3)+" "+resultset.getString(4)+" "+resultset.getString(5)+" "+resultset.getString(6)+" "+resultset.getString(7)+" "+resultset.getString(8)+" "+resultset.getString(9)+" "+resultset.getString(10)+" "+resultset.getString(11) );
     
	}
	
}
