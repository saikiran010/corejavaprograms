package junit;

public class LoginCheck {

	String userName,password;

	public void setCredentials(String u,String p) {
		userName=u;
		password=p;
	}

	@Override
	public String toString() {
		return "LoginCredentials \nuserName=" + userName + "\n password=" + password + "]";
	}
	
	boolean check() {
		if(userName=="admin" && password=="admin123") 
			return true;
		else
			return false;
	}
}
