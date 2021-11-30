package Post;
public class Comment extends Post{
    private String postComment;
    private String editComment;
    private String deleteComment;
     public Comment(){}
     public Comment(String postID, String postComment) {
         this.postComment = postComment;
         this.editComment = editComment;
         this.deleteComment = deleteComment;
     }
     public void createComment(String comment){
        //Pop up confirming that comment was created
        System.out.println("Comment created");
     }
    public void deleteComment(){
    /* remove comment */

    }
    public void editComment(){
        //edit comment made by user
    }
    }

