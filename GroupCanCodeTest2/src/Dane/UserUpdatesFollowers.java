package Dane;

import User.User;

import java.util.ArrayList;

public class UserUpdatesFollowers implements Subject {
    private ArrayList<Observer> followerList = new ArrayList<>();
    private String message;

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
        followerList.forEach(observer -> observer.update());
    }

}