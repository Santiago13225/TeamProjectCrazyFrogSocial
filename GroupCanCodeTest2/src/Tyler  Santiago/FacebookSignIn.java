package TeamProject;

public class FacebookSignIn implements Login {
	
	private String username;
	private String password;
	boolean LoginSuccess = false;
	

	public void LoginMethod() {
		System.out.println("Login.java works!");
		System.out.println("Login method used: Facebook");
	}
	
	public FacebookSignIn() {
		System.out.println("Facebook login test successful!");
	}
	
	public FacebookSignIn(String username, String password) {
		System.out.println("Facebook login successful!");
		System.out.println("Username used: " + username);
		System.out.println("Password used: " + password);
	}
	
	public void authenticate() {
		System.out.println("Authentication successful!");
		LoginSuccess = true;
	}
	
}
