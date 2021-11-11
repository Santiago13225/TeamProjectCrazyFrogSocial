package TeamProject;
import java.util.Scanner;
public class socialGroups {
  
  private int accountID; 
  /* 
      user uses search bar
      user types in what they want to search
      fetches information from database using related account ID
      Pop up: related contents pertaining to user input
      if database can't find anything: relay to user that there was no match
      if user wants to create a new social group, allow user to do so unless a name was already taken
 */
  
  public void searchBar() {
    Scanner userInput = new Scanner(System.in);


        String input = userInput.nextLine();
        System.out.println(input + "'");

     /*   if input is found, show results and allow user to request or join groups. 
          else if show error for "no match"
          else don't do anything if device doesn't detect any input    
     */    
    
    }
  
   public void createGroup() {
    Scanner userInput = new Scanner(System.in);


        String input = userInput.nextLine();
        System.out.println(input + "'");

     /*   if name is unique, create group 
          else show error for "name already taken"
     */    
   }
}
