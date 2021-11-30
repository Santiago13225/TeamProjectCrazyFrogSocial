package Dane;
public interface Subject {
    public void userFollowsMe(Observer  me);  //person follows user and wants to receive updates from
    public void userUnfollowsMe(Observer me); //person no longer follows user and no longer is an observer
    public void displayNewPostToAll();
}