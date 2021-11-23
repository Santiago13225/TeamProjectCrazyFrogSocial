package TeamProject;
package loginFunctionality;
package Post;
package Settings;
package TeamProject;


//Instance Variables
public class User{
    private int userID;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber; //string best to include dashes/spaces if user enters that
    private boolean Premium;
    private boolean showAds;

    //Constructor
    User(String UserName, String password, String email, String phoneNumber){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        showAds = true;
    }
    public void premiumBenefits(public Premium){
        if(Premium){
            showAds = false;
        }
    }

    //Setter Variables.
    public void setUserName(String userName){
        this.userName = username;
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
        return username;
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
