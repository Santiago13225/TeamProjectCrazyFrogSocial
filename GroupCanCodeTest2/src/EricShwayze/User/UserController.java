public class UserController{
    private User model;
    private UserView view;

    public UserController(User model, UserView view){
        this.model = model;
        this.view = view;
    }

    //Setter Methods using MVC
    public void setUserName(String userName){
        model.setUserName(userName);
    }

    public void setpassword(String password){
        model.setPassword(password);
    }

    public void setUserName(String email){
        model.setEmail(email);
    }

    public void setUserName(String phoneNumber){
        model.setPhoneNumber(phoneNumber);
    }

    //Getter Methods using MVC
    public String getUserName(){
        return model.getUserName;
    }

    public String getPassword(){
        return model.getPassword;
    }

    public String getEmail(){
        return model.getEmail;
    }

    public String getPhoneNumber(){
        return model.getPhoneNumber;
    }

    public void updateView(){
        view.printUserDetails(model.getUserName(), model.getEmail(), model.getPhoneNumber())
    }
}