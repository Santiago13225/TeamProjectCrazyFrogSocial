package TeamProject;
class Post {
    private String user;
    //Temp placeholder for img
    private int picture;
    private int postID;
    private String postDescription;
    //Temp placeholder for img
    public Post(int postID, String postDescription, int picture){
        this.postID = postID;
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

    //setter methods
    public void setPostID(int postID){
        this.postID = postID;
    }

    public void setPostDescription(String description){
        this.desciption = desciption;
    }

    public void setPicture(int picture){
        this.picture = picture;
    }

    //getter Methods
    public int getPostID(){

    }

    public String getPostDescription(){

    }

    public int getPicture(){
        return picture;
    }
}
