package User;
//package loginFunctionality;
//package Post;
//package Settings;

public class User extends SignUp{
    private int userID;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber; //string best to include dashes/spaces if user enters that
    private boolean Premium;
    private boolean showAds;

    //Constructor
    public User(){}
    public User(String userName, String password, String email, String phoneNumber){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        showAds = true;
    }
    public void setPremiumEnabled(){
        showAds = false;
    }

    //Setter Variables.
    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //Getter Variables
    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public boolean getPremiumStatus(){
        return Premium;
    }

}
