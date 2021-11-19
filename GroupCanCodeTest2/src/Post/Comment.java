package TeamProject;
public class Comment {
    
    private String user;
    private String postComment;
    private String editComment;
    private String deleteComment;
    
     public Comment(String user, String postComment, private String editComment, private String deleteComment){
        this.user = user;
        this.postComment = postComment;
        this.editComment = editComment;
        this.deleteComment = deleteComment;
        
     public void createComment(user, postComment){
        //Pop up confirming that comment was created
        System.out.println("Comment created");
    }
    
    //Delete Comment Method
    public void deleteComment(user, deleteComment){
    /* remove comment */

    }

    public void editComment(user, editComment){
        //edit comment made by user
    }
}
}
