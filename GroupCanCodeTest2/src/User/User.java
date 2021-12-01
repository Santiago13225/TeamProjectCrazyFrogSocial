package User;
//package loginFunctionality;
//package Post;
//package Settings;

import Dane.Observer;
import Dane.Subject;
import Dane.UserUpdatesFollowers;
import java.util.ArrayList;

public class User extends SignUp implements Observer{
    private int userID;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber; //string best to include dashes/spaces if user enters that
    private boolean Premium;
    private boolean showAds;
    private String post;
    private ArrayList<User> followingList = new ArrayList<>();
    //private ArrayList<User> followerList = new ArrayList<>();
    private UserUpdatesFollowers followerList = new UserUpdatesFollowers(this); //handling followers list

    //Constructor
    public User(){
        showAds = true;
        Premium = false;
    }
    public User(String userName, String password, String email, String phoneNumber){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        showAds = true;
        Premium = false;
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

    public void setPremium(boolean prem){
        this.Premium = prem;
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
    public void followUser(User subject){
        followingList.add(subject);           //user Follows subject(user)
        subject.followerList.userFollowsMe(this);  //update subject's follower list
    }
    @Override
    public void update(String userNamee) {
        System.out.println("friend made new post!");
    }
    public void followers(User subject){
        //display follows
    }
    public void makePost(String post){ //notifies followers of new post
        this.post = post;
        followerList.newPost(post);
    }

}
