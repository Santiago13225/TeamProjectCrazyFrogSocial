package TeamProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Comment implements Post{
	private String date;
	private String postContent;
	private int image;
	private int likes;
	private int dislikes;
	private List<Comment> subcomments;
	
	
	public Comment(String postContent, int image) {
		Date date = new Date();
		this.date = date.toString();
		this.postContent = postContent;
		this.image = image;
		this.likes = 0;
		this.dislikes = 0;
		subcomments = new ArrayList<Comment>();
	}
	
	public Comment(String postContent) {
		Date date = new Date();
		this.date = date.toString();
		this.postContent = postContent;
		this.likes = 0;
		this.dislikes = 0;
		subcomments = new ArrayList<Comment>();
	}
	
	public Comment(int image) {
		Date date = new Date();
		this.date = date.toString();
		this.image = image;
		this.likes = 0;
		this.dislikes = 0;
		subcomments = new ArrayList<Comment>();
	}

	public void add(Comment c) {
		subcomments.add(c);
	}
	
	public void addLike() {
		this.likes = this.likes + 1;
	}
	
	public void removeLike() {
		this.likes = this.likes - 1;
	}
	
	public void addDislike() {
		this.dislikes = this.dislikes + 1;
	}
	
	public void removeDislike() {
		this.dislikes = this.dislikes - 1;
	}
	
	public void remove(Comment c) {
		subcomments.remove(c);
	}

	public List<Comment> getSubComments(){
		return subcomments;
	}

	public String toString(){
		return ("Date: " + date + "\n Image: " + image + "\n Comment: " + postContent + "\n Likes: " + likes + "\n Dislikes: " + dislikes);
	}

}

/*
public class Comment {
    
    private String user;
    private String postComment;
    private String editComment;
    private String deleteComment;
    
    public Comment(String user, String postComment, String editComment, String deleteComment){
        this.user = user;
        this.postComment = postComment;
        this.editComment = editComment;
        this.deleteComment = deleteComment;
    }
    public void createComment(String user, String postComment){
        //Pop up confirming that comment was created
        System.out.println("Comment created");
    }
*/
/*
    //Delete Comment Method
    public void deleteComment(String user, String deleteComment){
    /* remove comment */

    //}
/*
    public void editComment(String user, String editComment) {
        //edit comment made by user
    }
}
*/
