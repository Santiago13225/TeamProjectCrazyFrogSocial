//Making it so the user's followers act as observers to user (updates them when a new post is made)
package Dane;
import User.User;
public class driver{
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.followUser(user2);
        user2.makePost("hello");


    }



}