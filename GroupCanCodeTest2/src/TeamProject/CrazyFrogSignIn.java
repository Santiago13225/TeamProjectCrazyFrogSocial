package TeamProject;

public class CrazyFrogSignIn implements Login {
	
	private String username;
	private String password;
	boolean LoginSuccess = false;
	
	public static void LoginMethod() {
		System.out.println("Login.java works!");
		System.out.println("CrazyFrogSignIn.java works!");
	}
	
	public void openCrazyFrogLogin() {
		System.out.println("CrazyFrog login successful!");
	}
	
	public void openCrazyFrogLogin(String username, String password) {
		System.out.println("CrazyFrog login successful!");
	}
	
	public void authenticate() {
		System.out.println("Authentication successful!");
		LoginSuccess = true;
	}
	
}
