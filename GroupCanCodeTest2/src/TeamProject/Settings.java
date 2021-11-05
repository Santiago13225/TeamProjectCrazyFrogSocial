package TeamProject;
class Settings{
    private String newUsername;
    private String newPassword;
    private int privacySetting;
    private int layoutValue;

    Settings(){} //default constructor
    public void changeUsername(String newUsername){
        this.newUsername = newUsername;

    }
    public void changePassword(String newPassword){
        this.newPassword = newPassword;
    }
    public void changeLayout(int layoutValue){
     /*   CrazyFrogLayouts userLayout = new CrazyFrogLayouts(); //a new class called CrazyFrogLayouts which handles the layout settings
          userLayout.changeLayout(layoutValue); //delegates to the method in CrazFrogLayouts
          //(Design example - Aggregation)
      */
    }
    public void changePrivacy(int privacySetting){
        //Need a privacysettings class
        //delegate the int privacySetting to the privacysettings class? //aggregation? 
    }
}