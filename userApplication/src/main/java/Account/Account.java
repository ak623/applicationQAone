package Account;

public class Account {
	
	String firstName;
	String sureName;
	
	public void AccountManagement(String firstName, String sureName) {
		this.firstName = firstName;
		this.sureName = sureName;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", sureName=" + sureName + "]";
	}


	
}
