package EricShwayze.User;

public class UserView{
    UserView(){}
    public void printUserDetails(String userName, String email, String phoneNumber){
        System.out.println("User: ");
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}