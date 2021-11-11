package TeamProject;
class Post {
    private String user;
    private String postDescription;
    //Temp placeholder for img
    private int picture;
    public Post(String user, String postDescription, int picture){
        this.user = user;
        this.postDescription = postDescription;
        this.picture = picture;
    }

    //Create post method

    public void createPost(Post user, Post Description, Post picture){
        //yes or no pop up that confirms creating post
        System.out.println("Post Successfully Created");
    }
    //Delete Post Method
    public void deletePost(Post post){
        //We would remove the post from the database and also remove it from our profile.
    }
}
