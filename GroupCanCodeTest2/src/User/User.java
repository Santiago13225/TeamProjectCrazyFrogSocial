package TeamProject;
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

    User(String UserName, String password, String email, String phoneNumber){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        showAds = true;
    }
    public void setPremiumEnabled(){
            showAds = false;
    }


}
