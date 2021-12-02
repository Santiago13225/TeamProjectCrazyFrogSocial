//Making it so the user's followers act as observers to user (updates them when a new post is made)
package Dane;
import User.User;
public class driver{
    public static void main(String[] args) {
        User user1 = new User("jack", "dskfsd", "jack@outlook.com", "915534232");
        User user2 = new User("daneski", "hfdsjoj432", "dane@hotmail.com", "432234432");
        User user3 = new User("willy wonka", "kohdsrjhjko", "willy@gmail.com", "213321321");

        user1.followUser(user2);
        user3.followUser(user2);
        user2.makePost("hello everyone, check this out!"); //notifies user1&user3 of daneski's post(user2)

        user2.followUser(user1);
        user3.followUser(user1);
        user1.makePost("This is my cool post!"); //notifies user2&user3 of jack's post(user1)


    }



}