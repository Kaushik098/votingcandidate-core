package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.Register;
import util.ConnectionUtil;

public class UserRegisterDAO {

public void insertUserToDB(Register register) throws SQLException {
		
		Connection conn = ConnectionUtil.getConnection();

		// TODO Auto-generated method stub
		String insertUser = "INSERT INTO uservote_db (AdhaarCard_Name, AdhaarCard_Number, Date_of_birth, UserName, User_Password, Retype_Password, Mobile_Number, Address, Gender, EntryFind) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		System.out.println(insertUser);
		PreparedStatement prepare = conn.prepareStatement(insertUser);

		// Adding the inputs to Prepared Statement
		prepare.setString(1, register.getAdhaarCard_Name());
		prepare.setString(2, register.getAdhaarCard_Number());
		prepare.setString(3, register.getDate_of_birth());
		prepare.setString(4, register.getUserName());
		prepare.setString(5, register.getUser_Password());
		prepare.setString(6, register.getRetype_Password());
		prepare.setString(7, register.getMobile_Number());
		prepare.setString(8, register.getAddress());
		prepare.setString(9, register.getGender());
		prepare.setInt(10, register.getEntryFind());

		//		System.out.println(user_pojo.getAdhaarCard_Name());
	
		int resultset = prepare.executeUpdate();

		System.out.print(resultset + " Added");

	} // end of method and SQL part

}
