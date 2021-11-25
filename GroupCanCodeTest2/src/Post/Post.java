package TeamProject;
class Post {
    private String user;
    private String postDescription;
    private int picture;
    private int postID;

    public Post(){}
    public Post(String user, String postDescription, int picture) {
        this.user = user;
    }

    public Post(int postID, String postDescription, int picture) {
        this.postID = postID;
        this.postDescription = postDescription;
        this.picture = picture;
    }

    //Create post method
    public void createPost(Post user, Post Description, Post picture) {
        //yes or no pop up that confirms creating post
        System.out.println("Post Successfully Created");
    }

    //Delete Post Method
    public void deletePost(int postID, String desciption, int picture) {
        if (postID == postID) {
            //remove postID
        }
    }

}

