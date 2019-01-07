package model;

public class Login {

	private String username;
	private String password;
	private String adhaarCardNumber;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdhaarCardNumber() {
		return adhaarCardNumber;
	}
	public void setAdhaarCardNumber(String adhaarCardNumber) {
		this.adhaarCardNumber = adhaarCardNumber;
	}
	
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", adhaarCardNumber=" + adhaarCardNumber
				+ "]";
	}
	
}
