package TylerSantiago;

public class CommentDriver {
	public static void main(String[] args) {
	   
		Comment Haweewee = new Comment("Going to Haweewee with the boys!", 3);
		
		Comment Africa = new Comment("We are all familiar with the country, Africa. Yet at the same time we know little about them"
				+ " all we know is that it is hot there. African Americans live there and they are really poor. This begs the"
				+ " question, why is Africa that poor?");
		
		Comment LowIq = new Comment("Do we born with intelligent?");
		
		Comment TwoImages = new Comment(2);
		Comment ThreeImages = new Comment(3);
		
		Comment WiseQuote = new Comment("If at first you don't succeed, then you are obviously not me!");
		Comment InspirationalQuote = new Comment("Carry on!");
		
		Haweewee.addLike();
		Africa.addDislike();
		
		Haweewee.add(Africa);
		Haweewee.add(LowIq);
		
		Africa.add(WiseQuote);
		Africa.add(InspirationalQuote);
		LowIq.add(TwoImages);
		LowIq.add(ThreeImages);

	    //print all employees of the organization
	    System.out.println(Haweewee); 
	      
	    for (Comment topComment : Haweewee.getSubComments()) {
	    	System.out.println(topComment);
	         
	        for (Comment comment : topComment.getSubComments()) {
	        	System.out.println(comment);
	        }
	    }	
	}
}
