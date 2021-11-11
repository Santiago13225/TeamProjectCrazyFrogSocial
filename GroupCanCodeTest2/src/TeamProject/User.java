package TeamProject;

public class User{
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
    public static void premiumBenefits(public Premium){
        if(Premium){
            showAds = false;
        }
    }

}
