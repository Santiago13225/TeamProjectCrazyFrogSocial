package TeamProject;
import java.io.*;//Needed for file exceptions.
import java.util.*;//Needed for scanners and text files.

public class TeamProjectTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		System.out.println("Welcome to Git!");
		System.out.println("yang - This line was added by Dr. Yang.");
		// Add a new line with your information
		System.out.println("301118090 - This line was added by Santiago Bermudez.");
		System.out.println("301719561  - This line was added by Dane Coleman.");
		System.out.println("219318451 - This line was added by Eric Truong.");
		System.out.println("301455713 - This line was added by Matthew Petruescu.");
		System.out.println("SacStateID - This line was added by Tyler Ito.");
		System.out.println("SacStateID - This line was added by Christian Long.");
		System.out.println("SacStateID - This line was added by Ramo Tucakovic.");
		System.out.println("219456940 - This line was added by Enoch Hsu.");
		System.out.println("SacStateID - This line was added by First name Last name.");
		*/
		System.out.print("CrazyFrog Social **ALPHA VERSION** : \n");
		//Login c = new CrazyFrogSignIn();
		Login cc = new CrazyFrogSignIn("santiACC1", "password1");
		//Login.LoginMethod();
		System.out.println("CrazyFrogSignIn: " + cc.toString());

		// CustomLogin cfSignIn = new CustomLogin("usernames.txt"); //create the directory
		// interpretChoice(cfSignIn); // run the menu and interpret choices

	}
	/*
	 public static char run(char cond, String phrase, Scanner console, char option){//Receives input.
	      return process(cond, phrase, console, option);//Sends input elsewhere for processing.
	   }
	   public static void printMenu(){//Shows program functions to user.
		  System.out.print("CrazyFrog Social **ALPHA VERSION** : \n");
	      System.out.print(" w - To Find the Number of Words\n");
	      System.out.print(" f - To Conduct a Full-Text Search\n");
	      System.out.print(" r - To Replace Slang/Acronyms\n");
	      System.out.print(" q - Quit Program\n");
	      System.out.println();
	   }
	   public static char process(char cond, String phrase, Scanner console, char option){//Calls other methods based on user request.
	      char w = 'w';
	      char f = 'f';
	      char r = 'r';
	      char q = 'q';
	   
	      if(option == w){
	         System.out.println("\nValid input: " + (option == w) + "\n");
	         getNumWords(phrase);//Gets number of words. Holds a modified version of a previous assignment.
	      }
	      if(option == f){
	         System.out.println("\nValid input: " + (option == f) + "\n");
	         System.out.print("Please enter a word or phrase to search: ");//Prompts for user input.
	         String search = console.nextLine();
	         findText(search, phrase);//Calls method that functions as a search tool.
	      }
	      if(option == r){
	         System.out.println("\nValid input: " + (option == r) + "\n");
	         replaceAcronyms(phrase);//Calls method that replaces acronyms.
	      }
	      if(option == q){//Sends 'q' back to while loop, terminating program.
	         System.out.println("\nValid input: " + (option == q) + "\n");
	         System.out.println("[ PROGRAM TERMINATED ]");
	      }
	      return option;//Terminates function and returns to the caller of the function.
	   }
	   public static int getNumWords(String phrase){//Counts the words entered by user, regardless of spaces.
	      if (phrase == null || phrase.isEmpty()){//Checks if the user entered nothing.
	         System.out.println("\n[ NO INPUT REGISTERED ]\n\n");//The response if the user entered nothing.
	         return 0;//Return statement.
	      }
	      String[] words = phrase.split("\\s+");//Counts words based on space placement.
	      System.out.println("This string has " + words.length + " word(s).\n");//Tells user how many words were used.
	      return words.length;//Return statement.
	   }  
	   public static int findText(String search, String phrase){//Should be case sensitive. Allows for text search.
	      String value = phrase;//Reassigns String, just in case.
	      String res = search;//Reassigns user search, also just in case.
	      int index = value.indexOf(res);//Used for text position.
	      if(index != -1)//If text can be found.
	         System.out.println("\"" + res + "\" found at position " + index + ".\n");
	      else{//If text cannot be found or is misusing lowercase and uppercase letters.
	         System.out.println("\"" + res + "\"" + " not found.\n");
	      }
	      return index;//Returns index value, if applicable.
	   }
	   public static String replaceAcronyms(String phrase){//Fixes all acronyms.
	      System.out.println("Original text: " + phrase);
	      String fix1 = phrase.replace("IDK", "I don't know");//Statement that checks for 'IDK'.
	      String fix2 = fix1.replace("IMO", "in my opinion");//Statement that checks for 'IMO'.
	      String fix3 = fix2.replace("TTYL", "talk to you later");//Statement that checks for 'TTYL'.
	      System.out.println("Revised text: " + fix3 + "\n");//Outputs revised text.
	      return fix3;//Returns revised String.
	   }
	}


	
	
	
	
	
	
	
	*/
	
	
	
	

	/**
	 * A class that represents a phone directory program and its functions. Here, the user must pass to the
	 * constructors the data to be used on each HashMap of contacts and numbers. Each directory object keeps
	 * track of its own contact names, each with their own numbers.
	 * The possible values can only be String names and String representations of numbers.
	 * Subsequent calls simply create other directories.
	 * 
	 * @author Santiago A. Bermudez
	 * @version 1 April 2020
	 */
	/*
	public static char interpretChoice(CustomLogin cfSignIn)throws FileNotFoundException{
	      char cond = ' ';//Initial condition value.
	      while (cond != 'q' && cond != 'Q') {//While loop that runs until user quits.
	         Scanner console = new Scanner(System.in);//Scanner to take user input.
	         printMenu();//Prints menu options.
	         System.out.print("Please Enter Your Choice: ");
	         char option = console.next().charAt(0);//Used to register only one letter for menu options.
	         console.nextLine();//Clears console and is used for text search method improvement.
	         cond = process(console, option, cfSignIn);//Allows for the processing of user option.
	         //cond = process(p, console, option);//Allows for the processing of user option.
	      }
	      return cond;//cond is short for 'condition'. It is needed for the while loop.
	   }
	   public static void printMenu(){//Shows program functions to user.
	      System.out.println();
	      System.out.print("CrazyFrog Social **ALPHA VERSION** Menu Options: \n");
	      System.out.print(" Enter A to Add a Contact\n");
	      System.out.print(" Enter F to Sign In With CrazyFrog\n");
	      System.out.print(" Enter R to Remove a Contact\n");
	      System.out.print(" Enter D to Display all Contacts\n");
	      System.out.print(" Enter S to Search for a Contact\n");
	      System.out.print(" Enter C to Change a Contact's Information\n");
	      System.out.print(" Enter M to Merge Directories\n");
	      System.out.print(" Enter Q to Quit Program\n");
	      System.out.println();
	      }
	   public static char process(Scanner console, char option, CustomLogin cfSignIn)throws FileNotFoundException{//Calls other methods based on user request.
	      char a = 'a';
	      char f = 'f';
	      char r = 'r';
	      char d = 'd';
	      char s = 's';
	      char c = 'c';
	      char m = 'm';
	      char q = 'q';
	      char A = 'A';
	      char F = 'F';
	      char R = 'R';
	      char D = 'D';
	      char S = 'S';
	      char C = 'C';
	      char M = 'M';
	      char Q = 'Q';
	   
	      if(option == a){
	         System.out.println("\nValid input: " + (option == a) + "\n");
	         addContact(console, cfSignIn);//Method that adds contacts.
	      }
	      if(option == A){
	         System.out.println("\nValid input: " + (option == A) + "\n");
	         addContact(console, cfSignIn);//Method that adds contacts.
	      }
	      
	      if(option == f){
	         System.out.println("\nValid input: " + (option == f) + "\n");
	         addContact(console, cfSignIn);//Method that adds contacts.
	         
	         
	         
	      }
		  if(option == F){
	         System.out.println("\nValid input: " + (option == F) + "\n");
	         addContact(console, cfSignIn);//Method that adds contacts.
	      }
	      
	      if(option == r){
	         System.out.println("\nValid input: " + (option == r) + "\n");
	         removeContact(console, cfSignIn);//Method that removes contacts.
	      }
	      if(option == R){
	         System.out.println("\nValid input: " + (option == R) + "\n");
	         removeContact(console, cfSignIn);//Method that removes contacts.
	      }
	      if(option == d){
	         System.out.println("\nValid input: " + (option == d) + "\n");
	         displayContact(cfSignIn);//Method that displays all data.
	      }
	      if(option == D){
	         System.out.println("\nValid input: " + (option == D) + "\n");
	         displayContact(cfSignIn);//Method that displays all data.
	      }
	      if(option == s){
	         System.out.println("\nValid input: " + (option == s) + "\n");
	         findContact(console, cfSignIn);//Method that finds a contact and its info.
	      }
	      if(option == S){
	         System.out.println("\nValid input: " + (option == S) + "\n");
	         findContact(console, cfSignIn);//Method that finds a contact and its info.
	      }
	      if(option == c){
	         System.out.println("\nValid input: " + (option == c) + "\n");
	         editContact(console, cfSignIn);//Method that changes contact info.
	      }
	      if(option == C){
	         System.out.println("\nValid input: " + (option == C) + "\n");
	         editContact(console, cfSignIn);//Method that changes contact info.
	      }
	      if(option == m){
	         System.out.println("\nValid input: " + (option == m) + "\n");
	         mergeDirectories(cfSignIn);//Method that merges directories.
	      }
	      if(option == M){
	         System.out.println("\nValid input: " + (option == M) + "\n");
	         mergeDirectories(cfSignIn);//Method that merges directories.
	      }
	      if(option == q){//Sends 'q' back to while loop, terminating program.
	         System.out.println("\nValid input: " + (option == q) + "\n");
	         System.out.println("[ PROGRAM TERMINATED ]");
	      }
	      if(option == Q){//Sends 'q' back to while loop, terminating program.
	         System.out.println("\nValid input: " + (option == Q) + "\n");
	         System.out.println("[ PROGRAM TERMINATED ]");
	      }
	      return option;//Terminates function and returns to the caller of the function.
	   }
	   public static void addContact(Scanner console, CustomLogin cfSignIn){//Takes directory and adds a contact to it.
	      System.out.print("Please Enter your Contact's First and Last Name: ");
	      String name = console.nextLine();//Prompts for sample text.
	      System.out.print("Please Enter your Contact's Phoe Number in XXX-XXX-XXXX format: ");
	      String number = console.nextLine();//Prompts for sample text.
	      cfSignIn.add(name, number);
	   }
	   public static void removeContact(Scanner console, CustomLogin cfSignIn){//Takes directory and removes a contact from it.
	      System.out.print("Please Enter your Contact's First and Last Name: ");
	      String name = console.nextLine();//Prompts for sample text.
	      if(cfSignIn.directory.containsKey(name)){//If Directory has a certain key.
	    	  cfSignIn.delete(name);
	         System.out.println(name + " removed from directory.");
	      }else{
	         System.out.println(name + " not found in directory.");
	      }
	   }
	   public static void displayContact(CustomLogin cfSignIn){//Takes directory displays all its contacts.
		   cfSignIn.displayCustomLogin();
	   }
	   public static void findContact(Scanner console, CustomLogin cfSignIn){//Takes directory and finds a contact.
	      System.out.print("Please Enter your Contact's First and Last Name: ");
	      String name = console.nextLine();//Prompts for sample text.
	      if(cfSignIn.directory.containsKey(name)){//If Directory has a certain key.
	         System.out.println(name + "'s phone number: " + cfSignIn.getPhoneNumber(name));
	      }else{
	         System.out.println(name + " not found in directory.");
	      }
	   }
	   public static void editContact(Scanner console, CustomLogin cfSignIn){//Takes directory and edits a contact.
	      System.out.print("Please Enter your Contact's First and Last Name: ");
	      String name = console.nextLine();//Prompts for sample text.
	      if(cfSignIn.directory.containsKey(name)){//If Directory has a certain key.
	         System.out.print("Please Enter your Contact's New Number in XXX-XXX-XXXX format: ");
	         String newNumber = console.nextLine();//Prompts for sample text.
	         cfSignIn.change(name, newNumber);
	         System.out.println(name + "'s phone number set to: " + cfSignIn.getPhoneNumber(name));
	      }else{
	         System.out.println(name + " not found in directory.");
	      }
	   }
	   public static void mergeDirectories(CustomLogin cfSignIn)throws FileNotFoundException{//Takes directory and merges it with another.
		   cfSignIn.merge("update.txt");
	   }
	   */
}