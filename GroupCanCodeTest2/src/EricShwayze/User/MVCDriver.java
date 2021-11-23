public class MVCDriver{
    public static void main(String[] args){
        
        //Grab a user
        User model = new retrieveUserFromDatabase();

        //Create a view to write user details
        UserView view = new UserView();

        UserController controller = new UserController(model, view);

        controller.updateView();

        //updating the data of the model
        controller.setUserName("notaracecar");

        controller.updateView();



        //Post Driver
        Post model2 = new retrievePost();
        PostView view2 = new PostView();
        PostController controller2 = new PostController(model2, view2);

        controller2.updateView();

        //updating contents
        controller2.setPostDescription("Sike that was not my first post.");

        controller2.updateView();
    }

    private static User retrieveUserFromDatabase(){
        User user = new User();
        User.setUserName("racecar123");
        User.setPassword("Thisismypassword1");
        User.setEmail("racecarsgofast@gmail.com");
        User.setPhoneNumber("9161234567");
    }

    private static Post retrievePost(){
        Post post = new Post();
        User.setPostID(123456);
        User.setPostDescription("This is my first post!");
        User.setPicture(999);
    }
}