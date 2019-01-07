package model;

public class Users {
   
	private int userId;
	private String AdhaarCard_Name;
	private String AdhaarCard_Number;
	private String Date_of_birth;
	private String UserName;
	private String User_Password;
	private String Retype_Password;
	private String Mobile_Number;
	private String Address;
	private String Gender;
	private int EntryFind;
	

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", AdhaarCard_Name=" + AdhaarCard_Name + ", AdhaarCard_Number="
				+ AdhaarCard_Number + ", Date_of_birth=" + Date_of_birth + ", UserName=" + UserName + ", User_Password="
				+ User_Password + ", Retype_Password=" + Retype_Password + ", Mobile_Number=" + Mobile_Number
				+ ", Address=" + Address + ", Gender=" + Gender + ", EntryFind=" + EntryFind + "]";
	}
	
	
	

}

