package EricShwayze.User;

public class PostView{
    public PostView(){}
    public void printPostDetails(int postID, String postDescription, int picture){
        System.out.println("Post: ");
        System.out.println("Post ID: " + postID);
        System.out.println("Post Description: " + postDescription);
        System.out.println("Post Picture: " + picture);
    }
}