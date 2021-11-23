public class PostController{
    private Post model;
    private Post view;

    public PostController(Post model, Post view){
        this.model = model;
        this.view = view;
    }

    public void setPostID(int postID){
        model.setPostID(postID);
    }

    public void setPostDescription(String postDescription){
        model.setPostDescription(postDescription);
    }

    public void setPicture(int picture){
        model.setPicture(picture);
    }

    public int getPostID(){
        return model.getPostID();
    }

    public String getPostDescription(){
        return model.getPostDescription();
    }

    public int getPicture(){
        return model.getPicture();
    }


    public void updateView(){
        view.printPostDetails(model.getPostID(), model.getPostDescription(), model.getPicture());
    }
}