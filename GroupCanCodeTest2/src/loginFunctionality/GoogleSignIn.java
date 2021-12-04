package loginFunctionality;

public class GoogleSignIn implements Login {
	
	private String username;
	private String password;
	boolean LoginSuccess = false;
	

	public void LoginMethod() {
		System.out.println("Login.java works!");
		System.out.println("Login method used: Google");
	}
	
	public GoogleSignIn() {
		System.out.println("Google login test successful!");
	}
	
	public GoogleSignIn(String username, String password) {
		System.out.println("Google login successful!");
		System.out.println("Username used: " + username);
		System.out.println("Password used: " + password);
	}
	
	public void authenticate() {
		System.out.println("Authentication successful!");
		LoginSuccess = true;
	}
	
}
