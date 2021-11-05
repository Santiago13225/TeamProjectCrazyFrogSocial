package TeamProject;
class Post {
    private String postDescription;
    //Temp placeholder for img
    private int picture;
    public Post(String postDescription, int picture){
        this.postDescription = postDescription;
        this.picture = picture;
    }

    //Delete Post Method
    public void deletePost(Post post){
        //We would remove the post from the database and also remove it from our profile.
    }
}
