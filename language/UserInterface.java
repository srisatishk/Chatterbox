package language;
/*
 * @author Gracie
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {

/*
 * UI attributes
 */
private String sentenceStructure;
    private Category currentCategory;
    private int progressInLanguage;
    private HashMap<Word, String> translation;
    private ArrayList<Category> categories;
    private ArrayList<String> languages;
    private ArrayList<Word> wordList;
    private ArrayList<Phrase> phraseList;
    private int languageID;
    private User currentUser;
    private ArrayList<User> userList; 

    /**
     * Constructor for UI
     */
    public UserInterface() {
        this.languages = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.userList = new ArrayList<>();
    }

    /**
     * login method
     * @param username The username
     * @param password The password
     * @return true (placeholder)
     */
    public boolean login(String username, String password) {
        System.out.print("Login for user: " + username);
        return true;

    }

     /**
     * createAccount method 
     * asks user for information then creates a User object
     */
    public void createAccount() {
        System.out.println("Creating account...");
        
        System.out.print("Enter your first name: ");
        
        System.out.print("Enter your last name: ");
        
        System.out.print("Enter your email: ");
        
        System.out.print("Enter a username: ");
        
        System.out.print("Enter a password: ");
    }

     /**
     * choices method 
     * lists choices of languages and categories lets user choose one
     */
    public void choices() {
        System.out.print("Choose what language you want to start.");
        System.out.print("Choose what category you want to start.");
    }


     /**
     * progressLearning method 
     * tracks what the user has learned
     */
    public void progressLearning() {
        System.out.print("Tracking the progress of what the user has learned.");
    }

     /**
     * chooseGames method 
     * lists games and prompts user to choose one
     */
    public void chooseGames() {
        System.out.print("List of exercises in category: ");
        System.out.print("Choose an exercise: ");
        System.out.println("You have selected: ");
        System.out.println("Invalid choice. Please try again.");
    }

     /**
     * chooseStory method 
     * lists stories and prompts user to choose one
     */
    public void chooseStory() {
        System.out.println("List of stories: ");
        System.out.print("Choose a story: ");
        System.out.println("You have selected: ");
        System.out.println("Invalid choice. Please try again.");
    }

    /**
     * wantToQuit method
     * asks if user wants to quit program
     * @return boolean if user wants to quit
     */
    public boolean wantToQuit() {
        System.out.println("Checks if the user wants to quit.");
        return true;
    }

}
