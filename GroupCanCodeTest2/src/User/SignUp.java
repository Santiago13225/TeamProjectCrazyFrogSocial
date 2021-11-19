package TeamProject;

public class SignUp extends User{

	private String birthday;

	public SignUp()
    {
        // call the superclass default constructor to
        // initialize username,password,emailaddress,phonenumber.
        super();
        // update values for email, username, password, phone number
        verifyEmailAddress();
        grabUsername();
        grabPassword();
        grabPhoneNumber();
        // initialize birthday and enter birthday.
        verifyAge();
        
    }

	public static void CreateAccount() {
		// get user input for username,password,birthday,email,phone
		Signup newAccount = new SignUp();
		// verify age is over 13
		// verify email is an email address
		// verify username is entered
		// verify password is entered
		// if all are verified then proceed with creating a new account by 
		// saving newAccount to database
	}
	
	public void verifyAge(birthday) {
		this.birthday = birthday;
	}
	public void verifyEmailAddress(email) {
		this.birthday = birthday;
	}

	public void grabUsername(username) {
		this.username = username;
	}
	
	public void grabPassword(password) {
		this.password = password;
	}
	public void grabPhoneNumber(phonenumber) {
		this.phone = phonenumber;
	}
	
}
