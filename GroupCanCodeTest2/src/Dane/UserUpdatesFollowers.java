package Dane;

import User.User;

import java.util.ArrayList;

public class UserUpdatesFollowers implements Subject {
    private ArrayList<Observer> followerList = new ArrayList<>();
    private String message;
    private String userName; //this user's list
    public UserUpdatesFollowers(User s){
        this.userName = s.getUserName();
    }
    public String getUserName(){
        return userName;
    }
    @Override
    public void userFollowsMe(Observer o){
        followerList.add(o);
    }

    @Override
    public void userUnfollowsMe(Observer o) {
        followerList.remove(o);
    }
    public void newPost(String message) {
        this.message = message;
        displayNewPostToAll();
    }
    @Override
    public void displayNewPostToAll(){
        followerList.forEach(observer -> observer.update(userName));
    }

}