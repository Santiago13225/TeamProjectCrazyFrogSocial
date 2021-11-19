package TeamProject;

public class CrazyFrogSignIn implements Login {
	
	private String username;
	private String password;
	boolean LoginSuccess = false;
	

	public void LoginMethod() {
		System.out.println("Login.java works!");
		System.out.println("Login method used: CrazyFrogSignIn");
	}
	
	public CrazyFrogSignIn() {
		System.out.println("CrazyFrog login test successful!");
	}
	
	public CrazyFrogSignIn(String username, String password) {
		System.out.println("CrazyFrog login successful!");
		System.out.println("Username used: " + username);
		System.out.println("Password used: " + password);
	}
	
	public void authenticate() {
		System.out.println("Authentication successful!");
		LoginSuccess = true;
	}
	
}