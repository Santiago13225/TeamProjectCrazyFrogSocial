package User;

public class SignUp{
	private String birthday,
					  email,
			       username,
			       password,
			    phonenumber;
	public SignUp()
    {
		/*
        verifyEmailAddress();
        grabUsername();
        grabPassword();
        grabPhoneNumber();
        // initialize birthday and enter birthday.
        verifyAge();
        */
    }
	public void verifyAge(String birthday) {
		this.birthday = birthday;
	}
	public void verifyEmailAddress(String email) {
		this.birthday = birthday;
	}

	public void grabUsername(String username) {
		this.username = username;
	}
	public void grabPassword(String password) {
		this.password = password;
	}
	public void grabPhoneNumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}
