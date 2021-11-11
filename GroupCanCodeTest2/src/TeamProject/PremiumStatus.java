package TeamProject;
class PremiumStatus{
    private boolean Premium;

    PremiumStatus(){
        Premium = true;
    }
    public static void Advertising(){
        User.showAds(Premium);
    }

}