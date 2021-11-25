package Dane;
public interface FollowersSubject {
    public void followPerson(UserObserver me);    //want to receive updates from this person
    public void UnfollowPerson(UserObserver  me); //not wanting updates from person anymore
    public void notifyUserOfPost();
}