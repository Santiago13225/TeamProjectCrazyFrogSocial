package EricShwayze.User;

public class MVCDriver{
    public static void main(String[] args){
        
        //Grab a user
        User model = retrieveUserFromDatabase();

        //Create a view to write user details
        UserView view = new UserView();

        UserController controller = new UserController(model, view);

        controller.updateView();

        //updating the data of the model
        controller.setUserName("notaracecar");

        controller.updateView();


        //Post Driver
        Post model2 = retrievePost();
        PostView view2 = new PostView();
        PostController controller2 = new PostController(model2, view2);

        controller2.updateView();

        //updating contents
        controller2.setPostDescription("Sike that was not my first post.");

        controller2.updateView();
    }

    private static User retrieveUserFromDatabase(){
        User user = new User();
        user.setUserName("racecar123");
        user.setPassword("Thisismypassword1");
        user.setEmail("racecarsgofast@gmail.com");
        user.setPhoneNumber("9161234567");
        return user;
    }

    private static Post retrievePost(){
        Post post = new Post();
        post.setPostID(123456);
        post.setPostDescription("This is my first post!");
        post.setPicture(999);
        return post;
    }
}