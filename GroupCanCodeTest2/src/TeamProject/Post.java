package TeamProject;
class Post {
<<<<<<< HEAD
    private String user;
    private String postDescription;
    //Temp placeholder for img
    private int picture;
    public Post(String user, String postDescription, int picture){
        this.user = user;
=======
    private int postID;
    private String postDescription;
    //Temp placeholder for img
    private int picture;
    public Post(int postID, String postDescription, int picture){
        this.postID = postID;
>>>>>>> 70a7b29d4ac45146a3f8ed12a90254474c66c6d5
        this.postDescription = postDescription;
        this.picture = picture;
    }

    //Create post method

    public void createPost(Post user, Post Description, Post picture){
        //yes or no pop up that confirms creating post
        System.out.println("Post Successfully Created");
    }
    //Delete Post Method
    public void deletePost(int postID, String desciption, int picture){
        if(postID == postID){
    //remove postID
}
    }

    public void searchProfile(int postID){
        //Scan for user input
        //Check if user exists in the database using an if statement
        //Show the profile if it exists, if it does not exists show nothing or an error.
    }

}
