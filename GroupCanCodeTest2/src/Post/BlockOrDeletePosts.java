package Post;

public class BlockOrDeletePosts {

	String post_ID;

	public static void blockPost() {
		System.out.println("Post Blocked");
        System.out.println("Your post violates app policies! If you would like to appeal, please contact us.");
	}
	
	public static void unblockPost() {
		System.out.println("Your appeal was successful! You may now view your post again.");
	}
	
	//update
} 