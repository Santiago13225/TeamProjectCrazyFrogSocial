package Chris;

import User.User;
//helper class for User Class
class Singleton {
    // Static variable single_instance of type Singleton
    private static Singleton single_instance = null;
 
    // Declaring a variable of type String
    public User user;
 
    // Constructor of this class
    // Here private constructor is used to
    // restrict this class to itself
    private Singleton()
    {
        loggedInUser = new User();
    }
 
    // Method
    // Static method to create instance of Singleton class
    public static Singleton Singleton()
    {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
public class LoggedInUser extends User implements Login{
    public Singleton loggedInUser;

    public void LoginMethod(String UserName, String password, String email, String phoneNumber, boolean premium){
        //create a Singleton instance 
        loggedInUser = Singleton.Singleton();
        //initialize the Singleton's data
        userInit(UserName,password,email,phoneNumber,premium);
    }

    //helper method for log in
    private void userInit(String UserName, String password, String email, String phoneNumber, boolean premium){
        loggedInUser.user.setUserName(UserName);
        loggedInUser.user.setPassword(password);
        loggedInUser.user.setEmail(email);
        loggedInUser.user.setPremiumEnabled(premium);
    }
    public void authenticate(){

    }
}